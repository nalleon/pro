package ies.puerto.ejercicicios.ejercicio.tres.seis;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String id;
    private List<Alumno> alumnoList;

    public Curso(){}

    public Curso(String id) {
        this.id = id;
        this.alumnoList = new ArrayList<>();
    }

    public Curso(String id, List<Alumno> alumnoList) {
        this.id = id;
        this.alumnoList = alumnoList;
    }

    /**
     * Gettets and setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public float averageClassCalcification (){
        float result=0f;
        if (alumnoList.isEmpty()){
            return result;
        }
        for (Alumno alumno : alumnoList){
            result += alumno.averageCalcification();
        }
        return result/alumnoList.size();
    }

    /**
     * Method to add a student
     */
    public void addStudents(Alumno alumno) {
        alumnoList.add(alumno);
    }
    /**
     * Method to remove a student
     */
    public void eliminateStudent(Alumno alumno) {
        alumnoList.remove(alumno);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id='" + id + '\'' +
                ", alumnoList=" + alumnoList +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(alumnoList, curso.alumnoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alumnoList);
    }
}
