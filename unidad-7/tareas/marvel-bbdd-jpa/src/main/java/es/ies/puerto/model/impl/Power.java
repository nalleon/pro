package es.ies.puerto.model.impl;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Poderes")
public class Power implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int powerId;
    private String power;
    @ManyToMany(mappedBy = "poderes",cascade = CascadeType.ALL)
    private Set<Character> characters;

    /**
     * Default constructor of the class
     */
    public Power(){}

    /**
     * Constructor of the class
     * @param powerId identificator of a power
     */
    public Power(int powerId) {
        this.powerId = powerId;
    }

    /**
     * Constructor of the class
     * @param powerId identificator of a power
     * @param power name of a power
     */
    public Power(int powerId, String power) {
        this.powerId = powerId;
        this.power = power;
    }

    public Power(int powerId, String power, Set<Character> characters) {
        this.powerId = powerId;
        this.power = power;
        this.characters=characters;
    }

    /**
     * Getters and setters
     */
    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Power{" +
                "powerId=" + powerId +
                ", power='" + power + '\'' +
                '}';
    }
    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Power power = (Power) o;
        return powerId == power.powerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerId);
    }
}
