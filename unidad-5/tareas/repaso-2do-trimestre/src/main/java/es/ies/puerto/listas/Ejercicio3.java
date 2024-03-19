package es.ies.puerto.listas;

import java.util.ArrayList;
import java.util.List;

/**
 * Inserta un nombre duplicado, y elimina los nombres duplicados antes de imprimir la lista.
 */
public class Ejercicio3 {

    private List<String> strList;

    /**
     * Cinstructors of the class
     */
    public Ejercicio3 (){
        strList = new ArrayList<>();
    }

    public Ejercicio3(List<String> strList) {
        this.strList = strList;
    }

    /**
     * Getters and setters
     */
    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public String listWithOutDuplicates(String nameDuplicate){
        eliminateDuplicates(nameDuplicate);
        return strList.toString();
    }


    public boolean eliminateDuplicates(String nameDuplicate){
        if (addDuplicates(nameDuplicate)){
            strList.remove(nameDuplicate);
            return true;
        }
        return true;
    }


    public boolean addDuplicates(String nameDuplicate){
        return strList.add(nameDuplicate);
    }

    @Override
    public String toString() {
        return "Ejercicio3{" +
                "strList=" + strList +
                '}';
    }
}
