package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que determine el día de la semana de una
 * fecha ingresada por el usuario (por ejemplo, lunes, martes, etc.).
 */
public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a date: ");
        String userDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date userDateFormatted = dateFormat.parse(userDateStr);

            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(userDateFormatted);

            int day = calendar2.get(Calendar.DAY_OF_WEEK)-1;

            if (day == 1){
                System.out.println(userDateFormatted + " is Monday");
            } else if (day == 2) {
                System.out.println(userDateFormatted +" is Tuesday");
            } else if (day == 3) {
                System.out.println(userDateFormatted +" is Wednesday");
            } else if (day == 4) {
                System.out.println(userDateFormatted + " is Thursday");
            } else if (day == 5) {
                System.out.println(userDateFormatted + " is Friday");
            } else if (day == 6) {
                System.out.println(userDateFormatted + " is Saturday");
            } else {
                System.out.println(userDateFormatted + " is Sunday");
            }

        } catch (ParseException e) {
            System.out.println("ERROR. Use the correct format (dd/MM/yyyy)");
        }
    }
}
