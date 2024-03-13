package es.ies.puerto.modelo.impl;
/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */
public class Ejercicio15 {

    public long conversionMilliseconds (int days, int hours, int minutes, int seconds){

        int daysToMilli = days*24*60*60*1000;
        int hoursToMilli = hours*60*60*1000;
        int minutesToMilli = minutes*60*1000;
        int secondsToMilli = seconds*1000;

        return daysToMilli+hoursToMilli+minutesToMilli+secondsToMilli;
    }
}
