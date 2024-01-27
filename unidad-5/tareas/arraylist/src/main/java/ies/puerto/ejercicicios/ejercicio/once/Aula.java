package ies.puerto.ejercicicios.ejercicio.once;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Aula {
    private String className;
    private List <Profesor> professorList;

    private List <Alumno> studentList;

    /**
     * Default constructor of the class
     */
    public Aula() {
    }
    /**
     * Constructor of the class
     * @param className of the class
     */
    public Aula(String className, List<Profesor> professorList, List<Alumno> studentList) {
        this.className = className;
        this.professorList = professorList;
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

    public List<Profesor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Profesor> professorList) {
        this.professorList = professorList;
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
                ", professorList=" + professorList +
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

    public float averageGradesClass (){
        float result = 0f;

        if (studentList == null || studentList.isEmpty()) {
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



