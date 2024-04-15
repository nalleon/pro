package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NaturalSumTest extends Utilities {
    NaturalSum naturalSum;

    @BeforeEach
    public void beforeEach() {
        naturalSum = new NaturalSum();
    }

    @Test
    public void naturalSumTest() {
        Assertions.assertEquals(55, naturalSum.naturalSumTrad(10), MESSAGE_ERROR);
        Assertions.assertEquals(55, naturalSum.naturalSumRecursive(10), MESSAGE_ERROR);

    }
}
