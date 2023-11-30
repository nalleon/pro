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
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today's date is: " + year + "-" + month + "-" + day);
    }
}
