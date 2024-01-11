package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un carácter ingresado por el usuario y determine si es una
 * vocal o una consonante.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a char: ");
        char userChar = scanner.next().charAt(0);
        System.out.println(findVowelConsonant(userChar));
    }

    public static String findVowelConsonant (char userChar){
        String result = "";
        char [] vowels = {'a','e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        for (char vowel : vowels) {
            if (userChar == vowel) {
                result = userChar + " is a vocal.";
            } else {
                result = userChar + " is a consonant.";
            }
        }
        return result;
    }
}
