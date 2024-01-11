package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que convierta una cadena de
 * texto a minúsculas y otra a mayúsculas.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();

        String lowerCase = str.toLowerCase();
        System.out.println("All lowercase text: " + lowerCase);

        String upperCase = str.toUpperCase();
        System.out.println("All uppercase text: " + upperCase);
    }
}

