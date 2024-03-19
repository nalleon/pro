package es.ies.puerto.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Implementa un programa en Java que solicite al usuario ingresar nombres de estudiantes y los almacene en una
 * lista. Luego, el programa debe imprimir la lista de nombres ordenada alfabéticamente.
 */
public class Ejercicio1 {

    /**
     * Method to add a student to the list
     * @param name to add
     * @return an arraylist with the list of students
     */
    public List<String> addStudentsNames (int num, String name){
        List<String> result = new ArrayList<>();
        int counter = 0;
        while (counter < num){
            result.add(name);
            counter++;
        }
        return result;
    }

    /**
     * Method to order the list alphabetically
     * @param studentsList to order
     * @return ordered arraylist
     */
    public List<String> orderStudentsNames (List<String> studentsList){
        studentsList.sort(String ::compareToIgnoreCase);
        return studentsList;
    }
}
