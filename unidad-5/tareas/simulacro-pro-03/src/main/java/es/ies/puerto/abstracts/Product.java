package es.ies.puerto.abstracts;

import es.ies.puerto.interfaces.IProduct;

import java.util.Objects;

public abstract class Product implements IProduct {
    private String name;
    private float price;
    private String dateEntrance;
    private String udi;

    /**
     * Default constructor of the class
     */
    public Product (){}

    /**
     * Constructor of the class
     * @param udi of the product
     */
    public Product(String udi) {
        this.udi = udi;
    }

    /**
     * Constructor of the class
     * @param name of the product
     * @param price of the product
     * @param dateEntrance of the product
     * @param udi of the product
     */
    public Product(String name, float price, String dateEntrance, String udi) {
        this.name = name;
        this.price = price;
        this.dateEntrance = dateEntrance;
        this.udi = udi;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Product setPrice(float price) {
        this.price = price;
        return this;
    }

    public String getDateEntrance() {
        return dateEntrance;
    }

    public Product setDateEntrance(String dateEntrance) {
        this.dateEntrance = dateEntrance;
        return this;
    }

    public String getUdi() {
        return udi;
    }

    public Product setUdi(String udi) {
        this.udi = udi;
        return this;
    }
    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateEntrance='" + dateEntrance + '\'' +
                ", udi='" + udi + '\'' +
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
        return Objects.equals(udi, product.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }
}
