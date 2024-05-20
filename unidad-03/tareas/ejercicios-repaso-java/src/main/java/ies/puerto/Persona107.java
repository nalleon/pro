package ies.puerto;

import java.util.Scanner;

/**
 * Añade un método en la clase Persona para actualizar la edad de una persona y muestre un mensaje indicando
 * si es mayor de edad o no (por ejemplo, si tiene 18 años o más).
 */
public class Persona107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            Persona107 persona107 = new Persona107(name, surname, age);
            
            System.out.println("Name: "+ persona107.getName() + "\nSurname: " +persona107.getSurname()+ "\nAge: "
                + persona107.getAge());
        
        System.out.println("Enter the new age: ");
        int newAge = scanner.nextInt();
        persona107.updatedAge(newAge);
    }

    private String name;
    private String surname;
    private int age;

    public  Persona107 (){}

    public Persona107(String name) {
        this.name = name;
    }

    public Persona107(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona107(String name, String surname, int age) {
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

    public void updatedAge (int newAge){
        this.age = newAge;
        if (newAge >= 18) {
            System.out.println("This person is above age.");
        } else {
            System.out.println("This person is underage age.");
        }
  
    }
}

