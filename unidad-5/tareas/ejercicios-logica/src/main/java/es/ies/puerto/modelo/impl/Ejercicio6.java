package ies.puerto.modelo.entity.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * La función recibirá dos String y retornará un Int.
 * La diferencia en días será absoluta (no importa el orden de las fechas).
 * Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 */
public class Ejercicio6 {

    public int daysDifference (String date1, String date2) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = dateFormat.parse(date1);
        Date parsedDate2 = dateFormat.parse(date2);

        long differenceInMillis = 24*60*60*1000;
        long difference = parsedDate.getTime() - parsedDate2.getTime();

        long result = difference/differenceInMillis;

        return (int) result;
    }


}
