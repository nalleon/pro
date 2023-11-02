package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {
    Ejercicio10 ejercicio10 = new Ejercicio10();
    @Test
    public void matrizDiagonaloOKTest() {
        int[][] matriz= {{1,0,0}, {0,1,0}, {0,0,1}};
        boolean resultadoOK = true;
        boolean resultado =  ejercicio10.matrizDiagonal(matriz);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void matrizNoDiagonaloTest() {
        int[][] matriz= {{2,2,2}, {1,1,0}, {5,0,1}};
        boolean resultadoOK = false;
        boolean resultado =  ejercicio10.matrizDiagonal(matriz);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void matrizCuadradaTest() {
        int[][] matriz= {{2,0}, {1,1}};
        boolean resultadoOK = true;
        boolean resultado =  ejercicio10.matrizCuadrada(matriz);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void matrizNoCuadradaTest() {
        int[][] matriz= {{2,0}, {1,1}, {5,0}};
        boolean resultadoOK = false;
        boolean resultado =  ejercicio10.matrizCuadrada(matriz);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }
}
