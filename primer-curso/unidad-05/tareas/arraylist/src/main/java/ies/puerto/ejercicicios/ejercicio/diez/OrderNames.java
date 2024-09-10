package ies.puerto.ejercicicios.ejercicio.diez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Crea un programa que lea una lista de nombres desde el teclado y los almacene en un ArrayList. Luego,
 * ordena la lista alfabéticamente e imprímela. a la lista.
 */
public class OrderNames {
    public  static  ArrayList<String> readConsoleName(){
        ArrayList<String> myNameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce names. Write X to finish.");
        String name;
        while (!(name = scanner.nextLine()).equalsIgnoreCase("X")){
            myNameList.add(name);
        }
        scanner.close();
        return myNameList;
    }

    /**
     * Method to sort names alphabetical order
     * @param myNameList to order
     * @return myNameList sorted
     */
    public static List<String> sortNames(List<String> myNameList){
        Collections.sort(myNameList);
        return  myNameList;
    }

    @Override
    public String toString() {
        return "OrderNames{}";
    }
}
