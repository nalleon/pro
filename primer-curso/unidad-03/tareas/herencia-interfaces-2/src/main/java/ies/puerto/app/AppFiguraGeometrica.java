package ies.puerto.app;

import ies.puerto.impl.Circulo;
import ies.puerto.impl.Cuadrado;
import ies.puerto.impl.Rectangulo;
import ies.puerto.interfaz.IFormaGeometrica;

public class AppFiguraGeometrica {
    static IFormaGeometrica circulo;
    static  IFormaGeometrica cuadrado;
    static IFormaGeometrica rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5f, 5f);
        circulo = new Circulo(5f);
        rectangulo = new Rectangulo(6f, 7f);
        System.out.println("Circle area: " + circulo.calculateArea());
        System.out.println("Area: " + cuadrado.calculateArea());
        System.out.println("Rectangle area: " + rectangulo.calculateArea());
    }
}
