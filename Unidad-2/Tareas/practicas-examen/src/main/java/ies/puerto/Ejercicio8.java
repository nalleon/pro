package ies.puerto;

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
        String result = "";
        for (int i = 1; i <= arraySorted.length; i++) {
            int previous = arraySorted[i-1];
            int current = arraySorted[i];
            if (previous != current) {
                result += Integer.toString(previous) + ",";

            }
        }
        return result;
    }

}