package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome dos cadenas ingresadas
 * por el usuario y muestre la concatenación de ambas, así como su longitud.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a str: ");
        String str1 = scanner.nextLine();

        System.out.println("Insert another str: ");
        String str2 = scanner.nextLine();

        String concatStr = str1.concat(str2);

        int counter = 0;
        for (int i =0; i < concatStr.length(); i++){
            counter++;
        }
        System.out.println(concatStr + "\nLenght is: " + counter);
    }
}
