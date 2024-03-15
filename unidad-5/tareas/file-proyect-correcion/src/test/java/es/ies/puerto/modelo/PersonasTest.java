package es.ies.puerto.modelo;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class PersonasTest {
    int id = 1;
    String nombre = "nombre";
    int edad = 12;
    String email = "test@tet.com";

    Persona persona;
    PersonaList personaList;

    @BeforeEach
    public void beforeEach() {
        personaList =new PersonaList();
        persona = new Persona(id, nombre, edad, email);
    }

    @Test
    public void personasToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(persona, new File("src/main/resources/persona.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void xmlToPersonasTest() {
        Persister serializer = new Persister();
        try {
            File file = new File("src/main/resources/personas.xml");
            PersonaList personas = serializer.read(PersonaList.class, file);
            Assertions.assertNotNull(personas,
                    "Se ha obtenido un valor nulo");
            Assertions.assertFalse(personas.getPersonas().isEmpty(), "No ha obtenido una lista vacia");
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

}
