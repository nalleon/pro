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
        String strTrimmed = str.trim();

        for (int i = 0; i < strTrimmed.length(); i++) {
            if (strTrimmed.charAt(i) != ' '){
                System.out.print("\n" + strTrimmed);
            }
        }
        System.out.println(strTrimmed);
    }
}
