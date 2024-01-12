package ies.puerto;
import java.util.Arrays;

/**
 * Crea una clase Estudiante que herede de la clase Persona. La clase Estudiante debe tener atributos
 * adicionales como curso y notas, y métodos para obtener y establecer estos valores.
 */
public class Estudiante extends Persona {
    private String course;
    private float [] scores;

    /**
     * Default constructor of the class
     */
    public Estudiante (){}

    /**
     * Constructor of the class
     * @param course of the student
     * @param scores of the student
     * @param name of the student
     * @param age of the student
     * @param dni of the student
     */
    public  Estudiante (String course, float [] scores, String name, int age, String dni){
       super(name, age, dni);
        this.course = course;
        this.scores = scores;
    }
    /**
     * Getters and Setters
     */
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString (){
        return super.toString() + "\nCourse: " + course+ "\nScores: " + Arrays.toString(scores);
    }

    @Override
    public String greeting (){
        return "Welcome to the app, " + getName() + "!";

    }
}
