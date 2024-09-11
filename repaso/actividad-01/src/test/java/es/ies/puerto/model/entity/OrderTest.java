package es.ies.puerto.model.entity;

import es.ies.puerto.modelo.entity.OrderEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest extends MapperHelper {
    OrderEntity entity;

    @BeforeEach
    public void beforeEach(){
        entity = new OrderEntity();
        entity.setId(ID);
        entity.setCustomerId(CUSTOMER_ID);
        entity.setProduct(PRODUCT);
        entity.setQuantity(QUANTITY);
    }

    @Test
    public void getSetTest(){
        Assertions.assertEquals(ID, entity.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(CUSTOMER_ID, entity.getCustomerId(), MESSAGE_ERROR);
        Assertions.assertEquals(PRODUCT, entity.getProduct(), MESSAGE_ERROR);
        Assertions.assertEquals(QUANTITY, entity.getQuantity(), MESSAGE_ERROR);
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(entity.toString().contains(String.valueOf(ID)), MESSAGE_ERROR);
        Assertions.assertTrue(entity.toString().contains(String.valueOf(CUSTOMER_ID)), MESSAGE_ERROR);
        Assertions.assertTrue(entity.toString().contains(PRODUCT), MESSAGE_ERROR);
        Assertions.assertTrue(entity.toString().contains(String.valueOf(QUANTITY)), MESSAGE_ERROR);
    }

    @Test
    public void equalsTest(){
        OrderEntity equals = new OrderEntity(ID);
        OrderEntity notEquals = new OrderEntity(2, CUSTOMER_ID, PRODUCT, QUANTITY);
        String str = "str";
        OrderEntity nullObject = null;

        Assertions.assertTrue(entity.equals(equals), MESSAGE_ERROR);
        Assertions.assertTrue(entity.equals(entity), MESSAGE_ERROR);
        Assertions.assertEquals(entity.hashCode(), equals.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(entity, equals, MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(nullObject), MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(notEquals), MESSAGE_ERROR);
        Assertions.assertFalse(entity.equals(str), MESSAGE_ERROR);
    }
}
