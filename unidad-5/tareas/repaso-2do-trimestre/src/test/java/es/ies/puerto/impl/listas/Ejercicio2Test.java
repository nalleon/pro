package es.ies.puerto.impl.listas;

import es.ies.puerto.listas.Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2;
    List<String> userList;

    @BeforeEach
    public void beforeEach(){
        ejercicio2 = new Ejercicio2();
        userList = new ArrayList<>();
        userList = Arrays.asList("test", "junit", "java");
        ejercicio2.setUserList(userList);
    }

    @Test
    public void getSetTest(){
        List<String> updatedList = Arrays.asList("testing", "user");
        ejercicio2.setUserList(updatedList);

        Assertions.assertEquals(updatedList, ejercicio2.getUserList(), "Expected result not found");
    }
    @Test
    public void nameOnListTest(){
        Assertions.assertTrue(ejercicio2.nameOnList("test"), "Expected result not found");
        Assertions.assertFalse(ejercicio2.nameOnList("python"), "Expected result not found");

        List<String> emptyList = new ArrayList<>();
        ejercicio2.setUserList(emptyList);
        Assertions.assertFalse(ejercicio2.nameOnList("java"), "Expected result not found");

        List<String> nullList = null;
        ejercicio2.setUserList(nullList);
        Assertions.assertFalse(ejercicio2.nameOnList("java"), "Expected result not found");

        Assertions.assertFalse(ejercicio2.nameOnList(""), "Expected result not found");
    }

    @Test
    public void messageTest(){
        String messageT ="Name is in list";
        String messageF = "Name was not found in list";
        boolean nameOnListT = ejercicio2.nameOnList("java");
        boolean nameOnListF = ejercicio2.nameOnList("pyhton");

        Assertions.assertEquals(messageT, ejercicio2.message(nameOnListT), "Expected result not found");
        Assertions.assertEquals(messageF, ejercicio2.message(nameOnListF), "Expected result not found");
    }
}
