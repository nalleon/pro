package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void calculoMayorOKTest() {
        int [] numeros = {67, 1,56};
        int resultado = ejercicio3.calcularMayor(numeros);
        Assertions.assertEquals(67, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void calculoMenorOKTest() {
        int [] numeros = {6574, 1324,5446};
        int resultado = ejercicio3.calcularMenor(numeros);
        Assertions.assertEquals(1324, resultado, "No se ha obtenido el resultado esperado.");
    }
}

