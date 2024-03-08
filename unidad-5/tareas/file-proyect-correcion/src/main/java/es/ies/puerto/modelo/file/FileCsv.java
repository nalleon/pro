package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadesClass implements ICrudOperaciones {

    @Element(name = "personas")
    List<Persona> personas;
    String path="src/main/resources/data.csv";

    public List<Persona> obtenerPersonas() {
        List<Persona> personas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                String email = datos[3];
                Persona persona = new Persona(id, nombre, edad, email);
                personas.add(persona);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;

    }

    public Persona obtenerPersona(Persona persona) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                if (id == persona.getId()) {
                    String nombre = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    String email = datos[3];
                    persona.setNombre(nombre);
                    persona.setEdad(edad);
                    persona.setEmail(email);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;
    }

    public void addPersona(Persona persona) {
        Persona personaBuscar = new Persona(persona.getId());
        personaBuscar = obtenerPersona(personaBuscar);
        if (personaBuscar.getEmail() == null) {
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(persona.toCsv()+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePersona(Persona persona) {
        Persona personaBuscar = new Persona(persona.getId());
        List<Persona> personas = obtenerPersonas();
        personas.remove(persona);
        try (FileWriter writer = new FileWriter(path)) {
            for (Persona personaFile : personas) {
                writer.write(personaFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updatePersona(Persona persona) {
        List<Persona> personas = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            for (Persona personasFile : personas) {
                if (personasFile.equals(persona)) {
                    writer.write(persona.toCsv() + "\n");
                } else {
                    writer.write(personasFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
