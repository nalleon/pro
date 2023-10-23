package ies.puerto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();


  @Test
    public void calcularSueldoHorasOKTest() {
        int resultado= ejercicio1.calcularSueldoHoras(10);
      Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado.");
    }
    @Test
    public void calcularSueldoHorasMayorOKTest() {
        int resultado= ejercicio1.calcularSueldoHoras(40);
        Assertions.assertEquals(400, resultado, "No se ha obtenido el resultado esperado.");
    }
}
