package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que cuente el número de vocales en
 * una cadena de texto.
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();
        char [] vowels = {'a','e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        int counter = 0;

        for (int i =0; i < str.length(); i++){
           for (int j =0; j < vowels.length; j++){
               if (str.charAt(i) == vowels[j]){
                   counter++;
               }
           }
        }
        System.out.println("Total of vowels: "+ counter);
    }
}
