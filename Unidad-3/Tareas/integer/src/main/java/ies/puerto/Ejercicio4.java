package ies.puerto;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Implementa un programa que calcule y muestre la suma de
 * los dígitos de un número entero.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insert an integer number: ");
            int number = scanner.nextInt();

            String strNumber = String.valueOf(number);

            int sum = 0;

            for (int i = 0; i < strNumber.length(); i++) {
                int digits = Character.getNumericValue(strNumber.charAt(i));
                sum += digits;
            }
            System.out.println("Sum is: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. Number is not valid, please use an integer number.");
        }
    }
}
