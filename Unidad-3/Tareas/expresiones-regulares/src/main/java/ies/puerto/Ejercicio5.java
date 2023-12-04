package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que reemplace todas las etiquetas HTML en una
 *  cadena con su contenido. Por ejemplo: <p>Texto</p> se convertiría a Texto.
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a HTML etiquette with content (example:<p>Text</p>): ");
        String text = scanner.next();

        String regex = "((^<[a-zA-Z])-([a-zA-Z0-9])";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (text);

        if (matcher.matches()){
            System.out.println("Text has been converted successfully.");
        } else {
            System.out.println("Text could not be converted.");
        }
    }
}
