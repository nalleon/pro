package ies.puerto;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a char: ");
        char userChar = scanner.next().charAt(0);
        char [] vowels = {'a','e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};

        for (char vowel : vowels) {
            if (userChar == vowel) {
                System.out.println(userChar + " is a vocal.");
                break;
            } else {
                System.out.println(userChar + " is a consonant.");
                break;
            }
        }
    }
}
