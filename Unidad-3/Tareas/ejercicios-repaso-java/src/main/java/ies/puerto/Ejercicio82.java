package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrolla un programa que ordene un array de enteros en orden ascendente y luego lo muestre.
 * Solicita el tamaño del array, e introduce los valores.
 */
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a length for an integers array: ");
        int length = scanner.nextInt();
        int [] array = new int [length];

        for (int i =0; i < array.length; i++){
            System.out.println("Fill the array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(orderedArray(array)));
    }
    public static int [] orderedArray (int [] array ){
        for (int i=1; i <= array.length-1; i++){
            if (array[i-1] > array[i]){
                int previous = array [i-1];
                int current = array [i];
                 array[i] = previous;
                 array [i-1] = current;
            }
        }
        return array;
    }
}
