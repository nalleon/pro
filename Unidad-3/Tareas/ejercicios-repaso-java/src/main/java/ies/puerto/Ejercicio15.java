package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que declare una variable de tipo char y muestre su valor ASCII.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta a char: ");
        char exampleChar = scanner.next().charAt(0);
        System.out.println("Value is: " + (int)exampleChar);
    }
}
