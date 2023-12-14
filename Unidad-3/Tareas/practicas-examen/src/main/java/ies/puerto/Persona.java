package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Escribe un programa que compare dos cadenas de texto e indique
 * si son iguales o diferentes.
 * @author Nabil
 */

public class Persona {
    private String name;
    private Date dateOfBirth;

    public  Persona (){}

    public Persona(String name) {
        this.name = name;
    }
    public Persona(String name, String dateOfBirth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.name = name;
        this.dateOfBirth = dateFormat.parse(dateOfBirth);
    }

    public long calculateEdad(Persona persona){
       Calendar todaysDate = Calendar.getInstance();

       long start = todaysDate.getTimeInMillis();
       long end = dateOfBirth.getTime();

       long age = (Math.abs(start-end)/(1000*60*60*24))/365;
        System.out.println(age);

        return age;
    }

    public boolean zodiacSigns (){

        Calendar calendar = Calendar.getInstance();
        calendarcalendar.set((Calendar.MONTH+1), Calendar.DAY_OF_MONTH);

        if (dateOfBirth == calendar.)

        return true;
    }
}