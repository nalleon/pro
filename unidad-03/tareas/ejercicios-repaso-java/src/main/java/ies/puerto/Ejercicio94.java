package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que, dado un mes y año ingresados por el usuario,
 * calcule y muestre cuántos días faltan hasta el final del mes.
 */
public class Ejercicio94 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a date: ");
        String userDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date userDateFormatted = dateFormat.parse(userDateStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(userDateFormatted);

            int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            int daysRemaining = lastDayOfMonth - currentDay;

            System.out.println("Days remaining: " + daysRemaining);
        } catch (ParseException e) {
            System.out.println("ERROR. Use the correct format (dd/MM/yyyy)");

        }

    }
}
