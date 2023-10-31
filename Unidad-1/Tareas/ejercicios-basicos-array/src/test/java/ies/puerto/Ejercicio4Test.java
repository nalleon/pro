package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void esParOKTest() {
        int[] numerosTest = {2, 7, 62};
        int resultado = ejercicio4.numerosPares(2, 7, 62);
        Assertions.assertEquals("2, 62", resultado, "No se ha obtenido el resultado esperado.");
    }

}
