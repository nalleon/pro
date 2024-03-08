package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.core.Persister;
import java.io.File;
import java.util.List;

public class FileXml extends UtilidadesClass implements ICrudOperaciones {

    List<Persona> personas;
    String path="src/main/resources/data.xml";
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
        int posicion =  personas.indexOf(persona);
        if (posicion > 0 ) {
            return personas.get(posicion);
        }
        return null;
    }

    @Override
    public void addPersona(Persona persona) {
        personas.add(persona);
        PersonaList personaList = new PersonaList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deletePersona(Persona persona) {
        personas.remove(persona);
        PersonaList personaList = new PersonaList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updatePersona(Persona persona) {
        int posicion =  personas.indexOf(persona);
        if (posicion < 0 ) {
            return;
        }
        personas.set(posicion,persona);
        PersonaList personaList = new PersonaList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(personaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
