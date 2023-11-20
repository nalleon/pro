package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();

    int [] array = {2,1,3,4,6,5,8,7};

    @Test
    public void bubbleSortTest (){
        int [] result = ejercicio8.bubbleSort(array);
        String resultOK = "[1, 2, 3, 4, 5, 6, 7, 8]";
        Assertions.assertArrayEquals(resultOK, result, "Expected result was not found.");
    }
}
