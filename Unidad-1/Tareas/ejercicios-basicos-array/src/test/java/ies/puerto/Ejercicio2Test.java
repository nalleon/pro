package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;

    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }
    @Test
    public void testSignoNumeroPositivoTest() {
        String resultado = ejercicio2.signoNumero(52);
        assertEquals("positivo", resultado);
    }
}
