package ies.puerto.abstrac;

public class ConexionesAbstract {
    private float connectionSpeed;

    public ConexionesAbstract () {}
    /**
     * Constructor of the class
     * @param connectionSpeed of the Wi-Fi
     */
    public ConexionesAbstract(float connectionSpeed) {
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


    public String connect() {
        return "Connecting to Wifi";
    }


    public String showSpeed() {
        return "> Connection speed: " + connectionSpeed + "Mbps";
    }
    @Override
    public String toString() {
        return "Data provided: " + connectionSpeed + "Mbps";
    }
}
