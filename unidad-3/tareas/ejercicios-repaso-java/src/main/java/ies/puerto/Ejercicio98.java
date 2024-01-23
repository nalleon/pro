package ies.puerto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * Escribe un programa que calcule y muestre el número de días entre dos fechas ingresadas por el usuario.
 */
public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a date: ");
        String strFirstDate = scanner.nextLine();

        System.out.println("Choose a date: ");
        String strSecondDate = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date firstDate;
        Date secondDate;

        try {
            firstDate = dateFormat.parse(strFirstDate);
            secondDate = dateFormat.parse(strSecondDate);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd/MM/yyyy)");
            return;
        }

        long differenceInDays = calculateDifferenceInDays(firstDate, secondDate);

        System.out.println("The number of days between the two dates is: " + differenceInDays + " days.");
    }

    public static long calculateDifferenceInDays(Date firstDate, Date secondDate) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        calendar1.setTime(firstDate);
        calendar2.setTime(secondDate);

        long end = calendar2.getTimeInMillis();
        long start = calendar1.getTimeInMillis();

        return Math.abs((end - start) / (24 * 60 * 60 * 1000));
    }
}
