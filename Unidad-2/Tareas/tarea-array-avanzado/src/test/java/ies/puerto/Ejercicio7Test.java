package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();
    String [] names = {"nabil", "osama", "poleo", "hector", "idaira"};
    int [][] kms = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
    @Test
    public void kmPerDriverTestOK(){
        String result = ejercicio7.kmPerDriver(names, kms);
        String resultOK = "nabil:28\nosama:28\npoleo:28\nhector:28\nidaira:28\n";
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
}
