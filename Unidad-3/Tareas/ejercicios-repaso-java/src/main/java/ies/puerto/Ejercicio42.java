package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número decimal ingresado por el usuario es positivo, negativo o cero.
 */
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a decimal number: ");
        float num = scanner.nextFloat();

        System.out.println(comparision(num));

    }
    public static String comparision (float num){
        String result = "";
        if (num > 0){
            result = "Num is positive.";
        } else if (num < 0) {
            result = "Num is negative.";
        } else {
            result = "Num is zero.";
        }
        return result;
    }

}
