package ies.puerto;
import java.util.Scanner;
/**
 * Crea un array de objetos Persona y llena la lista con varias instancias.
 * Luego, muestra la información de todas las personas.
 */
public class Persona105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int quantity = scanner.nextInt();


        Persona105[] persona105 = new Persona105[quantity];
        
        for (int i = 0; i < quantity; i++) {
            System.out.println("Insert data for the persons" + (i + 1) + ":");
            scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            persona105[i] = new Persona105(name, surname, age);
        }
        for (int i=0; i< persona105.length; i++){
            System.out.println("Name: " + persona105[i].getName()+ "\nSurname: " + persona105[i].getSurname()+
                    "\nAge: "+ persona105[i].getAge());
        }
    }

    private String name;
    private String surname;
    private int age;

    public  Persona105 (){}

    public Persona105(String name) {
        this.name = name;
    }

    public Persona105(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona105(String name, String surname, int age) {
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
