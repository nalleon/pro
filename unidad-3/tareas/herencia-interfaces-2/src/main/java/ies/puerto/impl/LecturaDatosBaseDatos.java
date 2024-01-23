package ies.puerto.impl;

import ies.puerto.abstrac.LecturaDatosAbstract;
import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {
    @Override
    public String reading() {
        return "Reading data from data base";
    }

    @Override
    public String opening() {
        return "Opening data base";
    }

    @Override
    public String closing() {
        return "Closing data base";
    }
}
