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
    @Test
    public void sumaNumerosTest() {
        ejercicio3 = new Ejercicio3();
        int metodoDos = ejercicio3.sumaNumeros(1,2,3,4,5);
        Assertions.assertEquals(metodoDos, 15,"No se ha obtenido el resultado esperado.");
    }
    @Test
    public void ordenarMayorNumerosTest() {
        ejercicio3 = new Ejercicio3();
        int metodoTres = ejercicio3.ordenarMayorNumeros(1,2,3,4,5);
        Assertions.assertEquals("5,4,3,2,1", metodoTres ,"No se ha obtenido el resultado esperado.");
    }
    @Test
    public void ordenarMenorNumerosTest() {
        ejercicio3 = new Ejercicio3();
        String metodoCuatro = ejercicio3.ordenarMenorNumeros(1,2,3,4,5);
        Assertions.assertEquals(metodoCuatro, "1,2,3,4,5","No se ha obtenido el resultado esperado.");
    }
}

