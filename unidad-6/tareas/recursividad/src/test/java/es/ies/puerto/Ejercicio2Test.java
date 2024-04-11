package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test extends Utilities {
    Ejercicio2 ejercicio;
    int result = 55;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio2();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(result, ejercicio.sum(10) , MESSAGE_ERROR);
    }
}
