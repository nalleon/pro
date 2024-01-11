package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar cinco notas y calcule el promedio utilizando un bucle for.
 */
public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] num = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Insert score #" + (i + 1) + ": ");
            num[i] = scanner.nextFloat();
        }
        System.out.println("Average score is: " + averageScore(num));
    }

    public static float averageScore (float [] score){
        float result = 0;
        float temp = 0;
        for (int i =0; i < score.length; i++){
            temp += score[i];
            result = temp/score.length;
        }
        return result;
    }
}
