package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que invierta una cadena de texto dada.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert a string to invert");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new IllegalArgumentException("String cannot be empty");
            }
            for (int i = str.length() - 1; i >= 0; i--)
                System.out.print(str.charAt(i));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
