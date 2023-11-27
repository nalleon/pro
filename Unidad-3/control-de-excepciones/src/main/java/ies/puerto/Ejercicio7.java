package ies.puerto;

import java.util.Scanner;

/**
 * Crea un método que acepte un número y maneja la excepción
 * IllegalArgumentException si el número es negativo.
 * @author Nabil
 */
public class Ejercicio7 {

    public static void main(String[] args) {
    int postiveNumber = askPositiveNumber();
    }

    public static  int askPositiveNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a positive number:");
        int value = scanner.nextInt();

        if (value < 0){
            throw new IllegalArgumentException("Number can not be negative.");
        }
        return value;
    }
}
