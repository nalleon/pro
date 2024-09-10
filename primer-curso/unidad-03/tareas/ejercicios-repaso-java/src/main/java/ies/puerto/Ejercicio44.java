package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que determine si una variable booleana ingresada por
 * el usuario es verdadera o falsa y muestre un mensaje correspondiente.
 */
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value for a boolean: ");
        boolean value = scanner.nextBoolean();

        System.out.println(booleanStatus(value));
    }

    public static String booleanStatus (boolean value){
        String result = "";
        if (value){
            result = "Value is " + value;
        } else {
            result = "Value is " + value;
        }
        return  result;
    }
}
