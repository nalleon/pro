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
    public void addDeletePersonaTest(){
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
        fileCSV.deletePersona(personaInsert);
        personaList = fileCSV.obtainPersonas();
        Assertions.assertFalse(personaList.contains(personaInsert), "Expected num not found");
    }

    @Test
    public void updatePersonaTest() {
        int idUpdate = 2;
        Persona personaFind = new Persona(idUpdate);
        Persona personaUpdate = fileCSV.obtainPersona(personaFind);
        Persona personaBackup = fileCSV.obtainPersona(personaFind);
        personaUpdate.setName("sas");
        personaUpdate.setAge(12);
        personaUpdate.setEmail("test@test.com");
        fileCSV.update(personaUpdate);

        personaFind = fileCSV.obtainPersona(personaFind);
        Assertions.assertEquals(personaFind.toString(), personaUpdate.toString(),
                "Data must match");

        fileCSV.update(personaBackup);
    }

}
