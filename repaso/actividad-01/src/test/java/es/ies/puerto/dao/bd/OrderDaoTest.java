package es.ies.puerto.dao.bd;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;

public class PedidoDaoTest extends MapperHelper {
    static PedidoDAO pedidoDAO;
    OrderDTO orderDTO;
    CustomerDTO customerDTO;

    @BeforeAll
    public static void beforeAll(){
        try {
            pedidoDAO = new PedidoDAO();
        }catch (Exception exception) {
            Assertions.fail("Se ha producido un error:"+exception.getMessage());
        }
    }
    @BeforeEach
    public void beforeEach(){
        try{
            customerDTO =  new CustomerDTO();
            customerDTO.setId(ID);
            customerDTO.setNombre(NAME);
            customerDTO.setEmail(EMAIL);
            orderDTO = new OrderDTO();
            orderDTO.setProducto(PRODUCT);
            orderDTO.setCantidad(QUANTITY);
            orderDTO.setId(ID);
            pedidoDAO.add(orderDTO, customerDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<OrderDTO> list = pedidoDAO.findAll();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
            OrderDTO orderDTOFind = pedidoDAO.findById(orderDTO.getId());
            Assertions.assertNotNull(orderDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(orderDTO, orderDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            OrderDTO orderDTOFind = pedidoDAO.findById(orderDTO.getId());
            Assertions.assertNotNull(orderDTOFind);
            orderDTOFind.setProducto("productoUpdate");
            orderDTOFind.setCantidad(12);

            pedidoDAO.update(orderDTOFind, customerDTO);

            OrderDTO orderDTOUpdated = pedidoDAO.findById(orderDTOFind.getId());

            Assertions.assertNotNull(orderDTOUpdated);
            Assertions.assertEquals(orderDTOFind, orderDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(orderDTOFind.getCantidad(), orderDTOUpdated.getCantidad(), MESSAGE_ERROR);
            Assertions.assertEquals(orderDTOFind.getProducto(), orderDTOUpdated.getProducto(), MESSAGE_ERROR);

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        try{
            pedidoDAO.delete(customerDTO.getId());
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
