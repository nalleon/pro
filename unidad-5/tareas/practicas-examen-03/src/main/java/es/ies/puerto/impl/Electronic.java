package es.ies.puerto.impl;

import es.ies.puerto.abstracts.ProductAbstrac;

public class Electronic extends ProductAbstrac {
    public Electronic(String name, float price, String dateOfEntrance, String udi) {
        super(name, price, dateOfEntrance, udi);
    }

    @Override
    public float maxPrice() {
        return super.getPrice()*0.6f;
    }

    @Override
    public int availableQuantity() {
        return 0;
    }
    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Electronic{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", dateOfEntrance='" + getDateOfEntrance() + '\'' +
                ", udi='" + getUdi() + '\'' +
                '}';
    }
}
