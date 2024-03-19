package es.ies.puerto.impl.listas;

import es.ies.puerto.listas.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1;

    @BeforeEach
    public void beforeEach(){
        ejercicio1 = new Ejercicio1();
    }

    @Test
    public void addStudentsNamesTest (){
        List<String> resultOK = new ArrayList<>(Arrays.asList("name", "name"));
        List<String> result = ejercicio1.addStudentsNames(2, "name");
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }

    @Test
    public void orderStudentsNames (){
        List<String> resultOK = new ArrayList<>(Arrays.asList("name", "name"));
        List<String> strList = ejercicio1.addStudentsNames(2, "name");
        List<String>  result = ejercicio1.orderStudentsNames(strList);
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
}
