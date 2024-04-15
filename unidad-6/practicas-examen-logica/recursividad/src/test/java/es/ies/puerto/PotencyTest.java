package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PotencyTest extends Utilities {

    Potency potency;

    @BeforeEach
    public void beforeEach(){
        potency = new Potency();
    }
    @Test
    public void potencyTradTestOK(){
        Assertions.assertEquals(27, potency.potencyTrad(3, 3), MESSAGE_ERROR);
    }

    @Test
    public void potencyRecursiveTestOK(){
        Assertions.assertEquals(27, potency.potencyRecursive(3, 3), MESSAGE_ERROR);
    }
}
