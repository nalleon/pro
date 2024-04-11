package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test extends Utilities {
    Ejercicio3 ejercicio;
    String result = "10 8 6 4 2 ";

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio3();
    }

    //@Test
    public void ejercicio1Test() {
        Assertions.assertEquals(result, ejercicio.printParity(10), MESSAGE_ERROR);
    }

    @Test
    public void ejercicioTest() {
        result = "[10, 8, 6, 4, 2, 0]";
        Assertions.assertEquals(result, ejercicio.printParity(10).toString(), MESSAGE_ERROR);
    }

}
