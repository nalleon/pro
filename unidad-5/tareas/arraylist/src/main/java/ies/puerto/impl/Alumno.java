package ies.puerto.impl;

import ies.puerto.abstrac.AlumnoAbstrac;

import java.util.ArrayList;

public class Alumno extends AlumnoAbstrac {
    public Alumno() {
    }

    public Alumno(String name, String surname, ArrayList<Float> califications) {
        super(name, surname, califications);
    }
}
