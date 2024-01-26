package ies.puerto.ejercicicios.ejercicio.siete;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ejercicio7 {
    private List<String> myStrList;

    public Ejercicio7() {
        this.myStrList = new ArrayList<>();
    }

    public Ejercicio7(List<String> myStrList) {
        this.myStrList = myStrList;
    }

    public List<String> getMyStrList() {
        return myStrList;
    }

    public void setMyStrList(List<String> myStrList) {
        this.myStrList = myStrList;
    }

    public List<String> removeDuplicates() {
        List<String> uniqueElementsList = new ArrayList<>();
        for (String str : myStrList) {
            if (!uniqueElementsList.contains(str)) {
                uniqueElementsList.add(str);
            }
        }
        return uniqueElementsList;
    }

    @Override
    public String toString() {
        return "Ejercicio7{" +
                "myStrList=" + myStrList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ejercicio7 that = (Ejercicio7) o;
        return Objects.equals(myStrList, that.myStrList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myStrList);
    }
}
