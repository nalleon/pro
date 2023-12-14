package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un programa que cuente el número de palabras en una cadena de texto. Considera que las palabras
 * pueden estar separadas por espacios, comas o puntos.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your VISA credit card number: ");
        String text = scanner.nextLine();

        String regex = "(^4([0-9]{3})-([0-9]{4})-([0-9]{4})-([0-9]{4}))";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (text);

        if (matcher.matches()){
            System.out.println("Credit card is valid.");
        } else {
            System.out.println("Credit card is not valid. Use '4XXX-XXXX-XXXX-XXXX' format.");
        }
    }

}
