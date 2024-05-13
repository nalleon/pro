package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test extends Utilities {
    Ejercicio5 ejercicio;
    int result = 24;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();
    }

    @Test
    public void ejercicio5Test() {
        Assertions.assertEquals(result, ejercicio.factorialTrad(4), MESSAGE_ERROR);
        Assertions.assertEquals(result, ejercicio.factorial(4), MESSAGE_ERROR);
    }
}
