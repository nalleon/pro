package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio12Test {

    Ejercicio12 ejercicio12 = new Ejercicio12();

    @Test
    public void  evenNumbersSumatoryTestOK (){
        int end = 10;
        int result = ejercicio12.evenNumbersSumatory(end);
        int resultOK = 20;
        Assertions.assertEquals(resultOK, result, "Expect result not found" );
    }
    @Test
    public void  evenNegativeNumbersSumatoryTestOK (){
        int end = -10;
        int result = ejercicio12.evenNumbersSumatory(end);
        int resultOK = 0;
        Assertions.assertEquals(resultOK, result, "Expect result not found" );
    }
}
