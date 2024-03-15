package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml2 implements ICrudOperaciones {
    List<Persona> personas;
    String path="src/main/resources/data.xml";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public FileXml2 (){
        personas = new ArrayList<>();
    }
    @Override
    public List<Persona> obtenerPersonas() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            PersonaList personaList = serializer.read(PersonaList.class, file);
            personas = personaList.getPersonas();
            return personas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        if (!personas.contains(persona)){
            return null;
        }
        int posicion =  personas.indexOf(persona);
        return personas.get(posicion);
    }

    @Override
    public void addPersona(Persona persona) {
        if (personas.contains(persona)){
            return;
        }
        personas.add(persona);
        updateFile(personas);
    }

    @Override
    public void deletePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        personas.remove(persona);
        updateFile(personas);
    }

    @Override
    public void updatePersona(Persona persona) {
        if (!personas.contains(persona)) {
            return;
        }
        int posicion = personas.indexOf(persona);
        personas.set(posicion,persona);
        updateFile(personas);
    }

    private void updateFile(List<Persona> personas){
        PersonaList personaList = new PersonaList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
