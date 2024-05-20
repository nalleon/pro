package es.ies.puerto;

import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WalkThroughAMatrixTest extends Utilities {
    WalkThroughAMatrix walkThroughAMatrix;
    String resultOK = "1 2 3 4 5 6 7 8 9 ";
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    @BeforeEach
    public void beforeEach(){
        walkThroughAMatrix = new WalkThroughAMatrix();
    }

    @Test
    public void walkThroughAMatrixTestOK(){
        Assertions.assertEquals(resultOK, walkThroughAMatrix.walkThroughAMatrixTrad(matrix), MESSAGE_ERROR);
    }
}
