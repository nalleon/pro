package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
 Ejercicio1 ejercicio1 = new Ejercicio1();

  @Test
   public void arraySumatoryTestOK (){
   int [] array = {1,2,3,4,5};
   int result = ejercicio1.arraySumatory(array);
   int resultOK= 15;
   Assertions.assertEquals(resultOK, result, "Expected result not found.");
  }
  @Test
   public void arraySumatoryNegativeTestOK (){
   int [] array = {-1,-2,-3,-4,-5};
   int result = ejercicio1.arraySumatory(array);
   int resultOK= -15;
   Assertions.assertEquals(resultOK, result, "Expected result not found.");
 }
 @Test
 public void arraySumatoryNegativePositiveTestOK (){
  int [] array = {-1,2,-3,4,-5};
  int result = ejercicio1.arraySumatory(array);
  int resultOK= -3;
  Assertions.assertEquals(resultOK, result, "Expected result not found.");
 }
}
