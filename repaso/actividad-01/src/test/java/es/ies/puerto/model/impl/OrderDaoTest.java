package es.ies.puerto.model.impl;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.modelo.impl.OrderDao;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;

public class OrderDaoTest extends MapperHelper {
    static OrderDao dao;
    OrderDTO orderDTO;
    CustomerDTO customerDTO;

    @BeforeAll
    public static void beforeAll(){
        try {
            dao = new OrderDao();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }
    @BeforeEach
    public void beforeEach(){
        try{
            customerDTO =  new CustomerDTO();
            customerDTO.setId(ID);
            customerDTO.setName(NAME);
            customerDTO.setEmail(EMAIL);
            orderDTO = new OrderDTO();
            orderDTO.setProduct(PRODUCT);
            orderDTO.setQuantity(QUANTITY);
            orderDTO.setId(ID);
            dao.addObject(orderDTO, customerDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<OrderDTO> list = dao.findAllObjects();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
            OrderDTO orderDTOFind = dao.findById(orderDTO.getId());
            Assertions.assertNotNull(orderDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(orderDTO, orderDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            OrderDTO orderDTOFind = dao.findById(orderDTO.getId());
            Assertions.assertNotNull(orderDTOFind);
            orderDTOFind.setProduct("productUpdate");
            orderDTOFind.setQuantity(12);

            dao.updateObject(orderDTOFind, customerDTO);

            OrderDTO orderDTOUpdated = dao.findById(orderDTOFind.getId());

            Assertions.assertNotNull(orderDTOUpdated);
            Assertions.assertEquals(orderDTOFind, orderDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(orderDTOFind.getQuantity(), orderDTOUpdated.getQuantity(), MESSAGE_ERROR);
            Assertions.assertEquals(orderDTOFind.getProduct(), orderDTOUpdated.getProduct(), MESSAGE_ERROR);

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        try{
            dao.removeObject(customerDTO.getId());
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
