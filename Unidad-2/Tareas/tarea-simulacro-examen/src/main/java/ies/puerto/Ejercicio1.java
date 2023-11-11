package ies.puerto;

public class Ejercicio1 {

    public int binarySearch(int[] arrayOfVarious, int value) {
        int start = 0;
        int end = arrayOfVarious.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arrayOfVarious[mid] == value) {
                return mid;
            }
            if (arrayOfVarious[mid] < value) {
                start = mid + 1;
            } else {
              end = mid - 1;

            }
        }
        return -1;
    }
}
