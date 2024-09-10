package es.ies.puerto.enmunerate;

import es.ies.puerto.enumerate.EnumRainbowColor;
import es.ies.puerto.utilities.Utilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnumRainbowColorTest extends Utilities {
    EnumRainbowColor enumRainbowColor;
    @BeforeEach
    public void beforeEach(){
    }

    @Test
    public void rainbowColorRedTest(){
        enumRainbowColor = EnumRainbowColor.RED;
        Assertions.assertEquals(EnumRainbowColor.RED, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.RED.equals(enumRainbowColor), ERROR_MESSAGE);

    }
    @Test
    public void rainbowColorOrangeTest(){
        enumRainbowColor = EnumRainbowColor.ORANGE;
        Assertions.assertEquals(EnumRainbowColor.ORANGE, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.ORANGE.equals(enumRainbowColor), ERROR_MESSAGE);
    }
    @Test
    public void rainbowColorYellowTest(){
        enumRainbowColor = EnumRainbowColor.YELLOW;
        Assertions.assertEquals(EnumRainbowColor.YELLOW, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.YELLOW.equals(enumRainbowColor), ERROR_MESSAGE);
    }
    @Test
    public void rainbowColorGreenTest(){
        enumRainbowColor = EnumRainbowColor.GREEN;
        Assertions.assertEquals(EnumRainbowColor.GREEN, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.GREEN.equals(enumRainbowColor), ERROR_MESSAGE);
    }
    @Test
    public void rainbowColorBlueTest(){
        enumRainbowColor = EnumRainbowColor.BLUE;
        Assertions.assertEquals(EnumRainbowColor.BLUE, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.BLUE.equals(enumRainbowColor), ERROR_MESSAGE);
    }
    @Test
    public void rainbowColorIndigoTest(){
        enumRainbowColor = EnumRainbowColor.INDIGO;
        Assertions.assertEquals(EnumRainbowColor.INDIGO, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.INDIGO.equals(enumRainbowColor), ERROR_MESSAGE);
    }
    @Test
    public void rainbowColorPurpleTest(){
        enumRainbowColor = EnumRainbowColor.PURPLE;
        Assertions.assertEquals(EnumRainbowColor.PURPLE, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.PURPLE.equals(enumRainbowColor), ERROR_MESSAGE);
    }

    @Test
    public void rainbowColorMyColorTest(){
        enumRainbowColor = enumRainbowColor.valueOf("PURPLE");
        Assertions.assertEquals(EnumRainbowColor.PURPLE, enumRainbowColor, ERROR_MESSAGE);
        Assertions.assertTrue(EnumRainbowColor.PURPLE.equals(enumRainbowColor), ERROR_MESSAGE);
    }
}
