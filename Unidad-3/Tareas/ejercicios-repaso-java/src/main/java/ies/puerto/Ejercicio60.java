package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos cadenas ingresadas por el usuario y determine si son iguales o diferentes.
 */
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a str: ");
        String str1 = scanner.next();
        System.out.println("Enter another str: ");
        String str2 = scanner.next();
        System.out.println(strComparision(str1, str2));
    }

    public static boolean strComparision (String str1, String str2){
        boolean result = false ;

        if (str1.equals(str2)){
            result = true;
        }
        return result;
    }
}
