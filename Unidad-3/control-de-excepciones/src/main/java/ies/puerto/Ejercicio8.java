package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números y realice la división.
 * Maneja la excepción InputMismatchException si el usuario ingresa
 * algo que no es un número.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int askNumber1 = askNumber1();
        int askNumber2 = askNumber2();
        int division = division(askNumber1, askNumber2);
    }

    /**
     * Function that ask for a number via console
     * @return number, if not an integer number e
     */
    public static int askNumber1 (){
        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        System.out.println("Insert a value:");
        try {
            number1 = scanner.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Expression is not an integer number");
            throw e;
        }
        return number1;
    }
    /**
     * Function that ask for a number via console
     * @return number, if not an integer number e
     */
    public static int askNumber2 (){
        Scanner scanner = new Scanner(System.in);
        int number2 = 0;
        System.out.println("Insert another value:");
        try {
            number2 = scanner.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Expression is not a number");
            throw e;
        }

        return number2;
    }

    /**
     * Function that calculates the division of two numbers
     * @param number1 to operate with
     * @param number2 to operate with
     * @return result
     */
    public static int division (int number1, int number2){
        int result = number1 / number2;
        System.out.println("Division is: " + result);
        return result;
    }

}
