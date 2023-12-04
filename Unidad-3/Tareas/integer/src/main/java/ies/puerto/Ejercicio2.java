package ies.puerto;
/**
 * Escribe un programa que convierta un número entero en una cadena de
 * texto y viceversa utilizando los métodos de la clase Integer.
 * @author Nabil
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insert an integer number: ");
            String strNumber = scanner.next();
            int strToInt = strToInt(strNumber);
            System.out.println(strToInt);

            System.out.println("Insert another integer number: ");
            int intNumber = scanner.nextInt();

            String intToStr = intToStr(intNumber);
            System.out.println(intToStr);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. Number is not valid, please use an integer number.");
        }
    }

    /**
     * Function to convert a string into an int
     * @param strNumber to convert
     * @return strNumber as an int
     */
    public static Integer strToInt(String strNumber){
        return Integer.parseInt(strNumber);
    }

    /**
     * Function to convert an int into a string
     * @param intNumber to convert
     * @return intNumber as a string
     */
    public static String intToStr(int intNumber){
        return Integer.toString(intNumber);
    }
}
