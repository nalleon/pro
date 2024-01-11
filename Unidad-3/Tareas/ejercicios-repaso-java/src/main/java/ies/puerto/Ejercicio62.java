package ies.puerto;
import java.util.Scanner;

/**
 * Crea un programa que tome dos números enteros ingresados por el usuario, realice la suma y muestre el resultado.
 */
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer num: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another integer num: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum is: " + numSum(num1, num2));
    }

    public static int numSum (int num1, int num2){
        return num1+num2;
    }
}
