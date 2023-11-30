package ies.puerto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy"
 * a un objeto Date utilizando SimpleDateFormat.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Date todaysDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String updatedDate = dateFormat.format(todaysDate);
    }

}
