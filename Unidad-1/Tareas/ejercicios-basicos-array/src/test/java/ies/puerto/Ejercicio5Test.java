package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio5 = new Ejercicio5();
    @Test
    public void testEncontrarPosicionValorPresente() {
        int[] array = {11, 12, 34, 45, 67};
        int valorBuscado = 34;
        int resultado = ejercicio5.encontrarPosicion(array, valorBuscado);
        Assertions.assertEquals(2, resultado, "No se ha obtenido el resultado esperado.");
    }

    @Test
    public void testEncontrarPosicionValorAusente() {
        int[] array = {45, 42, 446, 8, 105, 132};
        int valorBuscado = 7;
        int resultado = ejercicio5.mostrarPosicion(array, valorBuscado);
        Assertions.assertEquals(-1, resultado, "No se ha obtenido el resultado esperado.");
    }
}

