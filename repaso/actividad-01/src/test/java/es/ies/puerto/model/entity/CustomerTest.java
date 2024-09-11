package es.ies.puerto.model.entity;

import com.sun.xml.bind.v2.model.core.ID;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.MediaSize;

public class CustomerTest extends MapperHelper {
    CustomerEntity entity;
    
    @BeforeEach
    public void beforeEach(){
        entity = new CustomerEntity();
        entity.setId(CUSTOMER_ID);
        entity.setName(NAME);
        entity.setEmail(EMAIL);
    }
    
    @Test
    public void getSetTest(){
        Assertions.assertEquals(CUSTOMER_ID, entity.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(NAME, entity.getName(), MESSAGE_ERROR);
        Assertions.assertEquals(EMAIL, entity.getEmail(), MESSAGE_ERROR);
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(entity.toString().contains(String.valueOf(CUSTOMER_ID)), MESSAGE_ERROR);
        Assertions.assertTrue(entity.toString().contains(NAME), MESSAGE_ERROR);
        Assertions.assertTrue(entity.toString().contains(EMAIL), MESSAGE_ERROR);
    }

    @Test
    public void equalsTest(){
        CustomerEntity equals = new CustomerEntity(CUSTOMER_ID);
        CustomerEntity notEquals = new CustomerEntity(2, NAME, EMAIL);
        String str = "str";
        CustomerEntity nullObject = null;

        Assertions.assertTrue(entity.equals(equals), MESSAGE_ERROR);
        Assertions.assertTrue(entity.equals(entity), MESSAGE_ERROR);
        Assertions.assertEquals(entity.hashCode(), equals.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(entity, equals, MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(nullObject), MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(notEquals), MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(str), MESSAGE_ERROR);
    }
}
