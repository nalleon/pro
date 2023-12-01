package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribir un programa que calcule la diferencia en días entre
 * dos fechas utilizando la clase Calendar.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 6);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.YEAR, 2023);
        calendar2.set(Calendar.MONTH, 2);
        calendar2.set(Calendar.DAY_OF_MONTH, 1);

       long end = calendar2.getTimeInMillis();
       long start = calendar.getTimeInMillis();
       long days = (end - start)/(24*60*60*1000);
        System.out.println("Difference is of " + days + " days.");



    }



}
