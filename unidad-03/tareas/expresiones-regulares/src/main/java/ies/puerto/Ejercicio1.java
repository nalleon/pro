package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena es una dirección de correo
 * electrónico válida utilizando expresiones regulares.
 * @author Nabil
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String email = "user@domain.com";
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
    }

}
