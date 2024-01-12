package ies.puerto;

public class Motocicleta extends Vehiculo {

    private float totalKM;
    private String color;

    public Motocicleta (){}

    public Motocicleta (float totalKM){
        this.totalKM = totalKM;
    }
    public Motocicleta (float totalKM, String color){
        this.totalKM = totalKM;
        this.color = color;
    }
    public Motocicleta (String brand, String model, float price, float totalKM,  String color){
        super(model, price, brand);
        this.totalKM = totalKM;
        this.color = color;

    }

    @Override
    public String toString() {
        return "TotalKM: " + totalKM + "\nColor: " + color;
    }
}
