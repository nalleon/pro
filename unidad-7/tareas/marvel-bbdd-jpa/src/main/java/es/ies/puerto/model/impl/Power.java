package es.ies.puerto.model.impl;

import java.util.Objects;

public class Power {
    private int powerId;
    private String power;

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
