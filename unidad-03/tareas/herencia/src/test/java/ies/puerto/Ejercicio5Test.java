package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void findValueTestOK (){
        int [] array = {2,4,7,9,10};
        int value = 7;
        int result = ejercicio5.findValue(array, value);
        int resultOK = 7;
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
    @Test
    public void cantfindValueTestOK (){
        int [] array = {2,4,7,9,10};
        int value = 5;
        int result = ejercicio5.findValue(array, value);
        int resultOK = -1;
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
}
