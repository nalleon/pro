package ies.puerto;

import java.util.Arrays;

public class Ejercicio8 {


    public int[] showArray(int[] array) {

        return array;
    }

    public int[] bubbleSort(int[] array) {
        int elementLength = array.length - 1;
        boolean swapped;
        int[] result = array;

        do {
            swapped = false;
            for (int i = 1; i <= elementLength; i++) {
                if (result[i - 1] > result[i]) {
                    int previous = result[i - 1];
                    int current = result[i];
                    result[i] = previous;
                    result[i - 1] = current;
                    swapped = true;
                }
            }
        } while (swapped);
        return result;
    }

    public String eliminateDuplicates(int[] array) {
        int[] arraySorted = bubbleSort(array);
        int [] result = new int[arraySorted.length];
        int counter = 0;
        for (int i = 1; i < arraySorted.length; i++) {
            int previous = arraySorted[i-1];
            int current = arraySorted[i];
            if (previous != current) {
                result[counter++] = previous;
            }
        }

        result[counter++] = arraySorted[arraySorted.length - 1];

        int[] unique = new int[counter];
        for (int i = 0; i < counter; i++) {
            unique[i] = result[i];
        }

        return Arrays.toString(unique);
    }

}