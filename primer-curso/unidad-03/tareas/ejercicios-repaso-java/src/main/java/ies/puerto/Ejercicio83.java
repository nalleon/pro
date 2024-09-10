package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que busque un número específico en un array y muestre su posición si se encuentra, o un mensaje
 * indicando que no se encontró. >Nota: Definir e introducir valores lo has realizado en el ejercicio anterior_.
 */
public class Ejercicio83 {
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
        String isNumInArray = isNumInArray(num, orderedArray);
        System.out.println(isNumInArray);
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

    public static String isNumInArray (int num, int [] array ) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return num + " is at the position " + i + " of the array.";
            }
        }
        return num + " not found.";
    }
}
