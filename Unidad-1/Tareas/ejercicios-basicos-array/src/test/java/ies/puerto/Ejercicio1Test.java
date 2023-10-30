package ies.puerto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();


    @Test
    public void calcularSumaOKTest() {
        float resultado = ejercicio1.calcularSuma();
        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void mostrarResultadoOKTest() {
        float resultado = ejercicio1.calcularSuma();
        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado.");
    }
}

