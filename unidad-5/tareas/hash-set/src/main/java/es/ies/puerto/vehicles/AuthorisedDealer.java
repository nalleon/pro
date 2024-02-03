package es.ies.puerto.vehicles;

import es.ies.puerto.map.impl.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AuthorisedDealer {
    private List<Motorcycle> motorcycleList;
    private HashSet<Car> carHash;

    private HashMap<String, Bike> bikeHashMap;
    private HashMap<String, Truck> truckHashMap;

    /**
     * Default constructor of the class
     */
    public AuthorisedDealer(){
        motorcycleList = new ArrayList<>();
        carHash = new HashSet<>();
        bikeHashMap = new HashMap<>();
        truckHashMap = new HashMap<>();
    }

    /**
     * Method to add a motorcycle to the list
     * @param motorcycle to add
     * @return if true motorcycle, if not false
     */
    public boolean addMotorcycle (Motorcycle motorcycle){
        if (motorcycleList.contains(motorcycle)){
            return false;
        }
        return motorcycleList.add(motorcycle);
    }
    /**
     * Method to remove a motorcycle of the list
     * @param motorcycle to remove
     * @return if true motorcycle is removed from the list, if not false
     */
    public boolean removeMotorcycle (Motorcycle motorcycle){
        if (!motorcycleList.contains(motorcycle)){
            return false;
        }
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
        float result = 0f;
        if (motorcycleList.isEmpty()){
            return result;
        }
        for (Motorcycle motorcycle : motorcycleList){
            result += motorcycle.getSpeed();
        }
        return result/motorcycleList.size();
    }

    /**
     * Method to add a car to the list
     * @param car to add
     * @return if true car, if not false
     */
    public boolean addCar (Car car){
        if (carHash.contains(car)){
            return false;
        }
        return carHash.add(car);
    }
    /**
     * Method to remove a car of the list
     * @param car to remove
     * @return if true car is removed from the list, if not false
     */
    public boolean removeCar (Car car){
        if (carHash.contains(car)){
            return false;
        }
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
        float result = 0f;
        if (carHash.isEmpty()){
            return result;
        }
        for (Car car : carHash){
            result += car.getSpeed();
        }
        return result/carHash.size();
    }

    /**
     * Method to add a bike to the map
     * @param bike to add
     * @return if true bike has been added, if not false
     */
    public boolean addBike (Bike bike){
        if (!existBikeHashMap(bike)){
            bikeHashMap.put(bike.getLicensePlate(), bike);
            return true;
        }
        return false;
    }

    /**
     * Auxiliar method to "addBike"
     * @param bike to check if exists
     * @return false if bikeHashMpa is empty, true if bikeHashMap has the licensePlate
     */
    public boolean existBikeHashMap (Bike bike){
        if (bikeHashMap.isEmpty()){
            return false;
        }
        return bikeHashMap.containsKey(bike.getLicensePlate());
    }

    /**
     * Method to remove a bike of the list
     * @param bike to remove
     * @return if true bike is removed from the list, if not false
     */
    public boolean removeBike (Bike bike){
        if (existBikeHashMap(bike)){
            bikeHashMap.remove(bike.getLicensePlate(), bike);
            return true;
        }
        return false;
    }
    /**
     * Method to search for a bike
     * @param licensePlate of the bike
     * @return bike if the licensePlate equals another, null if not
     */
    public Bike searchBike (String licensePlate){
        Bike bike = bikeHashMap.get(licensePlate);
            if (bikeHashMap.containsKey(licensePlate)){
                return bike;
        }
        return null;
    }

    /**
     * Method to calculate the average speed of a bike
     */
    public float averageBikeSpeed (){
        float result = 0f;
        if (bikeHashMap.isEmpty()){
            return result;
        }

        for (Bike bike : bikeHashMap.values()){
            result += bike.getSpeed();
        }
        return result/bikeHashMap.size();
    }

    /**
     * Method to add a truck to the map
     * @param truck to add
     * @return if true truck has been added, if not false
     */
    public boolean addTruck (Truck truck){
        if (!existTruckHashMap(truck)){
            truckHashMap.put(truck.getLicensePlate(), truck);
            return true;
        }
        return false;
    }

    /**
     * Auxiliar method to "addTruck" and "removeTruck"
     * @param truck to check if exists
     * @return false if truckHashMap is empty, true if truckHashMap has the licensePlate
     */
    public boolean existTruckHashMap (Truck truck){
        if (truckHashMap.isEmpty()){
            return false;
        }
        return truckHashMap.containsKey(truck.getLicensePlate());
    }

    /**
     * Method to remove a truck of the list
     * @param truck to remove
     * @return if true truck is removed from the list, if not false
     */
    public boolean removeTruck (Truck truck){
        if (existTruckHashMap(truck)){
            truckHashMap.remove(truck.getLicensePlate(), truck);
            return true;
        }
        return false;
    }
    /**
     * Method to search for a truck
     * @param licensePlate of the cat
     * @return truck if the licensePlate equals another, null if not
     */
    public Truck searchTruck(String licensePlate){
        Truck truck = truckHashMap.get(licensePlate);
        if (truckHashMap.containsKey(licensePlate)){
            return truck;
        }
        return null;
    }

    /**
     * Method to calculate the average speed of a bike
     */
    public float averageTruckSpeed (){
        float result = 0f;
        if (truckHashMap.isEmpty()){
            return result;
        }

        for (Truck truck : truckHashMap.values()){
            result += truck.getSpeed();
        }
        return result/truckHashMap.size();
    }

    /**
     * Method to calculate the average speed of the vehicles
     */
    public float averageVehiclesSpeed (){
        float speedSum = averageCarSpeed() + averageMotorcycleSpeed() + averageBikeSpeed() + averageTruckSpeed();
        return speedSum/4;
    }

    /**
     * Getters and setters
     */
    public List<Motorcycle> getMotorcycleList() {
        return motorcycleList;
    }

    public void setMotorcycleList(List<Motorcycle> motorcycleList) {
        this.motorcycleList = motorcycleList;
    }

    public HashSet<Car> getCarHash() {
        return carHash;
    }

    public void setCarHash(HashSet<Car> carHash) {
        this.carHash = carHash;
    }

    public HashMap<String, Bike> getBikeHashMap() {
        return bikeHashMap;
    }

    public void setBikeHashMap(HashMap<String, Bike> bikeHashMap) {
        this.bikeHashMap = bikeHashMap;
    }

    public HashMap<String, Truck> getTruckHashMap() {
        return truckHashMap;
    }

    public void setTruckHashMap(HashMap<String, Truck> truckHashMap) {
        this.truckHashMap = truckHashMap;
    }

    @Override
    public String toString() {
        return "AuthorisedDealer{" +
                "motorcycleList=" + motorcycleList +
                ", carHash=" + carHash +
                ", bikeHashMap=" + bikeHashMap +
                ", truckHashMap=" + truckHashMap +
                '}';
    }
}
