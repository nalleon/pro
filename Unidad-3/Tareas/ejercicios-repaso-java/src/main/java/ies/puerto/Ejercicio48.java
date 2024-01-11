package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas
 * por el usuario y determine si tienen la misma longitud.
 */
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a str: ");
        String str1 = scanner.nextLine();
        System.out.println("Insert another str: ");
        String str2 = scanner.nextLine();
        System.out.println(lengthCheck(str1, str2));
    }
    public static String lengthCheck (String str1, String str2){
        String result = "";
        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length == str2Length){
            result = "Strings length are the same.";
        } else {
            result = "Strings length are NOT the same.";
        }
        return result;
    }
}
