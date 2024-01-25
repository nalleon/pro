package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();
    @Test
    public void parityTestOK (){
        int [] array = {1,2,3,4,5,6,7};
        int result = ejercicio4.parity(array);
        int resultOK = 3;
        Assertions.assertEquals(resultOK, result,"Expected value not found.");
    }
    @Test
    public void parityNegativeTestOK (){
        int [] array = {-1,-2,-3,-4,-5,-7};
        int result = ejercicio4.parity(array);
        int resultOK = 2;
        Assertions.assertEquals(resultOK, result,"Expected value not found.");
    }

}
