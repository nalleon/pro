package es.ies.puerto.impl;

import es.ies.puerto.abstracts.ProductAbstrac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends ProductAbstrac {
    public static void main(String[] args) {
        Food Food1 = new Food("Food1",2.50f,"2024-01-01","udi1");

    }
    public Food(String name, float price, String dateOfEntrance, String udi) {
        super(name, price, dateOfEntrance, udi);
    }

    public Food(String udi) {
    }

    @Override
    public float maxPrice() {
        return super.getPrice()*0.23f;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }

    public int availableDays() throws ParseException {
        String productDateEntrance = super.getDateOfEntrance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDateEntrance =  dateFormat.parse(productDateEntrance);
        Date todaysDate = new Date();

        long result = (todaysDate.getTime() - parsedDateEntrance.getTime())/(24*60*60*1000);

        return (int) result;
    }

    public boolean expiredFood () throws ParseException {
        if (availableDays() < 30){
            return false;
        }
        return availableDays() > 30;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Food{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", dateOfEntrance='" + getDateOfEntrance() + '\'' +
                ", udi='" + getUdi() + '\'' +
                '}';
    }
}
