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
     boolean swapped;
     int [] result = array;
     do {
         swapped = false;
         for (int i = 1; i <= array.length - 1; i++) {
            if (array[i-1] > array[i]){
                int previous = array [i-1];
                int current = array [i];
                result[i]= previous;
                result [i-1]= current;
                    swapped = true;
            }

         }
     }while (swapped);
        return Arrays.toString(result);
    }
}