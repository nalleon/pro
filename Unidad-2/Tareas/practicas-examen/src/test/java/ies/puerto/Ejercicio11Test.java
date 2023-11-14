package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio11Test {

    Ejercicio11 ejercicio11 = new Ejercicio11();

    @Test
    public void showNumbersTest (){
        int number = 1;
        int result = ejercicio11.showNumbers(number);
        int resultOK = 123;
        Assertions.assertEquals(resultOK, result, "Expected result not found");


    }
}
