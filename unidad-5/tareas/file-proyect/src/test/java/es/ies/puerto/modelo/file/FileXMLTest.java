package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileXMLTest {
    FileXML fileXML;
    List<Persona> personaList;

    @BeforeEach
    public void beforeEach(){
        fileXML = new FileXML();
        personaList = new ArrayList<>();
        personaList = fileXML.obtainPersonas();
    }

    @Test
    public void obtainPersonasListTest(){
        Assertions.assertFalse(personaList.isEmpty(),
                "Expected result not found");
    }

    @Test
    public void obtainPersonaListTest(){
        Persona personaFind = new Persona(2);
        personaFind = fileXML.obtainPersona(personaFind);
        Assertions.assertEquals(personaFind.getId(), 2,"Expected result not found");
        Assertions.assertNotNull(personaFind.getName(), "Expected result not found");
        Assertions.assertTrue(personaFind.getAge() > 0, "Expected result not found");
        Assertions.assertNotNull(personaFind.getEmail(), "Expected result not found");
    }
}
