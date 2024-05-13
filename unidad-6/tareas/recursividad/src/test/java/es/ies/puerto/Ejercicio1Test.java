package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test extends Utilities {
    Ejercicio1 ejercicio;
    String result = "10 9 8 7 6 5 4 3 2 1 0 ";

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio1();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(result, ejercicio.regressiveCount(10), MESSAGE_ERROR);
    }
}
