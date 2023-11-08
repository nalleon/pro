package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    Rectangulo rectangulo = new Rectangulo();

    @Test
    public void calcularAreaTest() {
        Rectangulo rectangulo1 = new Rectangulo(60, 20);
        float resultado = rectangulo1.calcularArea();
        float resultadoOk = 1200;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void calcularPerimetroTest() {
        Rectangulo rectangulo1 = new Rectangulo(15, 20);
        float resultado = rectangulo1.calcularPerimetro();
        float resultadoOk = 70;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
