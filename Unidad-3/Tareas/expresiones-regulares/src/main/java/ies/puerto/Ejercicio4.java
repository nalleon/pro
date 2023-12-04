package ies.puerto;

import java.util.Arrays;
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
        System.out.println("Insert a date: ");
        String strDate = scanner.next();

        String regex = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (strDate);

        if (matcher.matches()){
            System.out.println(" ");
        } else {
            System.out.println("Date does not have a valid format.");
        }
    }
}
