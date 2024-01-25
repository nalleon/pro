package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Escribe un programa que muestre la fecha actual en el formato "dd/MM/yyyy".
 */
public class Ejercicio91 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);
        System.out.println("Current date is: " + formattedDate);
    }
}
