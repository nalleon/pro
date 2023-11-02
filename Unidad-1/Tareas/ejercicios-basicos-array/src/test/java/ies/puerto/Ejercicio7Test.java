package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

        @Test
        public void testArrayOrdenadoOK() {
            Ejercicio7 ejercicio = new Ejercicio7();
            int[] numeros = {3, 1, 4, 2};
            int[] resultadoOK = {1, 2, 3, 4};
            int[] resultado = ejercicio7.arrayOrdenado(numeros);
            Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");
        }

    @Test
    public void testArrayOrdenado267OK() {
        Ejercicio7 ejercicio = new Ejercicio7();
        int[] numeros = {32, 267, 141, 212};
        int[] resultadoOK = {32, 141, 212, 267};
        int[] resultado = ejercicio7.arrayOrdenado(numeros);
        Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");
    }
    }

