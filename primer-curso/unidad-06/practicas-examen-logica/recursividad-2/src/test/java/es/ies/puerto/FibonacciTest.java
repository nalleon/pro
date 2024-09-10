package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest extends Utilities {

    Fibonacci fibonacci;

    @BeforeEach
    public void beforeEach(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciTradTestOK(){
        Assertions.assertEquals(5, fibonacci.fibonacciTrad(3), MESSAGE_ERROR);
    }

    @Test
    public void fibonacciRecursiveTestOK(){
        Assertions.assertEquals(4, fibonacci.fibonacciRecursive(3), MESSAGE_ERROR);
    }
}
