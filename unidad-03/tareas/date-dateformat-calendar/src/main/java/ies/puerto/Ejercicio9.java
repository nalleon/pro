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
        int firstDayMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

        System.out.println("First day is: " + firstDayMonth + "/" + (calendar.get(Calendar.MONTH)+1));
    }
}
