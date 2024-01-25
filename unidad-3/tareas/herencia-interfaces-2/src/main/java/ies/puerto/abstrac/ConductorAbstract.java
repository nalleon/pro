package ies.puerto.abstrac;

/**
 * Crea una interfaz IConductor con dos métodos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además, agrega un método adicional
 * conducir() que sea específico de la clase ConductorAbstract.
 *
 * - Crea la interfaz en el paquete ies.puerto.interfaz y la implementación en el paquete ies.puerto.impl.
 * - Realiza el ejercicio creando una clase abstracta, en el paquete ies.puerto.abstract (Los métodos abstractos
 *   NO comienzan por I ) y realizando la implemetación de los métodos abstractos en una clase declarada en el paquete
 *   ies.puerto.implementation.
 *
 * - Crea un programa que demuestre el comportamiento correcto del programa AppReproductor
 */
public abstract class ConductorAbstract {

    private String brand;
    private String model;
    private int speed;

    public  ConductorAbstract (){}
    /**
     * Constructor of the class
     * @param brand of the car
     */
    public ConductorAbstract(String brand) {
        this.brand = brand;
    }
    /**
     * Constructor of the class
     * @param brand of the car
     * @param model of the car
     */
    public ConductorAbstract(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    /**
     * Constructor of the class
     * @param brand of the car
     * @param model of the car
     * @param speed of the car
     */
    public ConductorAbstract(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    /**
     * Getters and setters
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public String start() {
        return "The " + brand + " " + model + " has started moving.";
    }


    public String stop() {
        return "The " + brand + " " + model + " has stopped.";
    }

    public String drive() {
        return "The " + brand + " " + model + " is in moving at " + speed+ "km/h";
    }

    @Override
    public String toString (){
        return "> Data provided: " + brand + ", " + model + ", " + speed + "km/h";
    }
}
