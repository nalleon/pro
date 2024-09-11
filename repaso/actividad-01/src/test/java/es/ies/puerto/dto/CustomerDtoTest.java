package es.ies.puerto.dto;

import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerDtoTest extends MapperHelper {
    CustomerDTO dto;

    @BeforeEach
    public void beforeEach(){
        dto = new CustomerDTO();
        dto.setId(CUSTOMER_ID);
        dto.setName(NAME);
        dto.setEmail(EMAIL);
    }

    @Test
    public void getSetTest(){
        Assertions.assertEquals(CUSTOMER_ID, dto.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(NAME, dto.getName(), MESSAGE_ERROR);
        Assertions.assertEquals(EMAIL, dto.getEmail(), MESSAGE_ERROR);
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(dto.toString().contains(String.valueOf(CUSTOMER_ID)), MESSAGE_ERROR);
        Assertions.assertTrue(dto.toString().contains(NAME), MESSAGE_ERROR);
        Assertions.assertTrue(dto.toString().contains(EMAIL), MESSAGE_ERROR);
    }

    @Test
    public void equalsTest(){
        CustomerDTO equals = new CustomerDTO(CUSTOMER_ID);
        CustomerDTO notEquals = new CustomerDTO(2, NAME, EMAIL);
        String str = "str";
        CustomerDTO nullObject = null;

        Assertions.assertTrue(dto.equals(equals), MESSAGE_ERROR);
        Assertions.assertTrue(dto.equals(dto), MESSAGE_ERROR);
        Assertions.assertEquals(dto.hashCode(), equals.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(dto, equals, MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(nullObject), MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(notEquals), MESSAGE_ERROR);
        Assertions.assertFalse(dto.equals(str), MESSAGE_ERROR);
    }

}
