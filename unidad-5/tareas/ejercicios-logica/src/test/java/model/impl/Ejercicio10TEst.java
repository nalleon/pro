package model.impl;

import es.ies.puerto.modelo.impl.Ejercicio10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio10TEst {
    Ejercicio10 ejercicio10;
    @BeforeEach
    public void beforeEach(){
        ejercicio10 = new Ejercicio10();
    }

    @Test
    public void testNotCommonLetters() {
        Assertions.assertEquals("abcdef", ejercicio10.notCommonLetters("abcdef", "ghijkl"), "Expected result not found");
        Assertions.assertEquals("abd", ejercicio10.notCommonLetters("abcdef", "ghijecf"), "Expected result not found");
        Assertions.assertEquals("abcdef", ejercicio10.notCommonLetters("abcdef", ""), "Expected result not found");
        Assertions.assertEquals("", ejercicio10.notCommonLetters("", ""), "Expected result not found");
        Assertions.assertEquals("", ejercicio10.notCommonLetters("abc", "abc"), "Expected result not found");
    }
}
