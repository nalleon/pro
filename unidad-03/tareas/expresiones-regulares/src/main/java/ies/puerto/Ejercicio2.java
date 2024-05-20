package ies.puerto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todos los números de teléfono válidos
 * (con formato +XX-XXX-XX-XX-XX) de una cadena dada. (Combina lo aprendido).
 * @author Nabil
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a phone number");
        String phoneNumber = scanner.nextLine();

        String regex = "(^\\+[0-9]{2})-([0-9]{3})-([0-9]{2})-([0-9]{2})-([0-9]{2}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()){
            System.out.println("Phone number is valid.");
        } else {
            System.out.println("Phone number is invalid.");
        }
    }


}
