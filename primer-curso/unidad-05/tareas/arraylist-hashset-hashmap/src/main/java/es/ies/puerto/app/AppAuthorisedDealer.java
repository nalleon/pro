package es.ies.puerto.app;

import es.ies.puerto.vehicles.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class AppAuthorisedDealer {
    public static void main(String[] args) {
        setValuesOfVehicles();
        addCars();
        addMotorcycles();
        addBikes();
        addTrucks();

        menu();
    }

    static AuthorisedDealer authorisedDealer = new AuthorisedDealer();
    static Car car1;
    static Car car2;
    static Car car3;
    static  Car car4;
    static  Car car5;
    static Motorcycle motorcycle1;
    static Motorcycle motorcycle2;
    static Motorcycle motorcycle3;
    static Motorcycle motorcycle4;
    static Motorcycle motorcycle5;
    static Bike bike1;
    static Bike bike2;
    static Bike bike3;
    static Bike bike4;
    static Bike bike5;
    static Truck truck1;
    static Truck truck2;
    static Truck truck3;
    static Truck truck4;
    static Truck truck5;

    public static void setValuesOfVehicles (){
         car1 = new Car("Toyota","Corolla","ABC123",60);
         car2 = new Car("Honda","Civic","XYZ789",75);
         car3 = new Car("Ford","Mustang","DEF456",100);
         car4 = new Car("Chevrolet","Impala","GHI789",80);
         car5 = new Car("Volkswagen","Golf","JKL012",65);

         motorcycle1 = new Motorcycle("Harley-Davidson","Sportster","MNO345",50);
         motorcycle2 = new Motorcycle("Yamaha","YZF R6","PQR678",90);
         motorcycle3 = new Motorcycle("Ducati","Monster","STU901",70);
         motorcycle4 = new Motorcycle("Suzuki","GSX-R750","VWX234",80);
         motorcycle5 = new Motorcycle("Kawasaki","Ninja","ZAB567",85);

         bike1 = new Bike("Trek","MountainBike","PQR456",30);
         bike2 = new Bike("Giant","Giant","MNO789",25);
         bike3 = new Bike("Specialized","RoadBike","JKL012",28);
         bike4 = new Bike("Cannondale","HybridBike","DEF345",26);
         bike5 = new Bike("Schwinn","Cruiser","MNO678",22);

         truck1 = new Truck("Chevrolet","Silverado","UVW567",150);
         truck2 = new Truck("Ford","Ranger","LMN890",130);
         truck3 = new Truck("Toyota","Hilux","PQR123",140);
         truck4 = new Truck("Nissan","Navara","ABC456",145);
         truck5 = new Truck("Dodge","Ram","XYZ789",160);
    }

    /**
     * Method that adds cars. Each car is added twice to test if the duplicates are removed.
     */
    public static void addCars(){
        authorisedDealer.addCar(car1);
        authorisedDealer.addCar(car2);
        authorisedDealer.addCar(car3);
        authorisedDealer.addCar(car4);
        authorisedDealer.addCar(car5);
        authorisedDealer.addCar(car1);
        authorisedDealer.addCar(car2);
        authorisedDealer.addCar(car3);
        authorisedDealer.addCar(car4);
        authorisedDealer.addCar(car5);

    }
    /**
     * Method that adds motorcycle. Each motorcycle is added twice to test if the duplicates are removed.
     */
    public static void addMotorcycles(){
        authorisedDealer.addMotorcycle(motorcycle1);
        authorisedDealer.addMotorcycle(motorcycle2);
        authorisedDealer.addMotorcycle(motorcycle3);
        authorisedDealer.addMotorcycle(motorcycle4);
        authorisedDealer.addMotorcycle(motorcycle5);
        authorisedDealer.addMotorcycle(motorcycle1);
        authorisedDealer.addMotorcycle(motorcycle2);
        authorisedDealer.addMotorcycle(motorcycle3);
        authorisedDealer.addMotorcycle(motorcycle4);
        authorisedDealer.addMotorcycle(motorcycle5);
    }

    /**
     * Method that adds bikes. Each bike is added twice to test if the duplicates are removed.
     */
    public static void addBikes(){
        authorisedDealer.addBike(bike1);
        authorisedDealer.addBike(bike2);
        authorisedDealer.addBike(bike3);
        authorisedDealer.addBike(bike4);
        authorisedDealer.addBike(bike5);
        authorisedDealer.addBike(bike1);
        authorisedDealer.addBike(bike2);
        authorisedDealer.addBike(bike3);
        authorisedDealer.addBike(bike4);
        authorisedDealer.addBike(bike5);
    }
    /**
     * Method that adds trucks. Each truck is added twice to test if the duplicates are removed.
     */
    public static void addTrucks(){
        authorisedDealer.addTruck(truck1);
        authorisedDealer.addTruck(truck2);
        authorisedDealer.addTruck(truck3);
        authorisedDealer.addTruck(truck4);
        authorisedDealer.addTruck(truck5);
        authorisedDealer.addTruck(truck1);
        authorisedDealer.addTruck(truck2);
        authorisedDealer.addTruck(truck3);
        authorisedDealer.addTruck(truck4);
        authorisedDealer.addTruck(truck5);
    }

    public static void menu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option: \n" +
                "*\n" +
                "* 1. Add vehicle\n" +
                "* 2. Modify a vehicle\n" +
                "* 3. Delete a vehicle\n" +
                "* 4. Show average speed for type of vehicle\n" +
                "* 5. Show vehicles\n" +
                "***************************");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                vehicleToAdd();
                break;
            case 2:
                vehicleToModify();
                break;
            case 3:
                vehicleToRemove();
                break;
            case 4:
                vehicleAVGSpeed();
                break;
            case 5:
                showVehicles();
                break;
        }
    }

    /**
     * Method to add a vehicle of the user's choosing
     */
    public static void vehicleToAdd (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option to add: \n" +
                "*\n" +
                "* 1. Car\n" +
                "* 2. Motorcycle\n" +
                "* 3. Bike\n" +
                "* 4. Truck\n" +
                "***************************");

        int vehicleType = scanner.nextInt();

        System.out.println("Enter the vehicle's details ");
        System.out.print("Brand: ");
        String brand = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("License plate: ");
        String licensePlate = scanner.next();

        System.out.print("Speed: ");
        int speed = scanner.nextInt();

        switch (vehicleType){
            case 1:
                Car car = new Car(brand, model, licensePlate, speed);
                authorisedDealer.addCar(car);
                break;

            case 2:
                Motorcycle motorcycle = new Motorcycle(brand, model, licensePlate, speed);
                authorisedDealer.addMotorcycle(motorcycle);
                break;
            case 3:
                Bike bike = new Bike(brand, model, licensePlate, speed);
                authorisedDealer.addBike(bike);
                break;
            case 4:
                Truck truck = new Truck(brand, model, licensePlate, speed);
                authorisedDealer.addTruck(truck);
                break;
            default:
                System.out.println("Number does not match any of the options.");
                break;
        }
    }
    /**
     * Method to remove a vehicle of the user's choosing
     */
    public static void vehicleToRemove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option to remove: \n" +
                "*\n" +
                "* 1. Car\n" +
                "* 2. Motorcycle\n" +
                "* 3. Bike\n" +
                "* 4. Truck\n" +
                "***************************");

        int vehicleOption = scanner.nextInt();

        System.out.print("Enter the license plate of the vehicle to remove: ");
        String licensePlate = scanner.nextLine();
        licensePlate = licensePlate.toUpperCase();

        switch (vehicleOption){
            case 1:
                Car car = new Car(licensePlate);
                if (!authorisedDealer.getCarHash().contains(licensePlate)){
                    System.out.println("Car does not exist.");
                    break;
                }
                authorisedDealer.removeCar(car);
                break;

            case 2:
                Motorcycle motorcycle = new Motorcycle(licensePlate);
                if (!authorisedDealer.getMotorcycleList().contains(licensePlate)){
                    System.out.println("Motorcycle does not exist.");
                    break;
                }
                authorisedDealer.removeMotorcycle(motorcycle);
                break;
            case 3:
                Bike bike = new Bike(licensePlate);
                if (!authorisedDealer.getBikeHashMap().containsKey(licensePlate)){
                    System.out.println("Bike does not exist.");
                    break;
                }
                authorisedDealer.removeBike(bike);
                break;
            case 4:
                Truck truck = new Truck(licensePlate);
                if (!authorisedDealer.getTruckHashMap().containsKey(licensePlate)){
                    System.out.println("Truck does not exist.");
                    break;
                }
                authorisedDealer.removeTruck(truck);
                break;

            default:
                System.out.println("Number does not match any of the options.");
                break;
        }
    }

    /**
     * Method to modify a vehicle of the user's choosing
     */
    public static void vehicleToModify(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option to modify: \n" +
                "*\n" +
                "* 1. Car\n" +
                "* 2. Motorcycle\n" +
                "* 3. Bike\n" +
                "* 4. Truck\n" +
                "***************************");

        int vehicleOption = scanner.nextInt();
        System.out.print("Enter the license plate of the vehicle to remove: ");
        String licensePlate = scanner.nextLine();
        licensePlate = licensePlate.toUpperCase();

        switch (vehicleOption) {
            case 1:
                Car carToModify = new Car(licensePlate);
                if (authorisedDealer.getCarHash().contains(licensePlate)){
                    authorisedDealer.removeCar(carToModify);
                    System.out.println("Enter the vehicle's details ");
                    System.out.print("Brand: ");
                    String brand = scanner.next();

                    System.out.print("Model: ");
                    String model = scanner.next();

                    System.out.print("Speed: ");
                    int speed = scanner.nextInt();

                    Car modifiedCar = new Car(brand, model, licensePlate, speed);

                    authorisedDealer.addCar(modifiedCar);
                    break;
                }
            case 2:
                Motorcycle motorcycleToModify = new Motorcycle(licensePlate);
                if (authorisedDealer.getMotorcycleList().contains(licensePlate)){
                    authorisedDealer.removeMotorcycle(motorcycleToModify);
                    System.out.println("Enter the vehicle's details ");
                    System.out.print("Brand: ");
                    String brand = scanner.next();

                    System.out.print("Model: ");
                    String model = scanner.next();

                    System.out.print("Speed: ");
                    int speed = scanner.nextInt();

                    Motorcycle modifiedMotorcycle = new Motorcycle(brand, model, licensePlate, speed);

                    authorisedDealer.addMotorcycle(modifiedMotorcycle);
                    break;
                }

            case 3:
                Bike bikeToModify = new Bike(licensePlate);
                if (authorisedDealer.getBikeHashMap().containsKey(licensePlate)){
                    authorisedDealer.removeBike(bikeToModify);
                    System.out.println("Enter the vehicle's details ");
                    System.out.print("Brand: ");
                    String brand = scanner.next();

                    System.out.print("Model: ");
                    String model = scanner.next();

                    System.out.print("Speed: ");
                    int speed = scanner.nextInt();

                    Bike modifiedBike = new Bike(brand, model, licensePlate, speed);

                    authorisedDealer.addBike(modifiedBike);
                    break;
                }

            case 4:
                Truck truckToModify = new Truck(licensePlate);
                if (authorisedDealer.getTruckHashMap().containsKey(licensePlate)) {
                    authorisedDealer.removeTruck(truckToModify);
                    System.out.println("Enter the vehicle's details ");
                    System.out.print("Brand: ");
                    String brand = scanner.next();

                    System.out.print("Model: ");
                    String model = scanner.next();

                    System.out.print("Speed: ");
                    int speed = scanner.nextInt();

                    Truck modifiedTruck = new Truck(brand, model, licensePlate, speed);

                    authorisedDealer.addTruck(modifiedTruck);
                    break;
                }

            default:
                System.out.println("Number does not match any of the options.");
                break;
        }
    }
    /**
     * Method to show the average speed of a vehicle of the user's choosing
     */
    public static void vehicleAVGSpeed (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option to show their average speed: \n" +
                "*\n" +
                "* 1. Car\n" +
                "* 2. Motorcycle\n" +
                "* 3. Bike\n" +
                "* 4. Truck\n" +
                "***************************");

        int vehicleOption = scanner.nextInt();
        switch (vehicleOption){
            case 1:
                System.out.println(authorisedDealer.averageCarSpeed());
                break;
            case 2:
                System.out.println(authorisedDealer.averageMotorcycleSpeed());
                break;
            case 3:
                System.out.println(authorisedDealer.averageBikeSpeed());
                break;
            case 4:
                System.out.println(authorisedDealer.averageTruckSpeed());
                break;
            case 5:
                System.out.println(authorisedDealer.averageVehiclesSpeed());
                break;
        }
    }
    /**
     * Method to show a list vehicles of the user's choosing
     */
    public static void showVehicles (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option to show its contents: \n" +
                "*\n" +
                "* 1. Car\n" +
                "* 2. Motorcycle\n" +
                "* 3. Bike\n" +
                "* 4. Truck\n" +
                "* 5. All\n" +
                "***************************");

        int vehicleOption = scanner.nextInt();
        switch (vehicleOption){
            case 1:
                System.out.println(authorisedDealer.getCarHash());
                break;
            case 2:
                System.out.println(authorisedDealer.getMotorcycleList());
                break;
            case 3:
                System.out.println(authorisedDealer.getBikeHashMap());
                break;
            case 4:
                System.out.println(authorisedDealer.getTruckHashMap());
                break;
            case 5:
                System.out.println(authorisedDealer);
                break;
        }
    }
}
