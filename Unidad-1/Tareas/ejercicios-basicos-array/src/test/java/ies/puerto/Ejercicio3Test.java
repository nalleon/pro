package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void calculoMayorOKTest() {
        int resultado = ejercicio3.calcularMayor(67, 1,56);
        Assertions.assertEquals(67, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void calculoMenorOKTest() {
        int resultado = ejercicio3.calcularMenor(6574, 1324,5446);
        Assertions.assertEquals(1324, resultado, "No se ha obtenido el resultado esperado.");
    }
}

