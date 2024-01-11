package ies.puerto;

/**
 * Añade métodos en la clase Persona para establecer y obtener el nombre, apellido y edad.
 * (Gettes/Setters). Implementa el método main para verificar que funciona correctamente.
 */
public class Persona102 {
    public static void main(String[] args) {
        Persona102 persona102 = new Persona102("Nabil", "Leon", 18);
        System.out.println(anotherValues(persona102));
    }
    private String name;
    private String surname;
    private int age;

    public  Persona102 (){}

    public Persona102(String name) {
        this.name = name;
    }

    public Persona102(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona102(String name, String surname, int age) {
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
    public static String anotherValues(Persona102 persona102) {
        persona102.setName("Claus");
        persona102.setSurname("Karlsefnj");
        persona102.setAge(143);

        return "Name: "+ persona102.getName() + "\nSurname: " +persona102.getSurname()+ "\nAge: "
                + persona102.getAge();
    }
}

