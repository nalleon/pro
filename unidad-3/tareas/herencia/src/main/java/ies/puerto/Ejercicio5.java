package ies.puerto;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Crea un programa que reemplace todas las ocurrencias de una
 * letra específica en una cadena de texto.
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text: ");
        String str = scanner.nextLine();
        String str2 = "";
        char letterReplacement = 'e';

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != letterReplacement){
                str2 += str.charAt(i);
            } else {
                str2 += 'a';
            }
        }
        str = str2;
        System.out.println(str);


        // System.out.println("Select a letter to replace in your text: ");
        // char letterReplacement = scanner.next().charAt(0);

        // System.out.println("Select a letter to with replace the selected one: ");
        // char letterReplacementText = scanner.next().charAt(0);

        // for (int i=0; i < str.length(); i++){
            // if (str.charAt(i) == str.charAt(letterReplacementText)){
               // str.charAt(i) = letterReplacement;
            // }
        // }
    }
}
