package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio11Test {

    Ejercicio11 ejercicio11 = new Ejercicio11();

    @Test
    public void showNumbersTest (){
        int number = 1;
        String result = ejercicio11.showNumbers(number);
        String resultOK = "1 \n2 3 \n4 5 6 \n7 8 9 10 \n";
        Assertions.assertEquals(resultOK, result, "Expected result not found");


    }
}
