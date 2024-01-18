package ies.puerto.impl;

import ies.puerto.abstrac.RegularesAbstract;
import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica {

    public Cuadrado (){}

    public Cuadrado (float side){
        super(side, side);
    }
    public Cuadrado (float base, float heigth){
        super(base, heigth);
    }
}
