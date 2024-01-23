package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que sume todos los elementos de un array de enteros y muestre el resultado.
 * Solicita el tamaño del array, e introduce los valores, para ejecutar la suma.
 */
public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a length for an integers array: ");
        int length = scanner.nextInt();
        int [] array = new int [length];

        for (int i =0; i < array.length; i++){
            System.out.println("Fill the array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Sum is: " + arraySum(array));
    }
    public static int arraySum (int [] array ){
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
