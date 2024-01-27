package ies.puerto.ejercicicios.ejercicio.once;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppColegio {
    static Alumno student;
    static Alumno student2;
    static Alumno student3;
    static Aula class1;

    public static void main(String[] args) {
        student = new Alumno("Nabil", "06/07/2005", "23456789P", new ArrayList<>
                (Arrays.asList(4f, 5.6f,7.8f, 8.9f,10f,2.4f)));
        student2 = new Alumno("Idaira", "24/06/2004", "2345319P", new ArrayList<>
                (Arrays.asList(1f, 5f,8f, 3.9f,10f,2.4f)));
        student3 = new Alumno("Alejandro Jesus", "31/07/2002", "3475319P", new ArrayList<>
                (Arrays.asList(8f, 5f,8f, 8.9f,3f,7f)));

        class1 = new Aula("1DAM",new ArrayList<>(), new ArrayList<>
                (Arrays.asList(student, student2, student3)));


        System.out.println("> AVG Student grades:" );
        float averageClassGrades = class1.averageGradesClass();
        System.out.println("> AVG Class grades:"  + averageClassGrades);
    }
}
