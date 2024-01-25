package ies.puerto.abstrac;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AlumnoAbstrac {
    private String name;
    private String surname;
    private ArrayList<Float> calcification;

    /**
     * Constructors of the class
     */
    public AlumnoAbstrac() {
    }

    public AlumnoAbstrac(String name) {
        this.name = name;
    }

    public AlumnoAbstrac(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public AlumnoAbstrac(String name, String surname, ArrayList<Float> califications) {
        this.name = name;
        this.surname = surname;
        this.calcification = califications;
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

    public ArrayList<Float> getCalifications() {
        return calcification;
    }

    public void setCalcification(ArrayList<Float> calcification) {
        this.calcification = calcification;
    }

    public Float averageCalification (){
        if (calcification.isEmpty()){
            return 0.0f;
        }
        float sum = 0.0f;
        for (float calification : calcification){
            sum+= calification;
        }

        return sum/calcification.size();
    }

    @Override
    public String toString() {
        return "AlumnoAbstrac{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", califications=" + calcification +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoAbstrac that = (AlumnoAbstrac) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname)
                && Objects.equals(calcification, that.calcification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, calcification);
    }
}
