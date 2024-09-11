package es.ies.puerto.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

public class CustomerEntity implements Serializable {

    /**
     * Properties
     */
    private int id;
    private String name;
    private String email;

    /**
     * Default constructor of the class
     */

    public CustomerEntity() {
    }

    /**
     * Constructor with the primary key
     * @param id of the customer
     */
    public CustomerEntity(int id) {
        this.id = id;
    }

    /**
     * Full constructor of the class
     * @param id of the customer
     * @param name of the customer
     * @param email of the customer
     */
    public CustomerEntity(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * toString method
     */
    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
