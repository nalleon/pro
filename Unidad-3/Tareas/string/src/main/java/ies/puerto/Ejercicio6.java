package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome una frase e
 * imprima cada palabra en una nueva línea.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a text: ");
        String str = scanner.nextLine();
        String currentWord = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != ' ') {
                currentWord += currentChar;
            } else if (!currentWord.isEmpty()) {
                System.out.println(currentWord);
                currentWord = "";
            }
        } if (!currentWord.isEmpty()) {
            System.out.println(currentWord);
        }
    }
}
