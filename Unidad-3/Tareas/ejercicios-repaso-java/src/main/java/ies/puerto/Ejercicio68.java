package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero y un número decimal ingresados por el usuario,
 * los multiplique y muestre el resultado en una cadena junto con un mensaje.
 */
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int num = scanner.nextInt();
        System.out.println("Insert a decimal number: ");
        float decimalNum = scanner.nextFloat();
        System.out.println(showResult(num, decimalNum));
    }

    public static String showResult (int num, float decimalNum){
        int intMultiplication= num * (int) decimalNum;
        float floatMultiplication = (float) num * decimalNum;
        String intResult = String.valueOf(intMultiplication);
        String floatResult = String.valueOf(floatMultiplication);
        return "Result of int multiplication: " + intResult + "\nResult of float multiplication: " +floatResult;
    }
}
