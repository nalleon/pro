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
    public void signoPositivoNumeroTestOK() {
        assertEquals("positivo", ejercicio2.signoNumero(9));
    }
    @Test
    public void signoNegativoNumeroTestOK() {
        assertEquals("negativo", ejercicio2.signoNumero(-134));
    }

    @Test
    public void esParTestOK() {
        assertEquals("par", ejercicio2.esPar(-1222));
    }
    @Test
    public void esImparTestOK() {
        assertEquals("impar", ejercicio2.esPar(45));
    }
}
