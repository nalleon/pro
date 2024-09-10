package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que tome una frase y una palabra ingresada por el usuario,
 * luego determine si la palabra está contenida en la frase.
 */
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a str: ");
        String str = scanner.nextLine();
        System.out.println("Insert a word: ");
        String word = scanner.nextLine();

        System.out.println(containWord(str, word));
    }


    public static boolean containWord (String str, String word){
        return str.contains(word);
    }
}
