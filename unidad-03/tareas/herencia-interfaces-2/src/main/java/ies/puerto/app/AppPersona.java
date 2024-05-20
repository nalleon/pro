package ies.puerto.app;

import ies.puerto.abstrac.EmpleadoAbstract;
import ies.puerto.abstrac.PersonaAbstract;
import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;

import java.text.ParseException;

public class AppPersona {

    static Profesor profesor;
    static Alumno alumno;

    public static void main(String[] args) throws ParseException {

        profesor= new Profesor("Paco", "08/12/2000", 2050f, "English");
        alumno = new Alumno("Adriana", "13/05/2010", "3ºESO");

        System.out.println(profesor.toString());
        System.out.println("> Salary: " + profesor.calculateSalary());
        System.out.println(profesor.teachingClass());
        System.out.println("Age: " + profesor.years());

        profesor.setName("Alan");
        profesor.setBirthDate("09/11/2013");
        profesor.setSpecialty("Math");
        System.out.println("------");
        System.out.println("Updated data: " + profesor.getName() + ", " + profesor.getBirthDate()
                + profesor.getSpecialty());
        System.out.println(profesor.toString());
        System.out.println(profesor.teachingClass());
        System.out.println("Age: " + profesor.years());

        System.out.println("****** STUDENTS *****");
        System.out.println(alumno.toString());
        System.out.println(alumno.studying());
        System.out.println("Age: " + alumno.years());
        alumno.setName("Idaira");
        alumno.setBirthDate("23/06/2004");
        alumno.setLevel("1ºBACH");
        System.out.println("------");
        System.out.println("Updated data: " + alumno.getName() + ", " + alumno.getBirthDate() + ", "
        + alumno.getLevel());
        System.out.println(alumno.toString());
        System.out.println("Age: " + alumno.years());

    }
}
