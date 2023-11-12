package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void averageScoreTestOK (){
      float [] array = {1.5f, 2.5f,3.5f,4.5f, 5.5f};
      float result = ejercicio2.averageScore(array);
      float resultOK = 3.5f;
      Assertions.assertEquals(resultOK, result,"Expected result not found.");
    }

    @Test
    public void averageScoreNegativeTestOK (){
        float [] array = {-1.5f, -2.5f,-3.5f,-4.5f, -5.5f};
        float result = ejercicio2.averageScore(array);
        float resultOK = -3.5f;
        Assertions.assertEquals(resultOK, result,"Expected result not found.");
    }
}
