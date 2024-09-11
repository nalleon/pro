package es.ies.puerto.dto;
import java.util.Objects;

public class OrderDTO {
    /**
     * Properties
     */
    private int id;
    private String product;
    private int quantity;

    /**
     * Default constructor of the class
     */
    public OrderDTO() {
    }

    /**
     * Constructor of the class with the primary key
     * @param id of the order
     */

    public OrderDTO(int id) {
        this.id = id;
    }

    /**
     * Full constructor of the class
     * @param id of the order
     * @param product of the order
     * @param quantity of the order
     */

    public OrderDTO(int id, String product, int quantity) {
        this.id = id;
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
        return "OrderDTO{" +
                "id=" + id +
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
        OrderDTO that = (OrderDTO) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
