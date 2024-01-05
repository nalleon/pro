package ies.puerto;
import java.util.Scanner;

/**
 * Desarrolla un método para ordenar un array de objetos Persona por edad, de menor a mayor.
 */
public class Persona108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int quantity = scanner.nextInt();

        Persona108[] persona108 = new Persona108[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Insert data for the persons" + (i + 1) + ":");
            scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            persona108[i] = new Persona108(name, surname, age);
        }
        sortPersonsByAge(persona108);

        for (int i=0; i< persona108.length; i++){
            System.out.println("Name: " + persona108[i].getName()+ "\nSurname: " + persona108[i].getSurname()+
                    "\nAge: "+ persona108[i].getAge());
        }
    }

    private String name;
    private String surname;
    private int age;

    public  Persona108 (){}

    public Persona108(String name) {
        this.name = name;
    }

    public Persona108(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona108(String name, String surname, int age) {
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

    public static void sortPersonsByAge(Persona108[] persons) {
        boolean swapped = false;

        for (int i = 0; i < persons.length- 1; i++) {
            for (int j = 0; j < persons.length- i - 1; j++) {
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    Persona108 temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
