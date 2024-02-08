package es.ies.puerto.impl;

import es.ies.puerto.abstracts.Product;

import java.util.Objects;

public class Electronics extends Product {
    /**
     * Default constructor of the class
     */
    public Electronics (){}

    public Electronics (String udi){
        super(udi);
    }

    /**
     * Constructor of the class
     * @param name of the electronic product
     * @param price of the electronic product
     * @param dateEntrance of the electronic product
     * @param udi of the electronic product
     */
    public Electronics(String name, float price, String dateEntrance, String udi) {
        super(name, price, dateEntrance, udi);
    }

    @Override
    public float maxPrice() {
        return getPrice()*0.6f;
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
