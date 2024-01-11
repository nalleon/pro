package ies.puerto;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que, dado un número de días ingresado por el usuario,
 * calcule y muestre la fecha resultante en el futuro desde la fecha actual.
 */
public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days in the future: ");
        int daysInFuture = scanner.nextInt();

        Date futureDate = calculateFutureDate(daysInFuture);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("The future date is: " + dateFormat.format(futureDate));
    }

    public static Date calculateFutureDate(int daysInFuture) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, daysInFuture);
        return calendar.getTime();
    }
}
