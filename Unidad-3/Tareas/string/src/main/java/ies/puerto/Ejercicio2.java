package ies.puerto;
/**
 * Escribe un programa que compare dos cadenas de texto e indique
 * si son iguales o diferentes.
 * @author Nabil
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str1 = scanner.nextLine();

        System.out.println("Insert another text: ");
        String str2 = scanner.nextLine();

        try {
        if (str1.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be empty.");
        }
          } catch (IllegalArgumentException e) {
        System.out.println("Error:" + e.getMessage());

            if (str1.equals(str2)) {
                System.out.println("Texts are the same.");
            } else {
                System.out.println("Texts are different.");
            }
        }
    }
}