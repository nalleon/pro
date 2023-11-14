package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void arrayMapperTestOK (){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int [] result = ejercicio2.arrayMapper(array);
        int [] resultOK = {1,2,3,4,5,6,7,8,9,10};
        Assertions.assertArrayEquals(resultOK, result, "Expected result was not found.");
    }
    @Test
    public void arrayMapperInterruptedTestOK (){
        int [] array = {1,2,3,4,5,6,7,-8,9,10};
        int [] result = ejercicio2.arrayMapper(array);
        int [] resultOK = {1,2,3,4,5,6,7};
        Assertions.assertArrayEquals(resultOK, result, "Expected result was not found.");
    }
}
