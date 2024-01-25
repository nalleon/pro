package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que declare dos variables de tipo entero e imprima su suma, resta, multiplicación y división.
 * @author Nabil
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer number:");
        int num1 = scanner.nextInt();

        System.out.println("Insert another integer number:");
        int num2 = scanner.nextInt();


        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiplication = num1*num2;
        int division = num1/num2;

        System.out.println(sum+ "\n" + subtract+ "\n" + multiplication+ "\n" + division);
    }
}
