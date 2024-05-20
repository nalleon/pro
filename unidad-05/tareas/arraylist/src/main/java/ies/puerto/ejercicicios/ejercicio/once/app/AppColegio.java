package ies.puerto.ejercicicios.ejercicio.once.app;

import ies.puerto.ejercicicios.ejercicio.once.impl.Alumno;
import ies.puerto.ejercicicios.ejercicio.once.impl.Aula;
import ies.puerto.ejercicicios.ejercicio.once.impl.Colegio;
import ies.puerto.ejercicicios.ejercicio.once.impl.Profesor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppColegio {
    public static void main(String[] args) throws ParseException {
        List<Aula> schoolList = new ArrayList<>(Arrays.asList(class1, class2));
        Colegio colegio = new Colegio("IES ALCALA", "C/ Ikbal Masih",
                "Alcalá, Guia de Isora 38687", schoolList);


        System.out.println("AVG Grades School: " + colegio.averageGradesSchool(schoolList));
        System.out.println("Max Grades of each Students: " + colegio.getMaxGradesOfStudents());
        System.out.println("Max Salary of Professors: " + colegio.getMaxSalaryOfProfessors());
        System.out.println("Min Salary of Professors: " + colegio.getMinSalaryOfProfessors());
        System.out.println("Average Salary of Professors: " + colegio.getAverageSalaryOfTeachers());
        System.out.println("Average Age of Professors: " + colegio.getAverageAgeOfTeachers());
        System.out.println("Average Age of Students: " + colegio.getAverageAgeOfStudents());

        /**
         * DNI search not found
         */
        String idToSearch = "12345678A";
        System.out.println("Information by ID/DNI: " + colegio.searchInformationByDNI(idToSearch));
        /**
        * Student DNI search
        */
        idToSearch = "23456789P";
        System.out.println("Information by ID/DNI: " + colegio.searchInformationByDNI(idToSearch));
        /**
         * Professor DNI search
         */
        idToSearch = "47658382P";
        System.out.println("Information by ID/DNI: " + colegio.searchInformationByDNI(idToSearch));
        /**
         * Class DNI (name of class) search
         */
        idToSearch = "1DAW";
        System.out.println("Information by ID/DNI: " + colegio.searchInformationByDNI(idToSearch));
    }

    /**
     * Calls for other classes
     */
    static Alumno student = new Alumno("Nabil", "06/07/2005", "23456789P", new ArrayList<>
            (Arrays.asList(4f, 5.6f, 7.8f, 8.9f, 10f, 2.4f)));
    static Alumno student2 = new Alumno("Idaira", "24/06/2004", "2345319P", new ArrayList<>
            (Arrays.asList(1f, 5f, 8f, 3.9f, 10f, 2.4f)));
    static Alumno student3 = new Alumno("Alejandro Jesus", "31/07/2002", "3475319P", new ArrayList<>
            (Arrays.asList(8f, 5f, 8f, 8.9f, 3f, 7f)));
    static Alumno student4 = new Alumno("Yguanira", "08/08/2005", "34658762W", new ArrayList<>
            (Arrays.asList(4f, 5.6f, 7.8f, 8.9f, 1.7f, 2.4f)));
    static Alumno student5 = new Alumno("Santiago", "20/05/2005", "35111467R", new ArrayList<>
            (Arrays.asList(1f, 5f, 8f, 6.9f, 0f, 2.4f)));
    static Alumno student6 = new Alumno("Hector", "12/10/2006", "98603134K", new ArrayList<>
            (Arrays.asList(9f, 3f, 8f, 3.9f, 3f, 7f)));
    static Profesor belen = new Profesor("Belen", "06/07/1976", "23754489L", "Profesor"
            , 1850f, "Arquitectura");
    static Profesor gerardo = new Profesor("Gerardo", "15/03/1978", "47658382P", "Profesor"
            , 1800f, "Historia");
    static Aula class1 = new Aula("1DAM", belen, new ArrayList<>
            (Arrays.asList(student, student2, student3)));
    static  Aula class2 = new Aula("1DAW", gerardo, new ArrayList<>
            (Arrays.asList(student4, student5, student6)));
}
