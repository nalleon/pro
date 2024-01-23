package ies.puerto;

import java.lang.reflect.Array;

public class Ejercicio8 {

    public int []  bubbleSort (int [] array){
        int [] result = array;
        boolean swapped;
        do {
            swapped = false;
            for (int i=1; i < array.length-1; i++){
                if (array[i-1] > array[i]){
                    int previous = array[i-1];
                    int current = array[i];
                        result[i] = previous;
                        result [i-1] = current;
                        swapped = true;
                    }

                }

        } while (swapped);
        return result;
    }
}
