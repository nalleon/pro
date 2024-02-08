package es.ies.puerto.impl;

import es.ies.puerto.abstracts.Product;

import java.util.Objects;

public class Souvenir extends Product {

    /**
     * Default constructor of the class
     */
    public Souvenir() {
    }

    public Souvenir (String udi){
        super(udi);
    }

    /**
     * Constructor of the class
     * @param name of the souvenir
     * @param price of the souvenir
     * @param dateEntrance of the souvenir
     * @param udi of the souvenir
     */
    public Souvenir(String name, float price, String dateEntrance, String udi) {
        super(name, price, dateEntrance, udi);
    }

    @Override
    public float maxPrice() {
        return getPrice()*0.4f;
    }

    @Override
    public int quantity() {
        return 0;
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
