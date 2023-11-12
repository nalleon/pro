package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void findMaximumValueTestOK (){
        int [] array = {2,3,7,1};
        int result = ejercicio3.findMaximumValue(array);
        int resultOK = 7;
        Assertions.assertEquals(resultOK, result, "Expected value not found.");
    }
    @Test
    public void findMaximumValueNegativeTestOK (){
        int [] array = {-2,-3,-7,-1};
        int result = ejercicio3.findMaximumValue(array);
        int resultOK = -1;
        Assertions.assertEquals(resultOK, result, "Expected value not found.");
    }
    @Test
    public void findMinimumValueTestOK (){
        int [] array = {2,3,7,1};
        int result = ejercicio3.findMinimumValue(array);
        int resultOK = 1;
        Assertions.assertEquals(resultOK, result, "Expected value not found.");
    }
    @Test
    public void findMinimumValueNegativeTestOK (){
        int [] array = {-2,-3,-7,-1};
        int result = ejercicio3.findMinimumValue(array);
        int resultOK = -7;
        Assertions.assertEquals(resultOK, result, "Expected value not found.");
    }
}
