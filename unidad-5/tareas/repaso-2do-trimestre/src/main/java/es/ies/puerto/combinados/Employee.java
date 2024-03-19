package es.ies.puerto.combinados;

import es.ies.puerto.combinados.abstracts.Utilities;
import org.simpleframework.xml.Element;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends Utilities {
    @Element(name = "dni")
    private String dni;
    @Element(name = "name")
    private String name;
    @Element(name = "surname")
    private String surname;
    @Element(name = "salary")
    private float salary;
    @Element(name = "occupation")
    private String occupation;


    public Employee(){

    }

    public Employee(String dni){
        this.dni = dni;
    }
    public Employee(String dni, String name, String surname, float salary, String occupation) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.occupation = occupation;
    }

    /**
     * Getters and setters
     */
    public String getDni() {
        if (validateDni(dni)){
            return dni;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Employee{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(dni, employee.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public boolean validateDni(String dni){
        Pattern pattern = Pattern.compile("\\d{8}[A-Z]{1}$");
        Matcher matcher = pattern.matcher(dni);

        return matcher.matches();
    }

    public String toCsv(){
        return dni+DELIMITER+name+DELIMITER+surname+DELIMITER+salary+DELIMITER+occupation;
    }
}
