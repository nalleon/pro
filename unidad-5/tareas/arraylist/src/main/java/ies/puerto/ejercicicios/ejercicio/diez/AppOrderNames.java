package ies.puerto.ejercicicios.ejercicio.diez;

import ies.puerto.ejercicicios.ejercicio.diez.OrderNames;

import java.util.ArrayList;

public class AppOrderNames {

    public static void main(String[] args) {
        ArrayList<String> myNameList = OrderNames.readConsoleName();
        OrderNames.sortNames(myNameList);

        System.out.println("Sorted names:" );
        for (String name : myNameList){
            System.out.println(name);
        }
    }
}
