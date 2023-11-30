package ies.puerto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss"
 * utilizando la clase SimpleDateFormat de DateFormat.
 * @author Nabil
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        Date todaysDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String updatedDate = dateFormat.format(todaysDate);

        System.out.println("Updated date is: " + updatedDate);
    }
}
