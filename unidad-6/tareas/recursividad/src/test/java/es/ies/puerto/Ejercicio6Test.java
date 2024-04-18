package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test extends Utilities {
    Ejercicio6 ejercicio;

    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio6();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(27, ejercicio.potencyTrad(3, 3), MESSAGE_ERROR);
        Assertions.assertEquals(27, ejercicio.potency(3, 3), MESSAGE_ERROR);
    }
}
