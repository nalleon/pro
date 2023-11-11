package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    int [] array = {2,1,3,4,6,5,8,7};
    int [] arrayTwo = {2,1,3,4,6,5,8,7};
    @Test
    public void bubbleSortTest (){
        String result = ejercicio2.bubbleSort(array);
        String resultOK = "[1, 2, 3, 4, 5, 6, 7, 8]";
        Assertions.assertEquals(resultOK, result, "Expected result was not found.");
    }
}
