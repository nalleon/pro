package es.ies.puerto.abstracts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {

    private String name;
    private String dni;
    private String birthDate;

    /**
     * Constructors of the class
     */
    public  Person (){}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public Person(String name, String dni, String birthDate) {
        this.name = name;
        this.dni = dni;
        this.birthDate = birthDate;
    }

    /**
     * Method to calculate a person's age
     * @param birthDate of the person
     * @return an int with the value of the age
     * @throws ParseException if date of birth does not have correct format (dd/MM/yyyy)
     */
    public int years (String birthDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birth = dateFormat.parse(getBirthDate());
        Date todaysDate = new Date();
        long result = (todaysDate.getTime() / birth.getTime())/(365*24*60*60*1000L);

        return Math.abs((int) result);
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (validateDNI(dni)){
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("Pattern is invalid");
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    /**
     * Method to validate a dni
     * @return true if valid, false if not
     */
    public boolean validateDNI (String dni){
        String regex = "(\\d{8}[A-HJ-NP-TV-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        return matcher.matches();
    }
}
