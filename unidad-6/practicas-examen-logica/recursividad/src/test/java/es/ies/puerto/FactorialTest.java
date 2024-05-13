package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest extends Utilities {

    Factorial factorial;

    @BeforeEach
    public void beforeEach(){
        factorial = new Factorial();
    }
    @Test
    public void factorialTestOk(){
        Assertions.assertEquals(120, factorial.factorialTrad(5), MESSAGE_ERROR);
        Assertions.assertEquals(120, factorial.factorialRecursive(5), MESSAGE_ERROR);
    }
}
