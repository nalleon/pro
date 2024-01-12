package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Conductor extends Coche {
    private String driverName;
    private String driverDNI;

    public Conductor (){}

    public Conductor (String driverName){
        this.driverName = driverName;
    }

    public Conductor (String driverName, String driverDNI){
        this.driverName = driverName;
        this.driverDNI = driverDNI;
    }

    public Conductor (String driverName, String driverDNI, String brand, String model, float price, float totalKM,
                      String color){
        super(brand, model, price, totalKM, color);
        this.driverName = driverName;
        this.driverDNI = driverDNI;
    }
    public boolean validateDNI (){
        String regex = "(\\d{8}[A-HJ-NP-TV-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(driverDNI);

        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Name: " + driverName + "\nDNI: " + driverDNI;
    }
}
