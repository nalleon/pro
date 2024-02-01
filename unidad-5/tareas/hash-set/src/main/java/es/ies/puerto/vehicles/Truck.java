package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

public class Truck extends Vehicle {
    /**
     * Default constructor of the class
     */
    public Truck () {}

    /**
     * Constructor of the class
     * @param brand of the truck
     * @param model of the truck
     * @param licensePlate of the truck
     * @param speed of the truck
     */
    public Truck(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
    }

    @Override
    public int maxSpeed() {
        return 160;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", licensePlate='" + getLicensePlate() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}
