package ies.puerto;
/**
 * Crea una interfaz Conductor con dos métodos abstractos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además,
 * agrega un método adicional conducir() que sea específico de la clase Automovil.
 */
public class Automovil implements Conductor {

    private String brand;
    private String model;
    private int speed;
    public static void main(String[] args) {
        Automovil automovil;
        automovil = new Automovil("Nissan", "Qashqai", 70);
        automovil.start();
        automovil.drive();
        automovil.stop();
    }

    /**
     * Default constructor of the class
     */
    public Automovil (){}

    /**
     * Constructor of the class
     * @param brand of the car
     */
    public Automovil(String brand) {
        this.brand = brand;
    }
    /**
     * Constructor of the class
     * @param brand of the car
     * @param model of the car
     */
    public Automovil(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    /**
     * Constructor of the class
     * @param brand of the car
     * @param model of the car
     * @param speed of the car
     */
    public Automovil(String brand, String model, int speed) {
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


    @Override
    public void start() {
        System.out.println("The " + brand + " " + model + " has started moving.");
    }

    @Override
    public void stop() {
        System.out.println("The " + brand + " " + model + " has stopped.");
    }

    public void drive() {
        System.out.println("The " + brand + " " + model + " is in moving at " + speed+ "km/h");
    }

    @Override
    public String toString (){
        return "> Data provided: " + brand + ", " + model + ", " + speed + "km/h";
    }
}

