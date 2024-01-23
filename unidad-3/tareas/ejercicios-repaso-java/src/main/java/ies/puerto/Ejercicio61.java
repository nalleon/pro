package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número entero ingresado por el usuario y
 * lo convierta a una cadena, luego muestre la longitud de esa cadena.
 */
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer num: ");
        int num = scanner.nextInt();
        System.out.println("As a string " + num + " has a length of "+ strLength(num));
    }

    public static int strLength (int num){
        String strNum = String.valueOf(num);
        return strNum.length();
    }
}
