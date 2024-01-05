package ies.puerto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * Haz un programa que determine si una fecha ingresada por el usuario corresponde a un día festivo específico
 * (por ejemplo, Navidad o Año Nuevo) y muestre un mensaje adecuado.
 */
public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date (dd/MM/yyyy): ");
        String userDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date userDateFormatted = dateFormat.parse(userDateStr);

            if (isChristmas(userDateFormatted)) {
                System.out.println("It's Christmas!");
            } else if (isNewYear(userDateFormatted)) {
                System.out.println("It's New Year's Day!");
            } else {
                System.out.println("The entered date is not a specific holiday.");
            }
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd/MM/yyyy)");
        }
    }

    public static boolean isChristmas(Date date) {
        Calendar christmas = Calendar.getInstance();
        christmas.set(Calendar.MONTH, Calendar.DECEMBER);
        christmas.set(Calendar.DAY_OF_MONTH, 25);

        return isSameDay(date, christmas.getTime());
    }

    public static boolean isNewYear(Date date) {
        Calendar newYear = Calendar.getInstance();
        newYear.set(Calendar.MONTH, Calendar.JANUARY);
        newYear.set(Calendar.DAY_OF_MONTH, 1);

        return isSameDay(date, newYear.getTime());
    }

    public static boolean isSameDay(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);

        return  calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR) &&
                calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH) &&
                calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH);
    }
}
