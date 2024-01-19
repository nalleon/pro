package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet implements IConexionRed {

    private float connectionSpeed;

    public static void main(String[] args) {
        ConexionEthernet conexionEthernet;
        conexionEthernet = new ConexionEthernet(120);
        conexionEthernet.connect();
        conexionEthernet.showSpeed();
    }

    /**
     * Default constructor opf the class
     */
    public ConexionEthernet () {}

    /**
     * Constructor of the class
     * @param connectionSpeed of the connection
     */
    public ConexionEthernet(float connectionSpeed) {
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
    public String connect() {

        return "Connecting to Ethernet";
    }

    @Override
    public String showSpeed() {
        return "> Connection speed: " + connectionSpeed + "Mbps";
    }
    @Override
    public String toString() {
        return "Data provided: " + connectionSpeed + "Mbps";
    }
}
