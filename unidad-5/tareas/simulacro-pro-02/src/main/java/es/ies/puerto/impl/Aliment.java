package es.ies.puerto.impl;

import es.ies.puerto.abstracts.Product;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Aliment extends Product {
    /**
     * Default constructor of the class
     */
    public Aliment () {}

    public Aliment (String udi){
        super(udi);
    }

    /**
     * Constructor of the class
     * @param name of the aliment
     * @param price of the aliment
     * @param dateEntrance of the aliment
     * @param udi of the aliment
     */
    public Aliment(String name, float price, String dateEntrance, String udi) {
        super(name, price, dateEntrance, udi);
    }

    @Override
    public float maxPrice() {
        return getPrice() * 0.23f;
    }

    @Override
    public int quantity() {
        return 0;
    }

    /**
     * Method to calculates how many days the product is passed
     * @param dateEntrance to evalua
     * @return int of result days
     * @throws ParseException if format does not match
     */
    public int daysOnAvaliable (String dateEntrance) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateEntranceProduct = dateFormat.parse(dateEntrance);
        Date todaysDate = new Date();

        long result = (todaysDate.getTime() - dateEntranceProduct.getTime())/24*60*60*1000L;
        return Math.abs((int) result);

    }

    public boolean passedProduct (String dateEntrance) throws ParseException {
        return daysOnAvaliable(dateEntrance) >= 30;
    }
    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", dateEntrance='" + super.getDateEntrance() + '\'' +
                ", udi='" + super.getUdi() + '\'' +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(super.getUdi(), product.getUdi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getUdi());
    }
}
