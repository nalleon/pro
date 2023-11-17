package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {

    Ejercicio8 ejercicio8 = new Ejercicio8();

    int [] array = {5,1,2,3,4,5,6,6,7,8,9,9};

    @Test
    public void bubbleSortTestOK (){
        int [] result = ejercicio8.bubbleSort(array);
        int [] resultOK = {1,2,3,4,5,5,6,6,7,8,9,9};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");
    }
    @Test
    public void eliminateDuplicatesTestOK (){
        String  result = ejercicio8.eliminateDuplicates(array);
        String resultOK = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }

}
