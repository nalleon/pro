package ies.puerto;

import java.util.Scanner;

/**
 * Crea un método que acepte un número y maneja la excepción
 * IllegalArgumentException si el número es negativo.
 * @author Nabil
 */
public class Ejercicio7 {

    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert an integer number bigger or smaller than 0: ");
        int number = scanner.nextInt();
        if (isPositive(number)){
            System.out.println("Number: " + number + " is positive.");
        }



        // int postiveNumber = askPositiveNumber();
    }

    
    public static boolean isPositive (int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number: " + number + " is negative");
        }

        return true;
    }
    
    /**
     * Function that ask via console a number
     * @return if number < 0 str: number can not be negative
     */
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
