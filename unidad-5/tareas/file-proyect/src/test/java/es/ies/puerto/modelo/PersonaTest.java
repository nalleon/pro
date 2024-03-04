package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonaTest {
    Persona persona;
    int id = 1;
    String name = "name";
    int age=18;
    String email="test@test.com";
    String nameUpdate = "nameUpdate";
    int ageUpdate=20;
    String emailUpdate="testupdate@test.com";
    List<Persona> personaList;

    @BeforeEach
    public void beforeEach(){
        persona = new Persona(id,name,age,email);
        personaList = new ArrayList<>();
        personaList.add(persona);
    }

    @Test
    public void createPersonaTest(){
        Assertions.assertNotNull(persona, "Object can not be null");
    }

    @Test
    public void toStringPersonaTest(){
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)), "Expected result not found");
        Assertions.assertTrue(persona.toString().contains(name), "Expected result not found");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(age)), "Expected result not found");
        Assertions.assertTrue(persona.toString().contains(email), "Expected result not found");
    }


    @Test
    public void equalsPersonaTest(){
        Persona personaFind = new Persona(id);
        Assertions.assertEquals(personaFind, persona, "Objects must be the same");
    }

    @Test
    public void notEqualsPersonaTest(){
        Persona personaFind = new Persona(3);
        Persona personaNull = null;
        Assertions.assertNotEquals(personaFind, persona, "Objects must NOT be the same");
        Assertions.assertNotEquals(personaNull, persona, "Objects must NOT be the same");

    }

    @Test
    public void toCSVPersonaTest(){
        Assertions.assertTrue(persona.toCSV().contains(String.valueOf(id)), "Expected result not found");
        Assertions.assertTrue(persona.toCSV().contains(name), "Expected result not found");
        Assertions.assertTrue(persona.toCSV().contains(String.valueOf(age)), "Expected result not found");
        Assertions.assertTrue(persona.toCSV().contains(email), "Expected result not found");
        Assertions.assertTrue(persona.toCSV().contains(persona.DELIMITATOR), "Expected result not found");
    }

    @Test
    public void personaGetSetTest(){
        persona.setName(nameUpdate);
        persona.setAge(ageUpdate);
        persona.setEmail(emailUpdate);

        Assertions.assertEquals(id, persona.getId(), "Expected result not found");
        Assertions.assertEquals(nameUpdate, persona.getName(), "Expected result not found");
        Assertions.assertEquals(ageUpdate, persona.getAge(), "Expected result not found");
        Assertions.assertEquals(emailUpdate, persona.getEmail(), "Expected result not found");

    }
}
