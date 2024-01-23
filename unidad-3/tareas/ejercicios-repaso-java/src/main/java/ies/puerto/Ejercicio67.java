package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome un número decimal, lo convierta a una cadena y
 * muestre cuántos dígitos tiene después del punto decimal.
 */
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a decimal number: ");
        float num = scanner.nextFloat();

        System.out.println(num + " decimal are of lenght " + strShowDecimal(num));
    }

    public static int strShowDecimal (float num){
        String strNum = String.valueOf(num);
        int counter = 0;
        for (int i=0; i<strNum.length(); i++){
            char currentDigit = strNum.charAt(i);
            if (currentDigit == '.'){
                counter = strNum.length()-i-1;
            }
        }
        return counter;
    }
}
