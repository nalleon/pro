package ies.puerto.ejercicicios.ejercicio.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {

    static Aula dam1;


    public static void main(String[] args) {

       Alumno alumno = new Alumno("Nabil", "León", Arrays.asList(7f,5.5f,8f,8f));
       Alumno alumno2 = new Alumno("Idaira", "Gonzalez", Arrays.asList(10f,5.5f,6f,4f));
        List<Alumno> alumnoList = new ArrayList<>();
        alumnoList.add(alumno);
        alumnoList.add(alumno2);


        dam1 = new Aula("1DAM", alumnoList);

        System.out.println("Average calcification of 1DAM: " +dam1.averageClassCalcification());
    }
}
