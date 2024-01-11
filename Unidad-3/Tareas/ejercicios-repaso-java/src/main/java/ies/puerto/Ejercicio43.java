package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una cadena ingresada por el usuario y verifique si contiene
 * la letra 'a' y muestra un mensaje adecuado.
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();
        System.out.println(containsA(str));
    }
    public static String containsA (String str){
        String result = "";
        char lowercaseA = 'a';
        int counter = 0;

        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) == lowercaseA) {
                counter++;
            }
        } if (counter > 0) {
            result = "Your str contains the letter 'a'.";
        } else {
            result = "Your str does not contains the letter 'a'.";
        }
        return result;
    }
}
