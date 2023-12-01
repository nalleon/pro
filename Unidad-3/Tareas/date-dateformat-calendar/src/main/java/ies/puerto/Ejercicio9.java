package ies.puerto;

import java.util.Calendar;

/**
 * Crear un programa que obtenga y muestre el primer día del
 * mes actual utilizando la clase Calendar.
 * @author Nabil
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));

        System.out.println("First day is: " + (calendar.get(Calendar.DAY_OF_MONTH)) + "/" + (calendar.get(Calendar.MONTH)+1));

    }
}
