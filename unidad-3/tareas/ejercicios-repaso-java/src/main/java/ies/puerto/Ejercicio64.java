package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número ingresado como cadena y
 * lo convierta a un valor entero, luego multiplícalo por 2 y muestra el resultado.
 */
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        String strNum = scanner.next();
        System.out.println(intNumX2(strNum));
    }

    public static int intNumX2 (String strNum){
        return Integer.parseInt(strNum)*2;
    }
}
