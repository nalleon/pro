package ies.puerto;

public class AppVehiculo {
    static Coche coche;
    static Motocicleta motocicleta;

    static Conductor conductor;

    public static void main(String[] args) {
        motocicleta = new Motocicleta ("Nissan", "RTZ", 12500.45f, 1200.5f, "Red");
        coche = new Coche("Nissan", "AJZ", 15500.5f, 1500f, "Gray");
        conductor = new Conductor("Agustin", "23456899P");
        System.out.println("> Car's info:\n" + coche.toString());
        System.out.println("> Motorcycle's info:\n" + motocicleta.toString());
        System.out.println("> Driver's info:\n" + conductor.toString());
        System.out.println("> Driver's DNI validate: " + conductor.validateDNI());
    }
}
