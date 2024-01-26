package ies.puerto.ejercicicios.ejercicio.diez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    public static ArrayList<String> sortNames(ArrayList<String> myNameList){
        Collections.sort(myNameList);
        return  myNameList;
    }

    @Override
    public String toString() {
        return "OrderNames{}";
    }
}
