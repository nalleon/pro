package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que determine si un número entero es positivo, negativo
 * o cero utilizando métodos de la clase Integer.
 * @author Nabil
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Insert an integer number: ");
        Integer integerNum = scanner.nextInt();

        if (integerNum < 0){
            System.out.println("Number is negative.");
        } else if (integerNum == 0) {
            System.out.println("Number is zero.");
        } else {
            System.out.println("Number is positive.");
            }
        } catch (InputMismatchException e){
            System.out.println("Value is not valid. Do NOT use a string or decimal number, use an integer number.");
        }
    }
}
