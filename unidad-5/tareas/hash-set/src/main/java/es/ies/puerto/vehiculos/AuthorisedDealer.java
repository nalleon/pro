package es.ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AuthorisedDealer {
    private List<Motorcycle> motorcycleList;
    private HashSet<Car> carHash;

    /**
     * Default constructpor of the class
     */
    public AuthorisedDealer(){
        motorcycleList = new ArrayList<>();
        carHash = new HashSet<>();
    }

    /**
     * Method to add a motorcycle to the list
     * @param motorcycle to add
     * @return if true motorcycle, if not false
     */
    public boolean addMotorcycle (Motorcycle motorcycle){
        return motorcycleList.add(motorcycle);
    }
    /**
     * Method to remove a motorcycle of the list
     * @param motorcycle to remove
     * @return if true motorcycle is removed from the list, if not false
     */
    public boolean removeMotorcycle (Motorcycle motorcycle){
        return motorcycleList.remove(motorcycle);
    }

    /**
     * Method to search for a motorcycle
     * @param licensePlate of the motorcycle
     * @return motorcycle if the licensePlate equals another, null if not
     */
    public Motorcycle searchMotorcycle (String licensePlate){
        for (Motorcycle motorcycle : motorcycleList){
            if (motorcycle.getLicensePlate().equals(licensePlate)){
                return motorcycle;
            }
        }
        return null;
    }

    /**
     * Method to calculate the average speed of a motorcycle
     */
    public float averageMotorcycleSpeed (){
        float sum = 0f;
        for (Motorcycle motorcycle : motorcycleList){
            sum += motorcycle.getSpeed();
        }
        return sum/motorcycleList.size();
    }

    /**
     * Method to add a car to the list
     * @param car to add
     * @return if true car, if not false
     */
    public boolean addCar (Car car){
        return carHash.add(car);
    }
    /**
     * Method to remove a car of the list
     * @param car to remove
     * @return if true car is removed from the list, if not false
     */
    public boolean removeCar (Car car){
        return carHash.remove(car);
    }
    /**
     * Method to search for a car
     * @param licensePlate of the cat
     * @return car if the licensePlate equals another, null if not
     */
    public Car searchCar (String licensePlate){
        for (Car car : carHash){
            if (car.getLicensePlate().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }

    /**
     * Method to calculate the average speed of a motorcycle
     */
    public float averageCarSpeed (){
        float sum = 0f;
        for (Car car : carHash){
            sum += car.getSpeed();
        }
        return sum/carHash.size();
    }

    /**
     * Method to calculate the average speed of the vehicles
     */
    public float averageVehiclesSpeed (){
        float speedSum = averageCarSpeed() + averageMotorcycleSpeed();
        return speedSum/2;
    }
}
