package ies.puerto;

import ies.puerto.interfaz.IFormaGeometrica;

/**
 * Define una interfaz FormaGeometrica que contenga un método abstracto llamado calcularArea().
 * Implementa esta interfaz en dos clases: Circulo y Rectangulo. Proporciona implementaciones concretas
 * para calcular el área en ambas clases.
 */
public class Circulo implements IFormaGeometrica {
    private float radius;

    public static void main(String[] args) {
    Circulo circulo;
    circulo = new Circulo(15.7f);
        System.out.println(circulo.toString());
        circulo.calculateArea();
    }

    /**
     * Default constructor of the class
     */
    public Circulo (){}

    /**
     * Constructor of the class
     * @param radius of the circle
     */
    public Circulo(float radius) {
        this.radius = radius;
    }

    /**
     * Getters and Setters
     */
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area: " + (Math.PI*(radius*radius)) + "cm");
    }
    @Override
    public String toString(){
        return "Data provided: " + radius + "cm";
    }
}
