package ies.puerto;

import ies.puerto.Acceso.Autenticacion;
import ies.puerto.Excepciones.ValidacionException;

public class AppPersona {
    static Alumno alumno;
    static Estudiante estudiante;

    public static void main(String[] args) throws ValidacionException {
        alumno = new Alumno("Nabil",18, "234572W");
        estudiante = new Estudiante("1ºDAM", new float[]{7.6f, 5f, 10f, 8.4f, 5.75f},"Nabil",
                18, "23457242W" );
        alumno.setDni("23457232W");
        estudiante.setDni("23457234W");
        System.out.println("> Student's info:\n" + alumno.toString());
        System.out.println("> Full student's info:\n" + estudiante.toString());
        System.out.println("> Greeting: " + estudiante.greeting());
    }
}
