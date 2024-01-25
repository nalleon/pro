package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {
    /**
     * function that orders an array of integer numbers in ascend order
     * @param array
     * @return
     */

    public String bubbleSort (int [] array){
     int elementLength = array.length -1;
     int [] result = array;
     for (int i =0; i < elementLength; i++){
       for (int j =0; j < elementLength -i; j++){
           if (result[j] > result[j+1]){
               int temporal = result[j];
               result[j] = result [j+1];
               result[j+1]=temporal;
           }
       }
     }
        return Arrays.toString(result);
    }
}
