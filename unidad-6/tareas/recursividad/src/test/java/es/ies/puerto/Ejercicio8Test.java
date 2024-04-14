package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test extends Utilities {
    Ejercicio8 ejercicio;

    @BeforeEach
    public void beforeEach() {
    ejercicio = new Ejercicio8();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(8,ejercicio.sumDigitsTrad(17), MESSAGE_ERROR);
        Assertions.assertEquals(6,ejercicio.sumDigitsTrad(6), MESSAGE_ERROR);
        Assertions.assertEquals(8,ejercicio.sumDigitsRecursive(17), MESSAGE_ERROR);
    }
}
