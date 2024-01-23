package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que cuente el número de vocales en una cadena de texto.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a string:");
        String str = scanner.nextLine();

        Ejercicio6 ejercicio6 = new Ejercicio6();
        System.out.println("Number of vowels is: " + ejercicio6.vowelsCounter(str));

    }

    public int vowelsCounter (String str){
        int counter = 0;

        char [] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

        for (int i =0; i < str.length(); i++){
            for (int j=0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
