package es.ies.puerto.dto;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderDtoTest extends MapperHelper {
    OrderDTO dto;

    @BeforeEach
    public void beforeEach(){
        dto = new OrderDTO();
        dto.setId(ID);
        dto.setProduct(PRODUCT);
        dto.setQuantity(QUANTITY);
    }

    @Test
    public void getSetTest(){
        Assertions.assertEquals(ID, dto.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(PRODUCT, dto.getProduct(), MESSAGE_ERROR);
        Assertions.assertEquals(QUANTITY, dto.getQuantity(), MESSAGE_ERROR);
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(dto.toString().contains(String.valueOf(ID)), MESSAGE_ERROR);
        Assertions.assertTrue(dto.toString().contains(String.valueOf(CUSTOMER_ID)), MESSAGE_ERROR);
        Assertions.assertTrue(dto.toString().contains(PRODUCT), MESSAGE_ERROR);
        Assertions.assertTrue(dto.toString().contains(String.valueOf(QUANTITY)), MESSAGE_ERROR);
    }

    @Test
    public void equalsTest(){
        OrderDTO equals = new OrderDTO(ID);
        OrderDTO notEquals = new OrderDTO(2, PRODUCT, QUANTITY);
        String str = "str";
        OrderDTO nullObject = null;

        Assertions.assertTrue(dto.equals(equals), MESSAGE_ERROR);
        Assertions.assertTrue(dto.equals(dto), MESSAGE_ERROR);
        Assertions.assertEquals(dto.hashCode(), equals.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dto, equals, MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(nullObject), MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(notEquals), MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(str), MESSAGE_ERROR);
    }
}
