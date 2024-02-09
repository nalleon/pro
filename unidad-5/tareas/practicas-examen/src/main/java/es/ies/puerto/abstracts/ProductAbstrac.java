package es.ies.puerto.abstracts;

import es.ies.puerto.interfaces.IProduct;

import java.util.Objects;

public abstract class ProductAbstrac implements IProduct {
    private String name;
    private float price;
    private String dateOfEntrance;
    private String udi;

    /**
     * Constructors of the class
     */
    public  ProductAbstrac (){}
    public ProductAbstrac (String udi){
        this.udi = udi;
    }

    public ProductAbstrac(String name, String udi) {
        this.name = name;
        this.udi = udi;
    }

    public ProductAbstrac(String name, float price, String udi) {
        this.name = name;
        this.price = price;
        this.udi = udi;
    }

    public ProductAbstrac(String name, float price, String dateOfEntrance, String udi) {
        this.name = name;
        this.price = price;
        this.dateOfEntrance = dateOfEntrance;
        this.udi = udi;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDateOfEntrance() {
        return dateOfEntrance;
    }

    public void setDateOfEntrance(String dateOfEntrance) {
        this.dateOfEntrance = dateOfEntrance;
    }

    public String getUdi() {
        return udi;
    }

    public void setUdi(String udi) {
        this.udi = udi;
    }
    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "ProductAbstrac{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfEntrance='" + dateOfEntrance + '\'' +
                ", udi='" + udi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAbstrac that = (ProductAbstrac) o;
        return Objects.equals(udi, that.udi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(udi);
    }
}
