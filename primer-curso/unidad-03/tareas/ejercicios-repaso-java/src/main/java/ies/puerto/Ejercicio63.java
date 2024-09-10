package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome tu nombre y apellido ingresados por separado y muestre tu nombre completo en una sola línea.
 */
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("What is your surname? ");
        String surname = scanner.next();
        System.out.println("Your full name is: " + fullName(name, surname));
    }

    public static String fullName (String name, String surname){
        return name.concat(surname);
    }
}
