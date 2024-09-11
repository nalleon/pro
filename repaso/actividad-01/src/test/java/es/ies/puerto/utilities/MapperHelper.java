package es.ies.puerto.utilities;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.modelo.entity.OrderEntity;
import org.junit.jupiter.api.BeforeEach;

public class MapperHelper extends TestUtilities {
    public static final int CUSTOMER_ID = 1;
    public static final String PRODUCT = "productTest";
    public static final int QUANTITY = 1234;
    public static final int ID = 1;
    public static final String EMAIL = "email@test";
    public static final String NAME = "nameTest";
    public OrderEntity orderEntity;
    public OrderDTO orderDTO;
    public CustomerEntity customerEntity;
    public CustomerDTO customerDTO;

    @BeforeEach
    public void beforeEach(){
        customerEntity = new CustomerEntity();
        customerEntity.setId(CUSTOMER_ID);
        customerEntity.setEmail(EMAIL);
        customerEntity.setName(NAME);

        customerDTO = new CustomerDTO();
        customerDTO.setId(CUSTOMER_ID);
        customerDTO.setEmail(EMAIL);
        customerDTO.setName(NAME);

        orderEntity = new OrderEntity();
        orderEntity.setCustomerId(CUSTOMER_ID);
        orderEntity.setProduct(PRODUCT);
        orderEntity.setQuantity(QUANTITY);
        orderEntity.setId(ID);

        orderDTO = new OrderDTO();
        orderDTO.setProduct(PRODUCT);
        orderDTO.setQuantity(QUANTITY);
        orderDTO.setId(ID);
    }
}
