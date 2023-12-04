package ies.puerto;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un validador que verifique si una cadena sigue el
 * formato de fecha común (por ejemplo, DD/MM/AAAA).
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a date: ");
        String strDate = scanner.next();

        String regex = "(^[0-9]{2})/([0-9]{2})/([0-9]{4}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher (strDate);

        if (matcher.matches()){
            System.out.println("Date has a valid format.");
        } else {
            System.out.println("Date does not have a valid format.");
        }
    }
}
