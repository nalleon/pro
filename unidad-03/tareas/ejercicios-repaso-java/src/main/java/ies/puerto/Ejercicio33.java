package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene la letra
 * 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();
        char lowercaseA = 'a';
        int counter = 0;
        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) == lowercaseA) {
                counter++;
            }
        } if (counter > 0) {
            System.out.println("Your str contains the letter 'a'.");
        } else {
            System.out.println("Your str does not contains the letter 'a'.");

        }
    }
}
