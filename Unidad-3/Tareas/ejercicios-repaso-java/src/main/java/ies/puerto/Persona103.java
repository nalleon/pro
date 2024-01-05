package ies.puerto;

/**
 * Desarrolla un método en la clase Persona para mostrar toda la información de una persona (nombre, apellido y edad).
 * Implementa el método main para verificar que funciona correctamente.
 */
public class Persona103 {
    public static void main(String[] args) {
        Persona103 persona103 = new Persona103("Nabil", "Leon", 18);
        System.out.println(showInformation(persona103));
    }
    private String name;
    private String surname;
    private int age;

    public  Persona103 (){}

    public Persona103(String name) {
        this.name = name;
    }

    public Persona103(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona103(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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
    public static String showInformation (Persona103 persona103){
        return "Name: "+ persona103.getName() + "\nSurname: " +persona103.getSurname()+ "\nAge: "
                + persona103.getAge();
    }
}


