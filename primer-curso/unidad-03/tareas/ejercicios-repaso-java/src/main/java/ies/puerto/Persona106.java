package ies.puerto;

import java.util.Scanner;

/**
 * Haz un método que calcule el promedio de edad de un grupo de personas.
 */
public class Persona106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int quantity = scanner.nextInt();

        Persona106[] persona106 = new Persona106[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Insert data for the persons" + (i + 1) + ":");
            scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            persona106[i] = new Persona106(name, surname, age);
        }
        for (int i=0; i< persona106.length; i++){
            System.out.println("Name: " + persona106[i].getName()+ "\nSurname: " + persona106[i].getSurname()+
                    "\nAge: "+ persona106[i].getAge());
        }
        System.out.println("Average age: " + calculateAverageAge(persona106));
    }

    private String name;
    private String surname;
    private int age;

    public  Persona106 (){}

    public Persona106(String name) {
        this.name = name;
    }

    public Persona106(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona106(String name, String surname, int age) {
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
    public static float calculateAverageAge(Persona106[] persons) {
        if (persons.length == 0) {
            return 0;
        }

        int sumAge = 0;
        for (int i = 0; i < persons.length; i++) {
            sumAge += persons[i].getAge();
        }

        return (float) sumAge / persons.length;
    }

}
