package es.ies.puerto.dto;

import es.ies.puerto.model.entity.Customer;

import javax.persistence.*;
import java.util.Objects;

public class AddressDTO {
    private Long id;
    private String country;
    private String address;
    private String zipCode;
    private String island;

    public AddressDTO() {
    }

    public AddressDTO(Long id) {
        this.id = id;
    }

    public AddressDTO(Long id, String country, String address, String zipCode) {
        this.id = id;
        this.country = country;
        this.address = address;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIsland() {
        return island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO that = (AddressDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
