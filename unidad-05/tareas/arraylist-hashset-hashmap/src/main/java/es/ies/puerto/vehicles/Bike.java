package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

public class Bike extends Vehicle {
    /**
     * Default constructor of the class
     */
    public Bike () {}

    /**
     * Constructor of the class
     * @param brand of the bike
     * @param model of the bike
     * @param licensePlate of the bike
     * @param speed of the bike
     */
    public Bike(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
    }

    public Bike(String licensePlate) {
    }

    @Override
    public int maxSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", licensePlate='" + getLicensePlate() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}
