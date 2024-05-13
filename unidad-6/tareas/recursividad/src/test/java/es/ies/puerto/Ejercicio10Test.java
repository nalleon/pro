package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test extends Utilities {
    Ejercicio10 ejercicio;
    String result = "9 7 5 3 1 ";
    @BeforeEach
    public void beforeEach() {
    ejercicio = new Ejercicio10();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(result, ejercicio.printNum(10), MESSAGE_ERROR);
    }
}
