package es.ies.puerto.ejercicio.seis;

public class Bisiesto {
    public boolean is(int anio) {
        boolean resultado = false;

        if (anio % 400 == 0) {
            resultado = true;
        } else if (anio % 100 != 0 && anio % 4 == 0) {
            resultado = true;
        }

        return resultado;
    }
}
