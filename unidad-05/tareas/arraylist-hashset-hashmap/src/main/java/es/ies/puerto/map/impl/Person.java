package es.ies.puerto.map.impl;

import java.util.Objects;

public class Person {
    private String name;
    private String dni;

    /**
     * Default constructor of the class
     */
    public Person (){}

    /**
     * Constructor of the class
     * @param name of the person
     * @param dni of the person
     */
    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
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
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

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
}
