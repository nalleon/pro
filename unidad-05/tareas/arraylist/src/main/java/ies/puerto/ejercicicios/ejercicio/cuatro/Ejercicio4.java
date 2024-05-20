package ies.puerto.ejercicicios.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Crea un programa que compare dos ArrayList de enteros y devuelva true si tienen al menos un elemento en
 * común, de lo contrario, devuelve false. a la lista.
 */
public class Ejercicio4 {
    static List<Integer> list1;
    static List<Integer> list2;
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 6, 7, 9, 2, 4));

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        boolean commonElementExists = Ejercicio4.haveCommonElement(list1, list2);
        System.out.println("Common element's existence: " + commonElementExists);
        commonElementExists = Ejercicio4.commonElementRecursive(list1, list2);
        System.out.println("Common element's existence (recursive): " + commonElementExists);
    }

    /**
     * Default constructor of the class
     */
    public Ejercicio4() {}

    /**
     * Method to verify if any element of a list is in other
     * @param list1 to evalue
     * @param list2 to evalue
     * @return true if list2 contains any element from list1, false if not
     */
    public static boolean haveCommonElement(List<Integer> list1, List<Integer> list2) {
        List <Integer> smallerList = list1;
        List <Integer> largerList = list2;
        if (list1.size() > list2.size()){
            list1 = largerList;
            list2 = smallerList;
        }
        for (Integer element : largerList) {
            if (smallerList.contains(element)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to verify if any element of a list is in other using recursive
     * @param list1 to evalue
     * @param list2 to evalue
     * @return true if list2 contains any element from list1, false if not
     */
    public  static  boolean commonElementRecursive (List<Integer> list1, List<Integer> list2) {
        if (list2.size() > list1.size()){
            return commonElementRecursive(list2, list1);
        }
        for (Integer element : list1) {
            if (list2.contains(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ejercicio4{}";
    }


}
