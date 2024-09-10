package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void frameTestOK(){
        int [][] result = ejercicio6.frame();
        int [][] resultOK =   {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");


    }
}
