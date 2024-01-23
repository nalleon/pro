package ies.puerto.abstrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PersonaAbstract {

    private String name;
    private String birthDate;

    /**
     * Default constructor of the class
     */
    public  PersonaAbstract (){}

    /**
     * Constructor of the class
     * @param name of the person
     */
    public PersonaAbstract(String name) {
        this.name = name;
    }

    /**
     * Constructor of the class
     * @param name of the person
     * @param birthDate of the person
     */
    public PersonaAbstract(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Method to obtain a person's age
     * @return person's age
     */
    public int years () throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = dateFormat.parse(getBirthDate());
        Date todaysDate = new Date();
        todaysDate = dateFormat.parse(dateFormat.format(todaysDate));
        long result = (todaysDate.getTime() - birthDate.getTime())/(365*24*60*60*1000L);

        return Math.abs((int)result);
    }
}
