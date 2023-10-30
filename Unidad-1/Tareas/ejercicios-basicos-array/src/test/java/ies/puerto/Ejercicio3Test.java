package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;

    @Test
    public void introduccionNumerosTest() {
        ejercicio3 = new Ejercicio3();
        String metodoUno = ejercicio3.introduccionNumeros(1,2,3,4,5);
        Assertions.assertEquals(metodoUno,"1,2,3,4,5", "No se ha obtenido el resultado esperado.");
    }
}

