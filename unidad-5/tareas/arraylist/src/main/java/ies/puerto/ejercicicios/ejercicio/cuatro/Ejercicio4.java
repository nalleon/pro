package ies.puerto.ejercicicios.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public Ejercicio4() {}

    public static boolean haveCommonElement(List<Integer> list1, List<Integer> list2) {
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
