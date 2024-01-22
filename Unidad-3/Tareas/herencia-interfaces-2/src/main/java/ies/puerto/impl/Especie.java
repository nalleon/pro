package ies.puerto.impl;

import ies.puerto.Animal;

public class Especie extends Animal {
    private String nombreEspecie;

    public Especie(){}

    public Especie(String nombre, int chip){
        super(nombre, chip);
    }
}
