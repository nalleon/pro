package es.ies.puerto.enumerate;

public enum EnumVehicleType {
    CAR(1),
    MOTORBIKE(2),
    TRUCK(3),
    BIKE(4);

    int type;

    /**
     * Default constructor of the enum
     */
    EnumVehicleType() {
    }

    /**
     * Constructor of the enum
     * @param type of the vehicle
     */

    EnumVehicleType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
