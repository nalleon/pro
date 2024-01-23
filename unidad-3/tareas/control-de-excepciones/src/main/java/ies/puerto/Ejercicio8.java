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
    public static void main(String[] args) throws ArithmeticException{
        float askNumber1 = askNumber1();
        float askNumber2 = askNumber2();
        float division = division(askNumber1, askNumber2);

    }

    /**
     * Function that ask for a number via console
     * @return number, if not an integer number e
     */
    public static float askNumber1 (){
        Scanner scanner = new Scanner(System.in);
        float number1 = 0;
        System.out.println("Insert a value:");
        try {
            number1 = scanner.nextFloat();

        } catch (ArithmeticException e){
            System.out.println("Expression is not a number");
            throw new InputMismatchException("Insert a valid value for a number.");
        }
        return number1;
    }
    /**
     * Function that ask for a number via console
     * @return number, if not an integer number e
     */
    public static float askNumber2 (){
        Scanner scanner = new Scanner(System.in);
        float number2 = 0;
        System.out.println("Insert another value:");
        try {
            number2 = scanner.nextFloat();

        } catch (ArithmeticException e){
            System.out.println("Expression is not a number");
            throw new InputMismatchException("Insert a valid value for a number.");
        }
        return number2;
    }

    /**
     * Function that calculates the division of two numbers
     * @param number1 to operate with
     * @param number2 to operate with
     * @return result
     */
    public static float division (float number1, float number2) throws ArithmeticException {
        float result = number1 / number2;
        if (number2 == 0){
            throw new ArithmeticException("Can not divide by 0.");
        }
        System.out.println("Division is: " + result);
        return result;
    }

}
