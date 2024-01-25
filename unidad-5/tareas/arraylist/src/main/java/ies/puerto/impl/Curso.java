package ies.puerto.impl;

import ies.puerto.impl.Alumno;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    private ArrayList<Alumno> alumnos;

    public Curso() {
        this.alumnos = new ArrayList<>();
    }

    public Curso(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addStudents(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminateStudent(Alumno alumno) {
        alumnos.remove(alumno);
    }

    public float avgCourseCalifications() {
        if (alumnos.isEmpty()) {
            return 0.0f;
        }
        float sumCalcification = 0.0f;
        float totalCalcification = 0.0f;

        for (Alumno alumno : alumnos) {
            ArrayList<Float> calcifications = alumno.getCalifications();
            for (Float calcification : calcifications) {
                sumCalcification += calcification;
                totalCalcification++;
            }
        }
        return sumCalcification / totalCalcification;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "alumnos=" + alumnos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(alumnos, curso.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumnos);
    }
}
