package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test extends Utilities {
    Ejercicio4 ejercicio;
    String tradResult = "[1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, " +
            "17711, 28657]";
    int recursiveResult = 28657;
    @BeforeEach
    public void beforeEach() {
    ejercicio = new Ejercicio4();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(tradResult, ejercicio.fibonacciTrad(23).toString(), MESSAGE_ERROR);
        Assertions.assertEquals(recursiveResult, ejercicio.fibonacciRecursive(23), MESSAGE_ERROR);

    }
}
