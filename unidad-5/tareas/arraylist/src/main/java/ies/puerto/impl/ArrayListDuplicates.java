package ies.puerto.impl;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListDuplicates {
    private ArrayList<String> myStrList;

    public ArrayListDuplicates() {
        this.myStrList = new ArrayList<>();
    }

    public ArrayListDuplicates(ArrayList<String> myStrList) {
        this.myStrList = myStrList;
    }

    public ArrayList<String> getMyStrList() {
        return myStrList;
    }

    public void setMyStrList(ArrayList<String> myStrList) {
        this.myStrList = myStrList;
    }

    public ArrayList<String> removeDuplicates() {
        ArrayList<String> uniqueElementsList = new ArrayList<>();
        for (String str : myStrList) {
            if (!uniqueElementsList.contains(str)) {
                uniqueElementsList.add(str);
            }
        }
        return uniqueElementsList;
    }

    @Override
    public String toString() {
        return "ArrayListDuplicates{" +
                "myStrList=" + myStrList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListDuplicates that = (ArrayListDuplicates) o;
        return Objects.equals(myStrList, that.myStrList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myStrList);
    }
}