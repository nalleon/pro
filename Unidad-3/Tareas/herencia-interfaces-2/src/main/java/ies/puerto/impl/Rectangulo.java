package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeometrica;

/**
 * Define una interfaz FormaGeometrica que contenga un método abstracto llamado calcularArea().
 * Implementa esta interfaz en dos clases: Circulo y Rectangulo. Proporciona implementaciones concretas
 * para calcular el área en ambas clases.
 */
public class Rectangulo extends Cuadrado implements IFormaGeometrica {
    private float sideLengthA;
    private float sideLengthB;

    public static void main(String[] args) {
        Rectangulo rectangulo;
        rectangulo = new Rectangulo(2.8f, 3.9f);

        System.out.println(rectangulo.toString());
        rectangulo.calculateArea();
    }

    /**
     * Default constructor of the class
     */
    public Rectangulo () {}

    /**
     * Constructor of the class
     * @param sideLengthA of the rectangle
     */
    public Rectangulo(float sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    /**
     * Constructor of the class
     * @param sideLengthA of the rectangle
     * @param sideLengthB of the rectangle
     */
    public Rectangulo(float sideLengthA, float sideLengthB) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }

    /**
     * Getters and setters
     */
    public float getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(float sideLengthA) {
        this.sideLengthA= sideLengthA;
    }

    public float getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthB(float sideLengthB) {
        this.sideLengthB = sideLengthB;
    }

    @Override
    public float calculateArea() {
       return sideLengthA*sideLengthB;
    }

    @Override
    public String toString(){
        return "Data provided: " + sideLengthA + "cm, " + sideLengthB + "cm";
    }
}
