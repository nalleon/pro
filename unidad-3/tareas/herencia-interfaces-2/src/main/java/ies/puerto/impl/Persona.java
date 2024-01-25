package ies.puerto.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    private String dni;
    private String name;
    private String surname1;
    private String surname2;
    List<Double> califications;
    /**
     * Default constructor of the class
     */
    public Persona (){}

    public Persona(String dni, String name, String surname1, String surname2) {
        this.dni = dni;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        califications = new ArrayList<>();
    }

    public Persona(String dni, String name, String surname1, String surname2, List<Double> califications) {
        this.dni = dni;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.califications = califications;
    }

    public Double averageCalifications(){
        Double result = 0d;
        Double sum = 0d;
        if (califications.isEmpty()){
            return result;
        }
        for (Double score:califications){
            sum+=score;
        }
        result = sum/califications.size();
        return result;

    }
    @Override
    public String toString(){
        return "{dni:" +dni +", nombre: " +name+ ", surname1: " +surname1+ ", surname2: " + surname2 +", califications:  " + califications+"}" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


}
