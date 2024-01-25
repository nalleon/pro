package ies.puerto.impl;

import java.util.ArrayList;

public class ArrayListComparison {
    public static boolean haveCommonElement(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer element : list1) {
            if (list2.contains(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ArrayListComparison{}";
    }

    public ArrayListComparison() {
        super();
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
