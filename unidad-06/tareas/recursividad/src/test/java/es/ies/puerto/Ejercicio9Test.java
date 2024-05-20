package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio9Test extends Utilities {
    Ejercicio9 ejercicio;

    String result = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio9();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(result, ejercicio.numSeriesTrad(10).toString(), MESSAGE_ERROR);
        Assertions.assertEquals(result, ejercicio.numSeriesRecursive(10).toString(), MESSAGE_ERROR);

    }
}
