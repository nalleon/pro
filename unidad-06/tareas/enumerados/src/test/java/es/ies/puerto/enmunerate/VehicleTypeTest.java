package es.ies.puerto.enmunerate;

import es.ies.puerto.enumerate.EnumVehicleType;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTypeTest extends Utilities {
    EnumVehicleType vehicleType;
    @Test
    public void vehicleCarTest(){
        vehicleType = EnumVehicleType.CAR;
        Assertions.assertEquals(1, vehicleType.getType(), ERROR_MESSAGE);
    }
    @Test
    public void vehicleMotorbikeTest(){
        vehicleType = EnumVehicleType.MOTORBIKE;
        Assertions.assertEquals(2, vehicleType.getType(), ERROR_MESSAGE);
    }
    @Test
    public void vehicleTruckTest(){
        vehicleType = EnumVehicleType.TRUCK;
        Assertions.assertEquals(3, vehicleType.getType(), ERROR_MESSAGE);
    }
    @Test
    public void vehicleBikeTest(){
        vehicleType = EnumVehicleType.BIKE;
        Assertions.assertEquals(4, vehicleType.getType(), ERROR_MESSAGE);
    }
}
