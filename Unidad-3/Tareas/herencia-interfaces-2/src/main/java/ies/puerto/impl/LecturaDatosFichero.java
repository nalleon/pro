package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFichero implements ILecturaDatos {
    @Override
    public String reading() {
        return "Reading the data from the file system";
    }

    @Override
    public String opening() {
        return "Opening the file system";
    }

    @Override
    public String closing() {
        return "Closing the file system";
    }
}
