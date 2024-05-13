package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitSumTest extends Utilities {

    DigitSum digitSum;

    @BeforeEach
    public void beforeEach(){
        digitSum = new DigitSum();
    }

    @Test
    public void ejercicio1Test() {
        Assertions.assertEquals(8,digitSum.digitSumTrad(17), MESSAGE_ERROR);
        Assertions.assertEquals(9,digitSum.digitSumRecursive(171), MESSAGE_ERROR);
    }
}
