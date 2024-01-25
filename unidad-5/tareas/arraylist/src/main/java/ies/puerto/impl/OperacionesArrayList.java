package ies.puerto.impl;

import ies.puerto.interfaz.IOperacionesArrayList;

import java.util.ArrayList;
import java.util.List;

public class OperacionesArrayList implements IOperacionesArrayList {
    public OperacionesArrayList() {
    }
    public  static int elementStartWithA(List<String> myList){
        int counter = 0;
        for (String element : myList){
            if (element.charAt(0) == 'A'){
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList <Integer> parity (ArrayList <Integer> myList){
        ArrayList <Integer> parity = new ArrayList<>();
        for (Integer num : myList){
            if (num % 2 ==0){
                parity.add(num);
            }
        }
        return parity;
    }

    public static boolean greaterThan10 (ArrayList <Integer> myList){
        for (Integer num : myList){
            if (num <= 10){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        return "OperacionesArrayList{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
