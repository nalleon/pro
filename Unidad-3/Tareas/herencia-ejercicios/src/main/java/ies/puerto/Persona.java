package ies.puerto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Crea una clase Persona con atributos como nombre, edad y dni. Añade métodos para obtener y establecer
 * los valores de los atributos. Crea una clase Alumno que haga uso (extends) de la clase Alumno.
 *
 * Nota: Crea un programa que demuestre el comportamiento correcto del programa,
 * o test unitarios que sistituyen a este.
 */
public abstract class Persona {
    private String name;
    private int age;
    private String dni;

    public static void main(String[] args) {

    }
    /**
     * Default constructor of the class
     */
    public Persona (){}

    /**
     * Constructor of the class
     * @param name of the person
     */
    public Persona(String name) {
        this.name = name;
    }

    /**
     * Constructor of the class
     * @param name of the person
     * @param age  of the person
     */
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * Constructor of the class
     * @param name of the person
     * @param age  of the person
     * @param dni of the person
     */
    public Persona(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean validateDNI (){
        String regex = "(\\d{8}[A-HJ-NP-TV-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        return matcher.matches();
    }
    @Override
    public String toString (){
        return "Name: " +name+ "\nAge: " +age+ "\nDNI: " +dni;
    }

    public String greeting (){
        return "Welcome to the app!";
    }
}
