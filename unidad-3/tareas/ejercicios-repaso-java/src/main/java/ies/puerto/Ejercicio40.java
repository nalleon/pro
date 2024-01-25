package ies.puerto;
import java.util.Scanner;

/**
 * Crea un programa que determine si un año ingresado por el usuario es bisiesto o no
 * (recuerda que un año es bisiesto si es divisible por 4, pero no por 100, o si es divisible por 400).
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int userYear = scanner.nextInt();
        boolean leapYear = (userYear % 400 == 0 || (userYear % 4 == 0 && userYear % 100 != 0));
        if (leapYear){
            System.out.println(userYear + " is a leap year!");
        } else {
            System.out.println(userYear + " is a regular year.");
        }
    }
}
