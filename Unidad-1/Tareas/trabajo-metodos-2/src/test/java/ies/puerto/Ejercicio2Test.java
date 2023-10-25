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

    @Test
    public void testSignoNumeroNegativoTest() {
        String resultado = ejercicio2.signoNumero(-333);
        assertEquals("negativo", resultado);
    }

    @Test
    public void testEsParTest() {
        String resultado = ejercicio2.esPar(-66680);
        assertEquals("par", resultado);
    }

    @Test
    public void testEsParImparTest() {
        String resultado = ejercicio2.esPar(7777);
        assertEquals("impar", resultado);
    }
}
