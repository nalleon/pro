package ies.puerto.app;

import ies.puerto.impl.Alumno;
import ies.puerto.impl.Curso;

import java.util.ArrayList;
import java.util.List;

public class AppAlumno {
    public static void main(String[] args) {
        Alumno alumno;
        Alumno alumno2;
        Curso curso = new Curso();

        ArrayList<Float> calcification = new ArrayList<>();
        calcification.add(5.5f);
        calcification.add(3.6f);
        calcification.add(8f);
        calcification.add(9f);
        alumno = new Alumno("Pepe", "Gonzalez", calcification);
        float avgCal = alumno.averageCalification();
        System.out.println("> Info: " + alumno.toString());
        System.out.println("Average calcification is: " + avgCal);

        alumno2 = new Alumno("Adriana", "Perez", new ArrayList<>(List.of(8.5f, 7.8f, 9.2f)));
        avgCal = alumno2.averageCalification();
        System.out.println("> Info: " + alumno2.toString());
        System.out.println("Average calcification is: " + avgCal);
        curso.addStudents(alumno);
        curso.addStudents(alumno2);

        float avgCourseCal = curso.avgCourseCalifications();
        System.out.println("Average calcification of the course: " + avgCourseCal);
    }
}
