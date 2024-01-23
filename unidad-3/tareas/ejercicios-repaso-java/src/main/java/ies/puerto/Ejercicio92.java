package ies.puerto;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

/**
 * Desarrolla un programa que calcule y muestre cuántos días han pasado
 * desde una fecha ingresada por el usuario hasta la fecha actual.
 */
public class Ejercicio92 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.println("Choose a date: ");
        String userDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date userDateFormatted = dateFormat.parse(userDateStr);

            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(userDateFormatted);

            long end = calendar2.getTimeInMillis();
            long start = calendar.getTimeInMillis();

            System.out.println("Difference is of " + Math.abs((end - start) / (24 * 60 * 60 * 1000)) + " days from " +
                    "today's date.");
        } catch (ParseException e) {
            System.out.println("ERROR. Use the correct format (dd/MM/yyyy)");

        }

    }
}
