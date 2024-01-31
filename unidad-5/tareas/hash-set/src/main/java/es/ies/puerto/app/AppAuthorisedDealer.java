package es.ies.puerto.app;

import es.ies.puerto.vehiculos.AuthorisedDealer;
import es.ies.puerto.vehiculos.Car;
import es.ies.puerto.vehiculos.Motorcycle;

import java.util.HashSet;

public class AppAuthorisedDealer {

    static AuthorisedDealer authorisedDealer = new AuthorisedDealer();

    public static void main(String[] args) {
        AuthorisedDealerCarTest();
        AuthorisedDealerMotorCycleTest();
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

        System.out.println("> Removing motorcycle3: " + authorisedDealer.removeMotorcycle(motorcycle3));

        System.out.println("> Adding again motorcycle3: " + authorisedDealer.addMotorcycle(motorcycle3));

        System.out.println("> AVG motorcycle speed: " + authorisedDealer.averageMotorcycleSpeed()+ "km/h");

        System.out.println("> Searching for a motorcycle with license plate 'MNO345': " +
                authorisedDealer.searchMotorcycle("MNO345"));
        System.out.println("> Searching for a motorcycle with license plate 'ZAB564': " +
                authorisedDealer.searchMotorcycle("ZAB564"));
    }


}
