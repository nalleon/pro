package ies.puerto.app;

import ies.puerto.impl.OrderNames;

import java.util.ArrayList;

public class AppOrderNames {

    public static void main(String[] args) {
        ArrayList<String> myNameList = OrderNames.readConsoleName();
        myNameList = OrderNames.sortNames(myNameList);

        System.out.println("Sorted names:" );
        for (String name : myNameList){
            System.out.println(name);
        }
    }
}
