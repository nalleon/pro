package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchElementArrayTest extends Utilities {
    SearchElementArray searchElementArray;
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));


    @BeforeEach
    public void beforeEach(){
        searchElementArray = new SearchElementArray();
    }

    @Test
    public void searchElementTestOk(){
        Assertions.assertEquals(2, searchElementArray.searchElementPosTrad(list, 3), MESSAGE_ERROR);
        Assertions.assertEquals(2, searchElementArray.searchElementPosRecursive(list, 0,3),
                MESSAGE_ERROR);

    }

}
