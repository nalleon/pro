package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a decimal number: ");
        float num = scanner.nextFloat();

        if (num > 0){
            System.out.println("Num is positive.");
        } else if (num < 0) {
            System.out.println("Num is negative.");
        } else {
            System.out.println("Num is zero.");
        }
    }
}
