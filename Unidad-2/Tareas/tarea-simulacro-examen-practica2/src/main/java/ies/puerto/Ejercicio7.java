package ies.puerto;

import java.util.Arrays;

public class Ejercicio7 {
        /**
         * function that searchs with a binary method through an array of numbers to find a value
         * @param arrayOfVarious to search
         * @param value to find
         * @return
         */
        public int binarySearch(int[] arrayOfVarious, int value) {
            int start =0;
            int end = arrayOfVarious.length -1;

            while (start <= end){
                int mid = (start+end)/2;

                if (arrayOfVarious[mid] == value){
                    return mid;
                } else if (arrayOfVarious[mid] > value){
                    end = mid -1;
                } else {
                    start = mid +1;
                }
                }
            return -1;
            }

        }

