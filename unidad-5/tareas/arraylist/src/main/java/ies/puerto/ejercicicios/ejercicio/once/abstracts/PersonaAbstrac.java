package ies.puerto.ejercicicios.ejercicio.once.abstracts;
import ies.puerto.excepciones.ValidacionException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * El siguiente ejercicio tiene como objetivo la comprensión de
 * jerarquías en programación, así como el uso de List de colecciones.
 */
public abstract class PersonaAbstrac {

    private String name;
    private String birthDate;
    private String dni;


    /**
     * Default constructor of the class
     */
    public PersonaAbstrac(){}

    /**
     * Constructor of the class
     * @param name of the person
     */
    public PersonaAbstrac(String name) {
        this.name = name;
    }

    /**
     * Constructor of the class
     * @param name of the person
     * @param birthDate of the person
     */
    public PersonaAbstrac(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     * Constructor of the class
     * @param name of the person
     * @param birthDate of the person
     * @param dni of the person
     */
    public PersonaAbstrac(String name, String birthDate, String dni) {
        this.name = name;
        this.birthDate = birthDate;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws ValidacionException {
        if (validateDNI(dni)) {
            this.dni = dni;
        } else {
            throw new ValidacionException("DNI is invalid.");
        }
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

    /**
     * Method to verify if a person dni is valid
     * @param dni to evalue
     * @return true if valid, false if not
     */
    public boolean validateDNI (String dni){
        String regex = "(\\d{8}[A-HJ-NP-TV-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        return matcher.matches();
    }

    /**
     * Method to validated someone's age
     * @param age to evalue
     * @return true if valid, false if not
     */
    public boolean validateAge(int age){
        return age >= 0;
    }

    @Override
    public String toString() {
        return "PersonaAbstrac{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaAbstrac that = (PersonaAbstrac) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}

