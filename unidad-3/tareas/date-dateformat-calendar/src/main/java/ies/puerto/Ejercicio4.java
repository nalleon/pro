package ies.puerto;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Implementar un programa que sume 10 días a la fecha
 * actual utilizando la clase Calendar.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)+10);

        System.out.println("Today's date is: " + calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
    }
}
