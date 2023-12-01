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

        System.out.println("Insert a date: ");
        String strAnotherDate = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date anotherDate;

        try {
            anotherDate = format.parse(strAnotherDate);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd-mm-yyyy)");
            throw new RuntimeException(e);
        }


    }



}
