package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que pida al usuario ingresar números con un bucle while y
 * calcule la suma de esos números. Termina el bucle cuando la suma alcance o supere 100.
 */
public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        float num1 = scanner.nextFloat();
        System.out.println("Insert another number: ");
        float num2 = scanner.nextFloat();
        System.out.println(sum(num1, num2));
    }

    public static float sum (float num1, float num2){
        float sum = num1 + num2;
        while (sum < 100){
            sum++;
        }
        return  sum;
    }
}
