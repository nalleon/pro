package ies.puerto;

import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sábado o domingo
 * utilizando la clase Calendar y muestre un mensaje apropiado.
 * @author Nabil
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_WEEK, calendar.get(Calendar.DAY_OF_WEEK));

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            System.out.println("Today is weekend.");
        } else {
            System.out.println("Today is a regular day.");
        }
    }
}
