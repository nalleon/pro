package ies.puerto;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *  Implementa un programa que invierta una cadena de texto dada. La cadena debe de tener al menos
 *  10 caracteres no vacíos. Puntuación 1 punto. (Con test que verifique el comportamiento 1,25)
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insert a string to invert");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new IllegalArgumentException("String cannot be empty");
            } else if (str.trim().length() < 10) {
                throw new IllegalArgumentException("String must have more than 10 chars");
            }
            for (int i = str.length() - 1; i >= 0; i--)
                System.out.print(str.charAt(i));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

