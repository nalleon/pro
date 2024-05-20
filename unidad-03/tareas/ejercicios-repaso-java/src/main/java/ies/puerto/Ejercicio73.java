package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome una cadena ingresada por el usuario y cuente cuántas vocales (a, e, i, o, u)
 * contiene. Utiliza un bucle while.
 */
public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();

        System.out.println(vowelCounter(str));
    }

    public static String vowelCounter (String str){
        char [] vowels = {'a','e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        int counter = 0;
        int i =0;

        while (i < str.length()){
            int j =0;

            while (j < vowels.length){
                if (str.charAt(i) == vowels[j]){
                    counter++;
                    break;
                }
                j++;
            }
            i++;
        }
        return "Total of vowels is: " + counter;
    }
}
