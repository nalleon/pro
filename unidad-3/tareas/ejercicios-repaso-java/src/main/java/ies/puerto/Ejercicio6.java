package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario dos números y luego muestre los dos números y su suma.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int num1 = scanner.nextInt();

        System.out.println("Insert another number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " +sum);
    }
}
