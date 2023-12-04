package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que verifique si una cadena de texto comienza
 * o termina con una subcadena específica.
 * @author Nabil
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert text: ");
        String str = scanner.nextLine();

        System.out.println("Insert a substring ");
        String subString = scanner.nextLine();

        if (str.startsWith(subString)) {
            System.out.println("Text start with substring " + subString);
        } else if (str.endsWith(subString)) {
            System.out.println("Text ends with substring " + subString);
        } else {
            System.out.println("Text does not start nor end with substring " + subString);
        }
    }
}
