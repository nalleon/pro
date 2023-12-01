package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrollar un programa que compare dos fechas utilizando la clase
 * Date y muestre si son iguales o diferentes.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date todaysDate = new Date();

        System.out.println("Insert a date: ");
        String strAnotherDate = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date anotherDate;

        try {
            anotherDate = format.parse(strAnotherDate);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd-mm-yyyy)");
            throw new RuntimeException(e);
        }
        if (todaysDate.equals(anotherDate)) {
            System.out.println("Dates are the same.");
        } else {
            System.out.println("Dates are different.");
        }
    }
}
