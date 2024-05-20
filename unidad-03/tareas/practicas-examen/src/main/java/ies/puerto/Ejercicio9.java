package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que verifique si una cadena de texto comienza
 * o termina con una subcadena específica.
 * @author Nabil
 */
public class Ejercicio9 {

    private String name;
    private String date;

    public Ejercicio9() {}
    public Ejercicio9(String name) {
        this.name = name;
    }

    public Ejercicio9(String name, String date) {
        this.name = name;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
