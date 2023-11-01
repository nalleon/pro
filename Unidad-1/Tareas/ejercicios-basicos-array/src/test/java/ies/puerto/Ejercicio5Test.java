package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();
    @Test
    public void testEncontrarPosicionTest() {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int resultado = ejercicio5.encontrarPosicion(numeros, 5);
        Assertions.assertEquals(4, resultado);
    }
    @Test
    public void noEncontradoTestOK() {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        int[] numeros = {14, 234, 35, 654, 56, 62, 73, 18};
        int resultado = ejercicio5.encontrarPosicion(numeros, 98);
        Assertions.assertEquals(-1, resultado);
    }
}

