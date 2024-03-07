package es.ies.puerto.modelo.file;
import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCSV extends UtilidadesClass {
    String path="src/main/resources/data.csv";
    //TODO:
    // Verificar que el fichero existe
    // Leer el fichero
    // Transformar a Persona
    // Añadir a la lista

    public Persona obtainPersona(Persona persona) {
        int counter = 0;
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String string;
            while ((string = br.readLine()) != null && !found) {
                if (counter > 0) {
                    String[] data = string.split(DELIMITATOR);
                    int id = Integer.parseInt(data[0]);
                    if (id == persona.getId()) {
                        String name = data[1];
                        int age = Integer.parseInt(data[2]);
                        String email = data[3];
                        persona.setName(name);
                        persona.setAge(age);
                        persona.setEmail(email);

                        found = true;
                    }
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;
    }

    public List<Persona> obtainPersonas() {
        List<Persona> personaList = new ArrayList<>();
        int counter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String string;
            while ((string = br.readLine()) != null) {
                if (counter > 0) {
                    String[] data = string.split(DELIMITATOR);
                    int id = Integer.parseInt(data[0]);
                        String name = data[1];
                        int age = Integer.parseInt(data[2]);
                        String email = data[3];
                        Persona persona = new Persona(id, name,age,email);
                        personaList.add(persona);
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personaList;
    }

        public void addPersona (Persona persona){
            Persona personaFind = new Persona(persona.getId());
             //personaFind = obtainPersona(persona);
            if (personaFind.getEmail() == null){
                try (FileWriter writer = new FileWriter(path, true)) {
                    writer.write(persona.toCSV()+ "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        public void deletePersona(int id) {
        List<Persona> personas = obtainPersonas();
         try (FileWriter writer = new FileWriter(path)) {
             for (Persona persona : personas) {
                    if (persona.getId() != id) {
                    writer.write(persona.toCSV() + "\n");
                 }
             }
          } catch (IOException e) {
              e.printStackTrace();
            }
        }


    public void update(Persona persona) {
        List<Persona> personas = obtainPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            for (Persona p : personas) {
                if (p.getId() == persona.getId()) {
                    writer.write(persona.toCSV());
                } else {
                    writer.write(persona.toCSV());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
