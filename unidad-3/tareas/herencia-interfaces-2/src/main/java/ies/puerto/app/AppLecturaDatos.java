package ies.puerto.app;

import ies.puerto.abstrac.LecturaDatosAbstract;
import ies.puerto.impl.LecturaDatosBaseDatos;
import ies.puerto.impl.LecturaDatosFichero;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.opening());
        System.out.println(lecturaDatos.reading());
        System.out.println(lecturaDatos.closing());
        type(lecturaDatos);
    }

    public static void type (LecturaDatosAbstract lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
