package ies.puerto.ejercicicios.ejercicio.once.impl;

import ies.puerto.ejercicicios.ejercicio.once.abstracts.PersonaAbstrac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alumno extends PersonaAbstrac {
    private List<Float> studentsGrades;

    /**
     * Default constructor of the class
     */
    public Alumno() {
        this.studentsGrades = new ArrayList<>();
    }

    /**
     * Constructor of the class
     * @param name of the student
     * @param birthDate of the student
     * @param dni of the student
     * @param studentsGrades of the student
     */
    public Alumno(String name, String birthDate, String dni, List<Float> studentsGrades) {
        super(name, birthDate, dni);
        this.studentsGrades = studentsGrades;
    }

    /**
     * Getters and setters
     */

    public List<Float> getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(List<Float> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    /**
     * Method that calculates the average grades for each student
     * @return float average grade
     */
    public List<Float> averageGradesPerStudent() {
        List<Float> result = new ArrayList<>();
        if (studentsGrades.isEmpty()) {
            return result;
        }

        float sum = 0f;
        for (float grades : studentsGrades) {
            sum += grades;
        }

        float average = sum / studentsGrades.size();

        for (int i = 0; i < studentsGrades.size(); i++) {
            result.add(average);
        }

        return result;
    }


    @Override
    public String toString() {
        return "Alumno{" +  "name='" + super.getName() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                "studentsGrades=" + studentsGrades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(studentsGrades, alumno.studentsGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentsGrades);
    }
}
