package ies.puerto;

import java.util.Calendar;

/**
 * Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-2);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Today's date is: " + calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)+1) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
    }

}
