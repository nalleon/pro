package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que elimine los espacios en blanco al
 * principio y al final de una cadena de texto.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();

        String trimmed = str.trim();
        System.out.println(trimmed);
    }
}
