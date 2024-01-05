package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que compare dos números enteros ingresados por el usuario y muestre cuál es mayor o si son iguales.
 */
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Insert another integer number: ");
        int num2 = scanner.nextInt();

        System.out.println(comparision(num1, num2));


    }

    public static String comparision (int num1, int num2){
        String result = "";
        if (num1 > num2){
            result = num1 + " is greater than " + num2;

        } else if (num2 > num1) {
            result = num2 + " is greater than " + num1;
        } else {
            result = num1 + " and " + num2 + " are equals.";
        }
        return result;
    }
}
