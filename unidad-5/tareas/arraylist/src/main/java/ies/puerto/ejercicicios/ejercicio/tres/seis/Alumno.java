package ies.puerto.ejercicicios.ejercicio.tres.seis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Implementa una clase Alumno con atributos como nombre, apellido y calificaciones (un ArrayList de float). Crea instancias de esta clase para representar a varios alumnos
 * y calcula el promedio de calificaciones. a la lista.
 */
public class Alumno {
    private String name;
    private String surname;
    private List <Float> calcification;

    /**
     * Constructors of the class
     */
    public Alumno() {
    }

    public Alumno(String name) {
        this.name = name;
    }

    public Alumno(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.calcification = new ArrayList<>();
    }

    public Alumno(String name, String surname, List <Float> calcification) {
        this.name = name;
        this.surname = surname;
        this.calcification = calcification;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List <Float> getCalcifications() {
        return calcification;
    }

    public void setCalcification(List <Float> calcification) {
        this.calcification = calcification;
    }

    /**
     * Method that calculates the average calcification of a student
     * @return float of the average calcification
     */
    public float averageCalcification (){
        if (calcification.isEmpty()){
            return 0f;
        }
        float sum = 0f;
        for (float calcification : calcification){
            sum+= calcification;
        }
        return sum/calcification.size();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", calcification=" + calcification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(name, alumno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
