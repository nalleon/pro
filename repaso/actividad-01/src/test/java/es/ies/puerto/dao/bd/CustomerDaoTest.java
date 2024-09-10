package es.ies.puerto.dao.bd;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;

public class ClienteDaoTest extends MapperHelper {
    static ClienteDAO clienteDAO;
    CustomerDTO customerDTO;

    @BeforeAll
    public static void beforeAll(){
        try {
            clienteDAO = new ClienteDAO();
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
            clienteDAO.add(customerDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<CustomerDTO> list = clienteDAO.findAll();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
           CustomerDTO customerDTOFind = clienteDAO.findById(customerDTO.getId());
            Assertions.assertNotNull(customerDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(customerDTO, customerDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            CustomerDTO customerDTOFind = clienteDAO.findById(customerDTO.getId());
            Assertions.assertNotNull(customerDTOFind);
            customerDTOFind.setNombre("nombreUpdate");
            customerDTOFind.setEmail("email@update");
            clienteDAO.update(customerDTOFind);

            CustomerDTO customerDTOUpdated = clienteDAO.findById(customerDTOFind.getId());

            Assertions.assertNotNull(customerDTOUpdated);
            Assertions.assertEquals(customerDTOFind, customerDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(customerDTOFind.getNombre(), customerDTOUpdated.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(customerDTOFind.getEmail(), customerDTOUpdated.getEmail(), MESSAGE_ERROR);

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        try{
            clienteDAO.delete(customerDTO.getId());
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
