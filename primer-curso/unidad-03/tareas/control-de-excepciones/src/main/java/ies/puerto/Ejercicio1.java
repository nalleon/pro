package ies.puerto;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números e imprima el resultado de la división. Asegúrate de
 * manejar la excepción ArithmeticException si el segundo número ingresado es 0.
 * @author Nabil
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int value1 = askNumber();
        int value2 = askNumber();
        int result = division(value1, value2);
        System.out.println("Result of the division: " + result);
    }

    /**
     * Function that asks through keyboard a number
     * @return selected number
     */
    public  static int askNumber (){
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value:");
        value = scanner.nextInt();

        return value;
    }

    /**
     * Function that does the division of two numbers
     * @param division2 of the division
     * @param divider of the division
     * @return result
     */
    public static int division(int division2, int divider) throws Exception {
        int result = 0;
        try {
            result = division2 / divider;
        } catch (ArithmeticException e){
            String errorMessage = "Tried to do a division by 0";
            System.out.println("Message of println: " + errorMessage);
            throw new Exception(errorMessage);
        }
        return result;
    }
}
