package es.ies.puerto.tarea5.impl;

import es.ies.puerto.tarea5.utilities.Utilities;

import java.util.Objects;

public class Persona extends Utilities {

    private String name;
    private int age;
    private float note;
    private String city;

    public Persona(String name) {
        this.name = name;
    }

    public Persona(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Persona(String name, int age, float note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public Persona(String name, int age, float note, String city) {
        this.name = name;
        this.age = age;
        this.note = note;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String dataToCsv(){
        return name+DELIMITER+age+DELIMITER+city+"\n";
    }
    public String notesToCsv(){
        return name+DELIMITER+age+DELIMITER+note+"\n";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", note=" + note +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(name, persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
