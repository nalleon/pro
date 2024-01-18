package ies.puerto.app;

import ies.puerto.impl.Circulo;
import ies.puerto.impl.Rectangulo;

public class AppArea {

    static Circulo circulo;
    static Rectangulo rectangulo;

    public static void main(String[] args) {
        circulo = new Circulo(5f);
        System.out.println(circulo.toString());
        circulo.calculateArea();

        circulo.setRadius(3.2f);
        System.out.println("> New radius: " + circulo.getRadius() + "cm");
        System.out.println(circulo.toString());
        circulo.calculateArea();

        System.out.println();

        rectangulo = new Rectangulo(12.3f, 10f);
        System.out.println(rectangulo.toString());
        rectangulo.calculateArea();

        rectangulo.setSideLengthA(4f);
        rectangulo.setSideLengthB(5f);
        System.out.println("> New lengths: " + rectangulo.getSideLengthA() + "cm, " + rectangulo.getSideLengthB()+ "cm");
        System.out.println(rectangulo.toString());
        rectangulo.calculateArea();
    }
}
