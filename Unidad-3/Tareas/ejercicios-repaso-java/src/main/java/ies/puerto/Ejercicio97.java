package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar su fecha de nacimiento y muestre su edad exacta en años, meses y días.
 */
public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth (dd/MM/yyyy): ");
        String strDateOfBirth = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirth;

        try {
            dateOfBirth = dateFormat.parse(strDateOfBirth);
        } catch (ParseException e) {
            System.out.println("Date format is incorrect. Use (dd/MM/yyyy)");
            return;
        }
        long[] age = calculateAge(dateOfBirth);
        System.out.println("Your exact age is: " + age[0] + " years, " + age[1] + " months, and " + age[2] + " days.");
    }

    public static long[] calculateAge(Date dateOfBirth) {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);

        long end = today.getTimeInMillis();
        long start = birthDate.getTimeInMillis();

        long differenceInMillis = Math.abs(end - start);

        long totalDays = differenceInMillis / (24 * 60 * 60 * 1000);
        long days = totalDays % 30;
        long years = totalDays / 365;
        long months = (totalDays % 365) / 30;

        return new long[]{years, months, days};
    }
}
