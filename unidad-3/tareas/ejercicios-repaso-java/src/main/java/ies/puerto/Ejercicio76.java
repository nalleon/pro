package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar números positivos utilizando un bucle do-while.
 * El bucle debe continuar hasta que el usuario ingrese un número negativo.
 */
public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        float num = scanner.nextFloat();
        do {
            num = scanner.nextFloat();
        } while (num > 0);
    }
}

