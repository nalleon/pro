package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
 */
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Age can NOT be negative.");
        } else if (age < 18) {
            System.out.println("You are underage.");
        } else if (age > 18 && age < 65) {
            System.out.println("You are above of age");
        } else {
            System.out.println("You are old.");
        }
    }
}
