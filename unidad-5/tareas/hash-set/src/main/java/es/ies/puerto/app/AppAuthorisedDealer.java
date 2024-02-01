package es.ies.puerto.app;

import es.ies.puerto.vehicles.*;

import java.util.Scanner;

public class AppAuthorisedDealer {

    static AuthorisedDealer authorisedDealer = new AuthorisedDealer();

    public static void main(String[] args) {
        AuthorisedDealerCarTest();
        AuthorisedDealerMotorCycleTest();
        AuthorisedDealerBikeTest();
        AuthorisedDealerTruckTest();
        System.out.println("> AVG vehicles speed: " +authorisedDealer.averageVehiclesSpeed() + "km/h");
    }


    public static void AuthorisedDealerCarTest() {
        Car car1 = new Car("Toyota","Corolla","ABC123",60);
        Car car2 = new Car("Honda","Civic","XYZ789",75);
        Car car3 = new Car("Ford","Mustang","DEF456",100);
        Car car4 = new Car("Chevrolet","Impala","GHI789",80);
        Car car5 = new Car("Volkswagen","Golf","JKL012",65);



        System.out.println("> Adding cars: \ncar1: " + authorisedDealer.addCar(car1) + "\ncar2: " +authorisedDealer.
                addCar(car2)  + "\ncar3: " + authorisedDealer.addCar(car3)  + "\ncar4: " + authorisedDealer.
                addCar(car4)  + "\ncar5: " +authorisedDealer.addCar(car5));

        System.out.println("> Adding the same cars again: \ncar1: " + authorisedDealer.addCar(car1) + "\ncar2: "
                +authorisedDealer.addCar(car2)  + "\ncar3: " + authorisedDealer.addCar(car3)  + "\ncar4: "
                + authorisedDealer.addCar(car4)  + "\ncar5: " +authorisedDealer.addCar(car5));

        System.out.println("> Removing car3: " + authorisedDealer.removeCar(car3));

        System.out.println("> Adding again car3: " + authorisedDealer.addCar(car3));

        System.out.println("> AVG cars speed: " + authorisedDealer.averageCarSpeed() + "km/h");

        System.out.println("> Searching for acar with license plate 'XYZ789': " + authorisedDealer.searchCar
                ("XYZ789"));
        System.out.println("> Searching for acar with license plate 'UDF548': " + authorisedDealer.searchCar
                ("UDF548"));
    }

    public static void AuthorisedDealerMotorCycleTest() {
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson","Sportster","MNO345",50);
        Motorcycle motorcycle2 = new Motorcycle("Yamaha","YZF R6","PQR678",90);
        Motorcycle motorcycle3 = new Motorcycle("Ducati","Monster","STU901",70);
        Motorcycle motorcycle4 = new Motorcycle("Suzuki","GSX-R750","VWX234",80);
        Motorcycle motorcycle5 = new Motorcycle("Kawasaki","Ninja","ZAB567",85);



        System.out.println("> Adding motorcycles: \nmotorcycle1: " + authorisedDealer.addMotorcycle(motorcycle1) +
                "\nmotorcycle2: " +authorisedDealer.addMotorcycle(motorcycle2)  + "\nmotorcycle3: " + authorisedDealer.
                addMotorcycle(motorcycle3)  + "\nmotorcycle4: " + authorisedDealer.addMotorcycle(motorcycle4)
                + "\nmotorcycle5: " +authorisedDealer.addMotorcycle(motorcycle5));

        System.out.println("> Adding the same motorcycles again: \nmotorcycle1: "  +
                authorisedDealer.addMotorcycle(motorcycle1) + "\nmotorcycle2: " +authorisedDealer.addMotorcycle
                (motorcycle2)  + "\nmotorcycle3: " + authorisedDealer.addMotorcycle(motorcycle3)  + "\nmotorcycle4: "
                + authorisedDealer.addMotorcycle(motorcycle4) + "\nmotorcycle5: " +
                authorisedDealer.addMotorcycle(motorcycle5));;

        System.out.println("> Removing motorcycle3: " + authorisedDealer.removeMotorcycle(motorcycle3));

        System.out.println("> Adding again motorcycle3: " + authorisedDealer.addMotorcycle(motorcycle3));

        System.out.println("> AVG motorcycle speed: " + authorisedDealer.averageMotorcycleSpeed()+ "km/h");

        System.out.println("> Searching for a motorcycle with license plate 'MNO345': " +
                authorisedDealer.searchMotorcycle("MNO345"));
        System.out.println("> Searching for a motorcycle with license plate 'ZAB564': " +
                authorisedDealer.searchMotorcycle("ZAB564"));
    }
    public static void AuthorisedDealerBikeTest() {
        Bike bike1 = new Bike("Trek","MountainBike","PQR456",30);
        Bike bike2 = new Bike("Giant","Giant","MNO789",25);
        Bike bike3 = new Bike("Specialized","RoadBike","JKL012",28);
        Bike bike4 = new Bike("Cannondale","HybridBike","DEF345",26);
        Bike bike5 = new Bike("Schwinn","Cruiser","MNO678",22);

        System.out.println("> Adding bikes: \nbike1: " + authorisedDealer.addBike(bike1) +
                "\nbike2: " +authorisedDealer.addBike(bike2) + "\nbike3: " + authorisedDealer.addBike(bike3) +
                "\nbike4: " + authorisedDealer.addBike(bike4) + "\nbike5: " +authorisedDealer.addBike(bike5));

        System.out.println("> Adding the same bikes again: \nbike1: " + authorisedDealer.addBike(bike1) +
                "\nbike2: " +authorisedDealer.addBike(bike2) + "\nbike3: " + authorisedDealer.addBike(bike3) +
                "\nbike4: " + authorisedDealer.addBike(bike4) + "\nbike5: " +authorisedDealer.addBike(bike5));

        System.out.println("> Removing motorcycle3: " + authorisedDealer.removeBike(bike3));

        System.out.println("> Adding again motorcycle3: " + authorisedDealer.addBike(bike3));

        System.out.println("> AVG bikes speed: " + authorisedDealer.averageBikeSpeed() + "km/h");

        System.out.println("> Searching for a bike with license plate 'DEF345': " +
                authorisedDealer.searchBike("DEF345"));
        System.out.println("> Searching for a motorcycle with license plate 'PQR453': " +
                authorisedDealer.searchBike("PQR453"));
    }

    public static void AuthorisedDealerTruckTest() {
        Truck truck1 = new Truck("Chevrolet","Silverado","UVW567",150);
        Truck truck2 = new Truck("Ford","Ranger","LMN890",130);
        Truck truck3 = new Truck("Toyota","Hilux","PQR123",140);
        Truck truck4 = new Truck("Nissan","Navara","ABC456",145);
        Truck truck5 = new Truck("Dodge","Ram","XYZ789",160);


        System.out.println("> Adding bikes: \ntruck1: " + authorisedDealer.addTruck(truck1) + "\ntruck2: " +
                authorisedDealer.addTruck(truck2) + "\ntruck3: " + authorisedDealer.addTruck(truck3) +
                "\ntruck4: " + authorisedDealer.addTruck(truck4) + "\ntruck5: " + authorisedDealer.addTruck(truck5));

        System.out.println("> Adding the same trucks again:  \ntruck1: " + authorisedDealer.addTruck(truck1) +
                "\ntruck2: " + authorisedDealer.addTruck(truck2) + "\ntruck3: " + authorisedDealer.addTruck(truck3) +
                "\ntruck4: " + authorisedDealer.addTruck(truck4) + "\ntruck5: " + authorisedDealer.addTruck(truck5));

        System.out.println("> Removing motorcycle3: " + authorisedDealer.removeTruck(truck3));

        System.out.println("> Adding again motorcycle3: " + authorisedDealer.removeTruck(truck3));

        System.out.println("> AVG bikes speed: " + authorisedDealer.averageTruckSpeed() + "km/h");

        System.out.println("> Searching for a bike with license plate 'LMN890': " +
                authorisedDealer.searchTruck("LMN890"));
        System.out.println("> Searching for a motorcycle with license plate 'ABC452': " +
                authorisedDealer.searchTruck("ABC452"));
    }
}
