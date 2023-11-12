package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void transposeMatrix (){
        int [] [] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [] [] result = ejercicio6.transposeMatrix(matrix);
        int [] [] resultOK = {{1,4,7}, {2,5,8}, {3,6,9}};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");
    }
}
