package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalkThroughArrayTest extends Utilities {

    WalkThroughArray walkThroughArray;
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    String resultOK = "[1, 2, 3, 4, 5]";
    @BeforeEach
    public void beforeEach(){
        walkThroughArray = new WalkThroughArray();
    }

    @Test
    public void walkThroughArray(){
        Assertions.assertEquals(resultOK, walkThroughArray.walkThroughArray(list, 0).toString(), MESSAGE_ERROR);
    }


}
