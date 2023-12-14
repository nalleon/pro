package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que cuente el número de palabras en formato Camel Case
 * (palabras concatenadas sin espacios) en una cadena.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text in Camel Case: ");
        String str = scanner.next();

        String regex = "([a-z])+([A-Z][a-z]*)*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (str);

        if (matcher.matches()){
            System.out.println("Text is in Camel Case");
        } else {
            System.out.println("Text does not have a valid format.");
        }
    }
}
