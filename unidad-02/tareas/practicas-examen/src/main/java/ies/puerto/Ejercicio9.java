package ies.puerto;

public class Ejercicio9 {

    public int[] orderedArray(int[] array1, int[] array2) {
        int [] array1Sorted = array1;
        int [] array2Sorted = array2;
        int [] result = new int [array1.length + array2.length];
        boolean swapped1 = true;
        boolean swapped2 = true;
        do {
            for (int i=1; i < array1.length-1; i++){
                swapped1 = false;
                if (array1[i-1] > array1[i]){
                    int current = array1[i];
                    int previous = array1[i-1];
                    array1[i] = previous;
                    array1[i-1] = current;
                    swapped1 = true;
                }
            }
        } while (swapped1);

        do {
            for (int i=1; i < array2.length-1; i++){
                swapped2 = false;
                if (array2[i-1] > array2[i]){
                    int current = array2[i];
                    int previous = array2[i-1];
                    array2[i] = previous;
                    array2[i-1] = current;
                    swapped2 = true;
                }
            }
        } while (swapped2);
            System.arraycopy(array1Sorted, 0, result, 0, array1Sorted.length);
            System.arraycopy(array2Sorted, 0, result, 0, array2Sorted.length);

          for (int i=0; i < array1.length; i++){
              result[i] = array1Sorted[i];
          }
          int j=0;
          for (int i=array1.length; j < array2.length; i++){
              result[i] = array2Sorted[j];
              j++;
          }
        return result;
    }


    public int[] mixedArray(int[] array1, int[] array2) {

      return array1;  
    
    }
}
