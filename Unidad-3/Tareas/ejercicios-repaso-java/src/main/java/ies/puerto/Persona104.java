package ies.puerto;

/**
 * Escribe un método en la clase Persona para comparar la edad de dos personas y determinar cuál es 
 * mayor. Implementa el método main para verificar que funciona correctamente.
 */
public class Persona104 {
    public static void main(String[] args) {
        Persona104 persona104A = new Persona104("Nabil", "Leon", 18);
        Persona104 persona104B = new Persona104("Claus", "Karlsefnj", 143);
        System.out.println(ageComparision(persona104A, persona104B));
    }
    private String name;
    private String surname;
    private int age;

    public  Persona104 (){}

    public Persona104(String name) {
        this.name = name;
    }

    public Persona104(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona104(String name, String surname, int age) {
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
    public static String showInformation (Persona104 persona104){
        return "Name: "+ persona104.getName() + "\nSurname: " +persona104.getSurname()+ "\nAge: "
                + persona104.getAge();
    }

    public static String ageComparision(Persona104 persona104A, Persona104 persona104B){
        String result = "";

        if (persona104A.getAge() > persona104B.getAge()){
            result = persona104A.getName() + " is older than " + persona104B.getName();
        } else if (persona104A.getAge() < persona104B.getAge()) {
            result = persona104A.getName() + " is younger than " + persona104B.getName();
        } else {
            result =  persona104A.getName() + " are the same age " + persona104B.getName();
        }
        return result;
    }
}

