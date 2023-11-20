package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 Ejercicio7 = new Ejercicio7();

    int[] arrayOfVarious = {1, 2, 4, 5, 6};

    @Test
    public void binarySearchTest1OK () {
        int value = 2;
        int result = Ejercicio7.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(1,result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest2OK () {
        int value = 1;
        int result = Ejercicio7.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(0, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest4OK () {
        int value = 4;
        int result = Ejercicio7.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(2, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchTest5OK () {
        int value = 5;
        int result = Ejercicio7.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(3, result, "The expected result is not found.");
    }
    @Test
    public void binarySearchNotFoundTestOK () {
        int value = 9;
        int result = Ejercicio7.binarySearch(arrayOfVarious, value);
        Assertions.assertEquals(-1, result, "The expected result is not found.");
    }
}

