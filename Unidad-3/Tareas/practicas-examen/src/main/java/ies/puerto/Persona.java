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

    public long calculateAge(Persona persona){
       Calendar todaysDate = Calendar.getInstance();

       long start = todaysDate.getTimeInMillis();
       long end = dateOfBirth.getTime();

       long age = (Math.abs(start-end)/(1000*60*60*24))/365;

        return age;
    }

    public String zodiacSigns (){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String sign = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            sign = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            sign = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            sign = "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            sign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            sign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            sign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            sign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            sign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            sign = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            sign = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            sign = "Acuarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            sign = "Pisces";
        }

        return sign;
    }

    public String showInformation(){
        return "Information:\n" + name + " | " + dateOfBirth + " | " + zodiacSigns();
    }

    public static void main(String[] args) throws ParseException {
        Persona persona = new Persona("Nabil", "06/07/2005");
        System.out.println("Name: " + persona.name);
        System.out.println("Age: " + persona.calculateAge(persona) + " years old");
        System.out.println("Zodiac sign: " +persona.zodiacSigns());
        System.out.println(persona.showInformation());
    }
}