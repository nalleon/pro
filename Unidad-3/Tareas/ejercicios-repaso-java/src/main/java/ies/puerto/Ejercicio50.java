package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que determine si un año ingresado por el usuario es bisiesto o no
 * (recuerda que un año es bisiesto si es divisible por 4, pero no por 100, o si es divisible por 400).
 */
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int userYear = scanner.nextInt();
        System.out.println(leapYearCheck(userYear));
    }
    public static String leapYearCheck (int userYear) {
        String result = "";
        boolean leapYear = (userYear % 400 == 0 || (userYear % 4 == 0 && userYear % 100 != 0));

        if (leapYear){
            result = userYear + " is a leap year!";
        } else {
            result = userYear + " is a regular year.";
        }
        return result;
    }
}
