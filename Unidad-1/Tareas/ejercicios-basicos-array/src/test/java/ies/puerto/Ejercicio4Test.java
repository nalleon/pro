package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();
    @Test
    public void calcularPromedioOKTest() {
        float resultado = ejercicio4.numeroPar();
        Assertions.assertEquals(3.5, resultado, "No se ha obtenido el resultado esperado.");
    }
}
