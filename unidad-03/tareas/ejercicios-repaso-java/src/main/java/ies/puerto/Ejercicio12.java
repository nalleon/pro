package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que declare una variable de tipo double y
 * otra de tipo float, y luego imprima su diferencia.
 */
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number for a float: ");
        float numFloat = scanner.nextFloat();

        System.out.println("Insert a number for a double: ");
        double numDouble = scanner.nextDouble();

        System.out.println("Difference between numbers is: " + (numFloat-numDouble));
    }
}
