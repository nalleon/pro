package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que calcule el promedio de las notas almacenadas en un array de decimales.
 */
public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a length for the array: ");
        int length = scanner.nextInt();
        float [] array = new float [length];

        for (int i =0; i < array.length; i++){
            System.out.println("Fill the array with your scores: ");
            array[i] = scanner.nextFloat();
        }
        System.out.println(averageScore(array));
    }

    public static String averageScore (float [] array){
        float sum = 0;
        float result = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
            result = sum/array.length;
        }
        return "Your average score is: " + result;
    }
}
