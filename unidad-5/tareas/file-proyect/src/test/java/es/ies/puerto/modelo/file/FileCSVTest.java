package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileCSVTest {
    FileCSV fileCSV;
    List<Persona> personaList;
    Persona persona;

    @BeforeEach
    public void beforeEach(){
        fileCSV = new FileCSV();
        personaList = new ArrayList<>();
        personaList = fileCSV.obtainPersonas();
    }
    @Test
    public void obtainPersonasListTest(){
        Assertions.assertFalse(personaList.isEmpty(), "Expected result not found");
    }

    @Test
    public void obtainPersonaListTest(){
        Persona personaFind = new Persona(2);
        personaFind = fileCSV.obtainPersona(personaFind);
        Assertions.assertEquals(personaFind.getId(), 2,"Expected result not found");
        Assertions.assertNotNull(personaFind.getName(), "Expected result not found");
        Assertions.assertTrue(personaFind.getAge() > 0, "Expected result not found");
        Assertions.assertNotNull(personaFind.getEmail(), "Expected result not found");
    }

    @Test
    public void addPersonaTest(){
        String name = "nameOther";
        int age=18;
        String email="testOther@test.com";

        int numPeople = personaList.size();
        Persona personaInsert = new Persona(5, name,age,email);
        fileCSV.addPersona(personaInsert);
        personaList = fileCSV.obtainPersonas();
        int numPeopleInsert = personaList.size();

        Assertions.assertTrue(personaList.contains(personaInsert), "Expected result not found");
        Assertions.assertEquals(numPeople+1, numPeopleInsert, "Expected num not found");
    }

    @Test
    public void deletePersonaTest(){
        int numPeople = personaList.size();
        fileCSV.deletePersona(4);
        personaList = fileCSV.obtainPersonas();
        int numPeopleAfter = personaList.size();
        Assertions.assertEquals(numPeople-1, numPeopleAfter, "Expected result not found");
    }

    @Test
    public void updatePersonaTest(){

    }

}
