package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que determine si una variable booleana ingresada por
 * el usuario es verdadera o falsa y muestre un mensaje correspondiente.
 */
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value for a boolean: ");
        boolean value = scanner.nextBoolean();

        if (value){
            System.out.println("Value is " + value);
        } else {
            System.out.println("Value is " + value);
        }
    }
}
