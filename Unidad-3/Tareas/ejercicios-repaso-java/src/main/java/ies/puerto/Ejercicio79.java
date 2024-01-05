package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que tome un número entero ingresado por el usuario y
 * cuente cuántos dígitos tiene utilizando un bucle for.
 */
public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " length is " + digitsCounter(num));
    }

    public static int digitsCounter (int num){
        int counter = 0;
        String strNum = String.valueOf(num);
        for (int i=0; i < strNum.length(); i++){
            counter++;
        }
        return counter;
    }
}
