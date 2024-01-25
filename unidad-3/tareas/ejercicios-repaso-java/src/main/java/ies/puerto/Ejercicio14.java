package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que utilice una variable booleana para
 * determinar si un número ingresado por el usuario es par o impar.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parity = true;
        System.out.println("Insert a number: ");
        float num = scanner.nextFloat();

        if (num % 2 != 0){
            parity = false;
        }
        System.out.println(num + " parity's is: " + parity);
    }
}
