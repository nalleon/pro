package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

public class Car extends Vehicle {

    /**
     * Default constructor of the class
     */
    public Car(){}

    /**
     * Constructor of the class
     * @param brand of the car
     * @param model of the car
     * @param licensePlate of the car
     * @param speed of the car
     */
    public Car(String brand, String model, String licensePlate, int speed) {
        super(brand, model, licensePlate, speed);
    }

    @Override
    public int maxSpeed() {
        return 180;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", licensePlate='" + getLicensePlate() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}