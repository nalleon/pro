package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea una clase Vehiculo con atributos como marca, modelo y precio. Crea clases Coche y
 * Motocicleta que hereden de Vehiculo y añadan atributos específicos y relaciones con otras clases como Conductor.
 *
 * Nota: Crea un programa que demuestre el comportamiento correcto del programa, o test unitarios que sistituyen a este.
 */
public abstract class Vehiculo {
    private String model;
    private float price;

    private String brand;

    /**
     * Default constructor of the class
     */
    public Vehiculo (){}

    /**
     * Constructor of the class
     * @param model of the vehicle
     */
    public Vehiculo (String model){
        this.model = model;
    }

    /**
     * Constructor of the class
     * @param model of the vehicle
     * @param price of the vehicle
     */
    public Vehiculo(String model, float price) {
        this.model = model;
        this.price = price;
    }

    /**
     * Constructor of the class
     * @param model of the vehicle
     * @param price of the vehicle
     * @param brand of the vehicle
     */
    public Vehiculo(String model, float price, String brand) {
        this.model = model;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nBrand: " + brand + "\nPrice: " + price + "$" ;
    }
}
