package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

public class Motorcycle extends Vehicle {

    /**
     * Default constructor of the class
     */
    public Motorcycle(){}

    /**
     * Constructor of the class
     * @param brand of the motorcycle
     * @param model of the motorcycle
     * @param licensePlate of the motorcycle
     * @param speed of the motorcycle
     */
    public Motorcycle(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
