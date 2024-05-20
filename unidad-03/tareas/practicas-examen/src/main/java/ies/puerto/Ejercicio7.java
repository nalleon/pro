package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que calcule y muestre la suma de los dígitos de un número entero.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number:");
        int num = scanner.nextInt();

        Ejercicio7 ejercicio7 = new Ejercicio7();
        System.out.println("Sum of " +num+ "'s digits is: " + ejercicio7.sumNumDigits(num));
    }


    public int sumNumDigits (int num){
        String strNum = String.valueOf(num);
        int sum = 0;
        for (int i=0; i < strNum.length(); i++){
            int digit = strNum.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }
}



