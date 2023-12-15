package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su
 * representación binaria utilizando métodos de la clase Integer.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number:");
        int num = scanner.nextInt();

        Ejercicio8 ejercicio8 = new Ejercicio8();
        System.out.println(num +" in binary: "+ ejercicio8.binaryNum(num));
    }

    public String binaryNum (int num){
        return Integer.toBinaryString(num);
    }
}

