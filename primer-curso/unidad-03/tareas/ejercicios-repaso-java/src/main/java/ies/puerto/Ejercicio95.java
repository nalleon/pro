package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que compare dos fechas ingresadas por el usuario y determine cuál es anterior, o si son iguales.
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a date: ");
        String strDate = scanner.nextLine();
        System.out.println("Insert another date: ");
        String strAnotherDate = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date anotherDate;
        Date Date;

        try {
            Date = format.parse(strDate);
            anotherDate = format.parse(strAnotherDate);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd/MM/yyyy)");
            throw new RuntimeException(e);
        }
        if (Date.equals(anotherDate)) {
            System.out.println("Dates are the same.");
        } else {
            System.out.println("Dates are different.");
        }
    }
}
