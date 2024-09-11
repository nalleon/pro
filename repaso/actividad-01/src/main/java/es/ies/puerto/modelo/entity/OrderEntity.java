package es.ies.puerto.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderEntity implements Serializable {
    /**
     * Properties
     */
    private int id;
    private int customerId;
    private String product;
    private int quantity;

    /**
     * Default constructor of the class
     */
    public OrderEntity() {
    }

    /**
     * Constructor of the class with the primary key
     * @param id of the order
     */

    public OrderEntity(int id) {
        this.id = id;
    }

    /**
     * Full constructor of the class
     * @param id of the order
     * @param customerId of the order
     * @param product of the order
     * @param quantity of the order
     */

    public OrderEntity(int id, int customerId, String product, int quantity) {
        this.id = id;
        this.customerId = customerId;
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Getters and setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
