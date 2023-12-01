package ies.puerto;

import java.util.Calendar;

/**
 * Escribir un programa que utilice la clase Calendar para obtener y mostrar la fecha actual
 * con los componentes separados (año, mes, día).
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Today's date is: " + calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH)) + "/" + calendar.get(Calendar.DAY_OF_MONTH));
    }
}

