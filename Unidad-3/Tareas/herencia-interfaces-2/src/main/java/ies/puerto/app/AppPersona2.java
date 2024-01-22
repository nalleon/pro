package ies.puerto.app;

import ies.puerto.impl.Persona;

import java.util.ArrayList;
import java.util.List;

public class AppPersona2 {

    static Persona ramon;
    static Persona juan;
    static List<Persona> personas;

    static String dni1= "12345678T";
    static String dni2 = "98765432K";
    public static void main(String[] args) {
        ramon = new Persona(dni1, "Ramon", "Gonzalez", "Pérez");
        juan = new Persona(dni2, "Juan", "Gonzalez", "Pérez");
        personas = new ArrayList<>();
        personas.add(ramon);
        personas.add(juan);

        System.out.println(personas);
        Persona ramon2= new Persona(dni1, "Ramon", "Gonzalez", "Pérez");
        if (personas.contains(ramon2)){
            System.out.println("List contains: " + ramon);
        }
    }
}
