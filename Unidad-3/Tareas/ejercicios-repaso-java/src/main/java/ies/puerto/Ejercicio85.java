package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que cuente cuántas veces aparece un número específico en un array de enteros.
 */
public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 7;
        System.out.println("Choose a length for an integers array: ");
        int length = scanner.nextInt();
        int [] array = new int [length];

        for (int i =0; i < array.length; i++){
            System.out.println("Fill the array: ");
            array[i] = scanner.nextInt();
        }

        int [] orderedArray = orderedArray(array);
        String timesNumAppears = timesNumAppears(num, orderedArray);
        System.out.println(timesNumAppears);
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

    public static String timesNumAppears (int num, int [] array ) {
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
              counter++;
            }
        }
        return num + " appears a total of: " +counter+ " time(s).";
    }
}
