package ies.puerto;
import java.util.Scanner;
/**
 * Crea un programa que solicite al usuario un número
 * (puede ser entero o decimal) y determine si es divisible por 5.
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        float num1 = scanner.nextFloat();
        System.out.println(div5(num1));
    }
    public static String div5 (float num1){
        String result = "";
        if (num1 % 5 ==0){
            result = num1 + " is divisible by 5.";
        } else {
            result = num1 + " is NOT divisible by 5.";
        }
        return result;
    }
}
