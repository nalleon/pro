package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que permita al usuario ingresar una fecha y un número de días,
 * y calcule la fecha resultante después de sumar esos días.
 */
public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a date (dd/MM/yyyy): ");
        String strDate = scanner.nextLine();

        System.out.println("Insert a number of days to add: ");
        int daysToAdd = scanner.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date;

        try {
            date = dateFormat.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd/MM/yyyy)");
            return;
        }

        Date resultDate = addDaysToDate(date, daysToAdd);

        System.out.println("Resulting date after adding " + daysToAdd + " days: " + dateFormat.format(resultDate));
    }

    public static Date addDaysToDate(Date date, int daysToAdd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
        return calendar.getTime();
    }
}
