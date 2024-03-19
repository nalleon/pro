package es.ies.puerto.impl.listas;

import es.ies.puerto.listas.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    List<String> userList;


    @BeforeEach
    public void beforeEach(){
        ejercicio3 = new Ejercicio3();
        userList = new ArrayList<>();
        userList = Arrays.asList("test", "junit", "java");
        ejercicio3.setStrList(userList);
    }

    @Test
    public void getSetTest(){
        List<String> updatedList = Arrays.asList("testing", "user");
        ejercicio3.setStrList(updatedList);

        Assertions.assertEquals(updatedList, ejercicio3.getStrList(), "Expected result not found");
    }

    //@Test
    public void addDeleteDuplicatesTest (){
        String duplicate = "test";
        Assertions.assertTrue(ejercicio3.addDuplicates(duplicate), "Expected result not found");
        Assertions.assertTrue(ejercicio3.addDuplicates("user"), "Expected result not found");

        Assertions.assertTrue(ejercicio3.eliminateDuplicates(duplicate), "Expected result not found");
    }

    //@Test
    public void listWithOutDuplicates(){
        String duplicate = "test";
        String result = "";
        Assertions.assertEquals(result, ejercicio3.listWithOutDuplicates(duplicate), "Expected result not found");
    }
}
