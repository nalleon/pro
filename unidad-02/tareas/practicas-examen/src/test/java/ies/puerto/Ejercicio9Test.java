package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;

public class Ejercicio9Test {

    Ejercicio9 ejercicio9 = new Ejercicio9();

    int [] array1 = {2,1,5,3,4};
    int [] array2 = {2,1,5,3,4};
    @Test
    public  void orderedArray (){
     int [] result = ejercicio9.orderedArray(array1, array2);
     int [] resultOK = {1,2,3,4,5,1,2,3,4,5};
        Assertions.assertArrayEquals(resultOK, result, "Expect result not found");

    }
}
