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
        String text = scanner.nextLine();

        String regex = "(<[a-zA-Z0-9])+>(.*?)<(/[a-zA-Z0-9]+>$)";
        String trimText = text.trim();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (trimText);

        if (matcher.matches()){
            System.out.println(matcher.group(2));
        } else {
            System.out.println("Text could not be converted.");
        }
    }
}
