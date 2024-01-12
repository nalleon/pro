package ies.puerto;

public class Coche extends Vehiculo {
    private float totalKM;
    private String color;
    public Coche (){}

    public Coche (float totalKM){
        this.totalKM = totalKM;
        this.color = color;

    }
    public Coche (String brand, String model, float price, float totalKM, String color){
        super(model, price, brand);
        this.totalKM = totalKM;
        this.color = color;
    }
    @Override
    public String toString() {
        return "TotalKM: " + totalKM + "\nColor: " + color;
    }
}
