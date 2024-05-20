package ies.puerto;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros como entrada y muestre el
 * máximo común divisor utilizando métodos de la clase Integer.
 * @author Nabil;
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Insert another integer number: ");
        int anotherNumber = scanner.nextInt();

        int gcd = findGCD(number, anotherNumber);
        System.out.println("GCD of " + number + " and " + anotherNumber + ": " + gcd);
    }
    
    public static int findGCD(int num1, int num2){
        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
