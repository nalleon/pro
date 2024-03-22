package es.ies.puerto.tarea5.file.interfaces;

import es.ies.puerto.tarea5.impl.Persona;

import java.util.List;

public interface ICrud {

    List<Persona> obtainPersonas();
    Persona obtainPersona(Persona persona);
    boolean addPersona(Persona persona);
    boolean removePersona(Persona persona);

    boolean updatePersona(Persona persona);

    void saveFile(List<Persona> personaList);

    void loadBackUp();
}
