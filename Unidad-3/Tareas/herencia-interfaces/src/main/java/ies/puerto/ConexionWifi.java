package ies.puerto;

import ies.puerto.interfaz.IConexionRed;

public class ConexionWifi implements IConexionRed {
    private float connectionSpeed;

    /**
     * Default constructor of the class
     */
    public ConexionWifi () {}
    /**
     * Constructor of the class
     * @param connectionSpeed of the Wi-Fi
     */
    public ConexionWifi(float connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }

    /**
     * Getters and setters
     */
    public float getConnectionSpeed() {
        return connectionSpeed;
    }

    public void setConnectionSpeed(float connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to Wifi");
    }

    @Override
    public void showSpeed() {
        System.out.println("> Connection speed: " + connectionSpeed + "Mbps");
    }
    @Override
    public String toString() {
        return "Data provided: " + connectionSpeed + "Mbps";
    }
}
