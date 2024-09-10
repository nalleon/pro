package es.ies.puerto.dao.bd;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.modelo.impl.PedidoDAO;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;

public class PedidoDaoTest extends MapperHelper {
    static PedidoDAO pedidoDAO;
    PedidoDTO pedidoDTO;
    ClienteDTO clienteDTO;

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
            clienteDTO =  new ClienteDTO();
            clienteDTO.setId(ID);
            clienteDTO.setNombre(NOMBRE);
            clienteDTO.setEmail(EMAIL);
            pedidoDTO = new PedidoDTO();
            pedidoDTO.setProducto(PRODUCTO);
            pedidoDTO.setCantidad(CANTIDAD);
            pedidoDTO.setId(ID);
            pedidoDAO.add(pedidoDTO, clienteDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<PedidoDTO> list = pedidoDAO.findAll();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
            PedidoDTO pedidoDTOFind = pedidoDAO.findById(pedidoDTO.getId());
            Assertions.assertNotNull(pedidoDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(pedidoDTO, pedidoDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            PedidoDTO pedidoDTOFind = pedidoDAO.findById(pedidoDTO.getId());
            Assertions.assertNotNull(pedidoDTOFind);
            pedidoDTOFind.setProducto("productoUpdate");
            pedidoDTOFind.setCantidad(12);

            pedidoDAO.update(pedidoDTOFind, clienteDTO);

            PedidoDTO pedidoDTOUpdated = pedidoDAO.findById(pedidoDTOFind.getId());

            Assertions.assertNotNull(pedidoDTOUpdated);
            Assertions.assertEquals(pedidoDTOFind, pedidoDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(pedidoDTOFind.getCantidad(), pedidoDTOUpdated.getCantidad(), MESSAGE_ERROR);
            Assertions.assertEquals(pedidoDTOFind.getProducto(), pedidoDTOUpdated.getProducto(), MESSAGE_ERROR);

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        try{
            pedidoDAO.delete(clienteDTO.getId());
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
