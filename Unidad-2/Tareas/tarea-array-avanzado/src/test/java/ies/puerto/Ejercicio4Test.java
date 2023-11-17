package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    int [] [] matrix = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
    @Test
    public void showMatrixTestOK(){
        int [][] result = ejercicio4.showMatrix5x5(matrix);
        int [][] resultOK = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        Assertions.assertArrayEquals(resultOK, result,"Expected result not found");
    }
    @Test
    public void matrixIsNot5x5TestOK(){
        int [] [] matrix5x4 = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5},{1, 2, 3, 4, 5}};
        int [][] result = ejercicio4.showMatrix5x5(matrix5x4);
        int [][] resultOK = null;
        Assertions.assertEquals(resultOK, result,"Expected result not found");
    }
    @Test
    public void sumRowMatrixTestOK(){
        int [] result = ejercicio4.sumRowMatrix(matrix);
        int [] resultOK = {15,15,15,15,15};
        Assertions.assertArrayEquals(resultOK, result,"Expected result not found");
    }
    @Test
    public void sumColumsMatrixTestOK(){
        int [] result = ejercicio4.sumColumnsMatrix(matrix);
        int [] resultOK = {5, 10, 15, 20, 25};
        Assertions.assertArrayEquals(resultOK, result,"Expected result not found");
    }
}
