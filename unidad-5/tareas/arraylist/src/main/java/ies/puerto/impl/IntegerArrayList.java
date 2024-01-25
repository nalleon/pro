package ies.puerto.impl;

import ies.puerto.abstrac.IntegerArrayListAbstrac;
import ies.puerto.interfaz.IIntegerArrayList;

import java.util.List;

/**
 * Crea un programa que declare e inicialice un ArrayList de enteros. Luego, agrega
 * números pares del 1 al 10 a la lista. Crea un programa que demuestre el comportamiento
 * correcto del programa App+NombreIdentificativo, o test unitarios que sistituyen a este.
 */
public class IntegerArrayList implements IIntegerArrayList {

    public IntegerArrayList (){}

    public static List<Integer> addIntegerNumbers(){
        for (int i=1; i <= 10; i++){
            if (i % 2 == 0){
                myIntegerList.add(i);
            }
        }
        return myIntegerList;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
