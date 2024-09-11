package es.ies.puerto.model.impl;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.modelo.impl.CustomerDao;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;

public class CustomerDaoTest extends MapperHelper {
    static CustomerDao dao;
    CustomerDTO customerDTO;

    @BeforeAll
    public static void beforeAll(){
        try {
            dao = new CustomerDao();
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
            dao.addObject(customerDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<CustomerDTO> list = dao.findAllObjects();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
           CustomerDTO customerDTOFind = dao.findById(customerDTO.getId());
            Assertions.assertNotNull(customerDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(customerDTO, customerDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            CustomerDTO customerDTOFind = dao.findById(customerDTO.getId());
            Assertions.assertNotNull(customerDTOFind);
            customerDTOFind.setName("nombreUpdate");
            customerDTOFind.setEmail("email@update");
            dao.updateObject(customerDTOFind);

            CustomerDTO customerDTOUpdated = dao.findById(customerDTOFind.getId());

            Assertions.assertNotNull(customerDTOUpdated);
            Assertions.assertEquals(customerDTOFind, customerDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(customerDTOFind.getName(), customerDTOUpdated.getName(), MESSAGE_ERROR);
            Assertions.assertEquals(customerDTOFind.getEmail(), customerDTOUpdated.getEmail(), MESSAGE_ERROR);

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
