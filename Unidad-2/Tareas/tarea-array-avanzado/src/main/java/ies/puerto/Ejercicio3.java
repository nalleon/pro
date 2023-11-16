package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio3 {

    public int [] arraySum (int [] array1, int [] array2){
      int elementLength = (array1.length + array2.length)/2;
        int[] result = new int[elementLength];

       for (int i =0; i < elementLength; i++){
               result[i]= array1[i] + array2[i];
       }
        return result;
    }
}
