package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {


    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void arraySumTestOK () {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10};
        int [] result = ejercicio3.arraySum(array1, array2);
        int [] resultOK = {7,9,11,13,15};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");
    }

    @Test
    public void arraySumNegativeTestOK () {
        int [] array1 = {-1,-2,-3,-4,-5};
        int [] array2 = {-6,-7,-8,-9,-10};
        int [] result = ejercicio3.arraySum(array1, array2);
        int [] resultOK = {-7,-9,-11,-13,-15};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");
    }

}
