package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test {

    Ejercicio9 ejercicio9 = new Ejercicio9();


    @Test
    public void arrayOrdenadoCombinadoOKTest() {
        int[] primerArray = {1, 3, 5, 7, 9};
        int[] segundoArray = {2, 4, 6, 8, 10};
        int[] resultadoOK = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultado = new int[resultadoOK.length];
        ejercicio9.arrayOrdenadoCombinado(primerArray, segundoArray, resultado);
        Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void arrayOrdenadoCombinado255OKTest() {
        int[] primerArray = {12, 34, 55, 79, 93};
        int[] segundoArray = {23, 45, 61, 84, 255};
        int[] resultadoOK = {12, 23, 34, 45, 55, 61, 79, 84, 93, 255};
        int[] resultado = new int[resultadoOK.length];
        ejercicio9.arrayOrdenadoCombinado(primerArray, segundoArray, resultado);
        Assertions.assertArrayEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }

}
