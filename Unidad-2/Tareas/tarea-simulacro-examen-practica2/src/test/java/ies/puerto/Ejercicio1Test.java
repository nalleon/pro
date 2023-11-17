package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
 Ejercicio1 ejercicio1 = new Ejercicio1();

    int[] arrayOfVarious = {1, 2, 4, 5, 6};

    @Test
    public void binarySearchTest1OK () {
        int value = 2;
        int result = ejercicio1.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(1,result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest2OK () {
        int value = 1;
        int result = ejercicio1.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(0, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest4OK () {
        int value = 4;
        int result = ejercicio1.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(2, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest5OK () {
        int value = 5;
        int result = ejercicio1.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(3, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchNotFoundTestOK () {
        int value = 9;
        int result = ejercicio1.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(-1, result, "The expected result is not found.");
    }
}
