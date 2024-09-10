package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test extends Utilities {
    Ejercicio7 ejercicio;
    String result = "[10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]";

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio7();
    }

    @Test
    public void ejercicio1Test() {
        String resultMethod = ejercicio.regressiveCountRecursive(10).toString();
        Assertions.assertEquals(result, resultMethod, MESSAGE_ERROR);
    }
}
