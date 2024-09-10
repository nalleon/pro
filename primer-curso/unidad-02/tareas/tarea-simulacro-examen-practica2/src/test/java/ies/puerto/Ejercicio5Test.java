package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();


    @Test
    public void diagonalTestOK (){
        int [][] result = ejercicio5.diagonal();
        int [][] resultOK = {{1,0,0,0,0}, {0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0}, {0,0,0,0,1}};
        Assertions.assertArrayEquals(resultOK, result, "Expeced result not found");


    }
}
