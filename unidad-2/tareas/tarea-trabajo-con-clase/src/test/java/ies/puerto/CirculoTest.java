package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    Circulo circulo = new Circulo();

    @Test
    public void calcularAreaTest () {
        Circulo circulo1 = new Circulo(12);
        double resultado = circulo1.calcularArea();
        double resultadoOK = Math.PI * 144;
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }

    @Test
    public void calcularCircunferenciaTest () {
        Circulo circulo1 = new Circulo(12);
        double resultado = circulo1.calcularCircunferencia();
        double resultadoOK = Math.PI * 12;
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}
