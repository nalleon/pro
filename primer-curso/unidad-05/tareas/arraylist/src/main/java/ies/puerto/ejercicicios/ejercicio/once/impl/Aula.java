package ies.puerto.ejercicicios.ejercicio.once.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Aula {
    private String className;
    private Profesor professor;

    private List <Alumno> studentList;

    /**
     * Default constructor of the class
     */
    public Aula() {
        this.studentList = new ArrayList<>();
    }
    /**
     * Constructor of the class
     * @param className of the class
     */
    public Aula(String className, Profesor professor, List<Alumno> studentList) {
        this.className = className;
        this.professor = professor;
        this.studentList = studentList;
    }

    /**
     * Getters and Setters
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Profesor getProfessor() {
        return professor;
    }

    public void setProfessor(Profesor professor) {
        this.professor = professor;
    }

    public List<Alumno> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Alumno> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "className='" + className + '\'' +
                ", professor   =" + professor +
                ", studentList=" + studentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(className, aula.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className);
    }

    public float averageGradesClass() {
        float result = 0f;
        if (studentList.isEmpty()) {
            return result;
        }

        for (Alumno student : studentList) {
            List<Float> studentAverages = student.averageGradesPerStudent();
             if (!studentAverages.isEmpty()) {
                result += studentAverages.get(0);
             }
        }
        return result / studentList.size();
    }

}



