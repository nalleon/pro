package ies.puerto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto y luego intente convertirla a
 * un objeto Date. Maneja la excepción ParseException.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a date:");
        String dateString = scanner.nextLine();

            Date date = convertDate(dateString);
    }

    /**
     * Funtion that transforms the date into a format (dd-mm-yyyy)
     * @param dateString to transform
     * @return date
     */
    private static Date convertDate (String dateString) {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Capturing an exception because date is incorrect.");
            throw new RuntimeException(e);
        }
        return date;
    }
}