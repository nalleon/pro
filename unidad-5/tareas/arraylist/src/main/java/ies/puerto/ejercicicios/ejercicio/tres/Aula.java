package ies.puerto.ejercicicios.ejercicio.tres;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String id;
    private List<Alumno> alumnoList;

    public Aula (){}

    public Aula(String id) {
        this.id = id;
        this.alumnoList = new ArrayList<>();
    }

    public Aula(String id, List<Alumno> alumnoList) {
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
}
