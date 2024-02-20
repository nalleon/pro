package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void matrizTraspuestaTestOK() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultadoOK = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] resultado = ejercicio6.matrizTraspuesta(matriz);
        Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void mostrarTraspuestaTestOK() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultadoOK = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] resultado = ejercicio6.mostrarTraspuesta(matriz);
        Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");
    }
}

