package es.ies.puerto.tarea5.file.impl;

import es.ies.puerto.tarea5.file.abstracts.FileAbstracts;
import es.ies.puerto.tarea5.file.interfaces.ICrud;
import es.ies.puerto.tarea5.impl.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataCsv extends FileAbstracts implements ICrud {

    List<Persona> personas;
    List<Persona> personasBackUp = obtainPersonas();
    @Override
    public List<Persona> obtainPersonas() {
        personas = new ArrayList<>();
        if (!fileExists(pathDataCsv)){
            return personas;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(pathDataCsv))){
            String str;
            boolean firstLine = true;
            while((str = br.readLine()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                String [] data = str.split(DELIMITER);
                Persona persona = splitElements(data);
                personas.add(persona);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personas;
    }


    public Persona splitElements(String [] data){
        return new Persona(data[0], Integer.parseInt(data[1]),data[2]);
    }

    @Override
    public Persona obtainPersona(Persona persona) {
        return null;
    }

    @Override
    public boolean addPersona(Persona persona) {
        return false;
    }

    @Override
    public boolean removePersona(Persona persona) {
        return false;
    }

    @Override
    public boolean updatePersona(Persona persona) {
        return false;
    }

    @Override
    public void saveFile(List<Persona> personaList) {
        try (FileWriter writer = new FileWriter(pathDataCsv)){
            if (fileExists(pathDataCsv)){
                writer.write("Nombre,Edad,Ciudad\n");
            }
            for (Persona personaFile : personaList){
                writer.write(personaFile.dataToCsv());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadBackUp() {
        saveFile(personasBackUp);
    }
}
