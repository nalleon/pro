package ies.puerto;
/**
 * @author Nabil
 */
import java.util.Arrays;

public class Ejercicio2 {
    /**
     * function that sorts an array of numbers in increasing order
     * @param array to evalue
     * @return a string with the array of numbers ordered
     */
    public  String bubbleSort (int [] array){
        int elementLength = array.length -1;
        boolean swapped;
        int [] result = array;

        do {
          swapped = false;
          for (int i=1; i <= elementLength; i++){
           if (result[i-1] > result [i]){
               int previous = result [i-1];
               int current = result [i];
               result [i] = previous;
               result [i-1] = current;
                swapped = true;
           }
          }
        } while (swapped);
        return Arrays.toString(result);
    }
}