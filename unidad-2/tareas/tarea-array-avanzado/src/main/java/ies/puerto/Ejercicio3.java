package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * functions that sums two arrays
     * @param array1 to operate with
     * @param array2 to operate with
     * @return array1 + array2
     */
    public int [] arraySum (int [] array1, int [] array2){
      int elementLength = array1.length;
        int[] array3 = new int[elementLength];
       for (int i =0; i < elementLength; i++){
               array3[i]= array1[i] + array2[i];
       }
        return array3;
    }
}
