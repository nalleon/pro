package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void orderedArrayTestOK (){
        int [] array = {9,8,6,7,5,4,3,2,1};
        String result = ejercicio7.bubbleSort(array);
        String resultOK = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        Assertions.assertEquals(resultOK,result, "Expect result not found");
    }
    @Test
    public void orderedArrayNegativeTestOK (){
        int [] array = {-9,-8,-6,-7,-5,-4,-3,-2,-1};
        String result = ejercicio7.bubbleSort(array);
        String resultOK = "[-9, -8, -7, -6, -5, -4, -3, -2, -1]";
        Assertions.assertEquals(resultOK,result, "Expect result not found");
    }

}
