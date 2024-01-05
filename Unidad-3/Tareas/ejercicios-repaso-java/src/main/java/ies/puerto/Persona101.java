package ies.puerto;

/**
 * Crea una clase Persona con atributos como nombre, apellido y edad. Proporciona un constructor para inicializar
 * estos atributos. Implementa el método main para verificar que funciona correctamente.
 */
public class Persona101 {
    public static void main(String[] args) {
        Persona101 persona101 = new Persona101("Nabil", "Leon", 18);

        System.out.println("Name: "+ persona101.getName() + "\nSurname: " +persona101.getSurname()+ "\nAge: "
                + persona101.getAge());
    }
    private String name;
    private String surname;
    private int age;

    public  Persona101 (){}

    public Persona101(String name) {
        this.name = name;
    }

    public Persona101(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona101(String name, String surname, int age) {
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
}
