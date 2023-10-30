package ies.puerto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();


    @Test
    public void calcularSumaOKTest() {
        int resultado = ejercicio1.calcularSuma();
        Assertions.assertEquals(15, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void mostrarResultadoOKTest() {
        String resultado = ejercicio1.mostrarResultado();
        Assertions.assertEquals("La suma de los elementos es: " +15, resultado, "No se ha obtenido el resultado esperado.");
    }
}

