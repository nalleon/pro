package ies.puerto.app;

import ies.puerto.Animal;
import ies.puerto.Gato;
import ies.puerto.impl.Fecha;

import java.util.ArrayList;
import java.util.List;

public class AppAnimal {

    static List<Animal> animales;
    static List<Fecha> fechas;

    public static void main(String[] args) {
        String fecha1= "22/01/2024";
        Animal mario = new Animal("Mario", 1234578);
        animales = new ArrayList<>();
        fechas = new ArrayList<>();


        if (!animales.contains(mario)){
            animales.add(mario);
        }


    }
}
