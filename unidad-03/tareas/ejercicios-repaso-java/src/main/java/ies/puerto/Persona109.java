package ies.puerto;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Escribe un método que reciba un nombre como parámetro y devuelva una lista de todas las personas con ese nombre.
 */
public class Persona109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int quantity = scanner.nextInt();

        Persona109[] persona109 = new Persona109[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Insert data for the persons" + (i + 1) + ":");
            scanner.nextLine();

            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surname: ");
            String surname = scanner.nextLine();

            System.out.println("Age: ");
            int age = scanner.nextInt();

            persona109[i] = new Persona109(name, surname, age);
        }
        for (int i=0; i< persona109.length; i++){
            System.out.println("Name: " + persona109[i].getName()+ "\nSurname: " + persona109[i].getSurname()+
                    "\nAge: "+ persona109[i].getAge());
            }

        System.out.println("Names in the list: " + Arrays.toString(matchNameList(persona109)));
    }

    private String name;
    private String surname;
    private int age;


    public  Persona109 (){}

    public Persona109(String name) {
        this.name = name;
    }

    public Persona109(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persona109(String name, String surname, int age) {
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
    public static String[] matchNameList(Persona109[] persona109) {
        String[] nameList = {"Nabil", "Alejandro", "Daniel", "Hector", "Idaira", "Yguanira"};
        String[] matchList = new String[persona109.length];
        int counter = 0;

        for (Persona109 value : persona109) {
            for (String s : nameList) {
                if (s.equals(value.getName())) {
                    matchList[counter] = value.getName();
                    counter++;
                }
            }
        }

        String[] result = new String[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = matchList[i];
        }
        return result;
    }
}
