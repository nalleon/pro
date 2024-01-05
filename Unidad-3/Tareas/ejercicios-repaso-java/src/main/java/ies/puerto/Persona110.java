package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Agrega un atributo dni (Documento Nacional de Identidad) a la clase Persona y
 * desarrolla un método para validar si un DNI ingresado es válido.
 */
public class Persona110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona110 persona110 = new Persona110("Nabil", "Leon", 18, "12345678W");
        System.out.println(persona110.getDni() + "\nDNI validation: " + validateDNI(persona110.getDni()));
        }

    private String name;
    private String surname;
    private int age;

    private String dni;

    public  Persona110 (){}

    public Persona110(String name) {
        this.name = name;
    }

    public Persona110(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona110(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Persona110(String name, String surname, int age, String dni) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static boolean validateDNI(String dni) {
        String patronDNI = "\\d{8}[A-HJ-NP-TV-Z]";
        Pattern pattern = Pattern.compile(patronDNI);
        Matcher matcher = pattern.matcher(dni);

        return matcher.matches();
    }
}
