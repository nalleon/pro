package es.ies.puerto.dao.bd;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Set;

public class ClienteDaoTest extends MapperHelper {
    static ClienteDAO clienteDAO;
    ClienteDTO clienteDTO;

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
            clienteDTO =  new ClienteDTO();
            clienteDTO.setId(ID);
            clienteDTO.setNombre(NOMBRE);
            clienteDTO.setEmail(EMAIL);
            clienteDAO.add(clienteDTO);
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void findAllTest() {
        try {
            List<ClienteDTO> list = clienteDAO.findAll();
            Assertions.assertNotNull(list, MESSAGE_ERROR);
            Assertions.assertTrue(list.size()>0);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @Test
    public void findOneTest() {
        try {
           ClienteDTO clienteDTOFind = clienteDAO.findById(clienteDTO.getId());
            Assertions.assertNotNull(clienteDTOFind, MESSAGE_ERROR);
            Assertions.assertEquals(clienteDTO, clienteDTOFind, MESSAGE_ERROR);
        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateTest() {
        try {
            ClienteDTO clienteDTOFind = clienteDAO.findById(clienteDTO.getId());
            Assertions.assertNotNull(clienteDTOFind);
            clienteDTOFind.setNombre("nombreUpdate");
            clienteDTOFind.setEmail("email@update");
            clienteDAO.update(clienteDTOFind);

            ClienteDTO clienteDTOUpdated = clienteDAO.findById(clienteDTOFind.getId());

            Assertions.assertNotNull(clienteDTOUpdated);
            Assertions.assertEquals(clienteDTOFind, clienteDTOUpdated, MESSAGE_ERROR);
            Assertions.assertEquals(clienteDTOFind.getNombre(), clienteDTOUpdated.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(clienteDTOFind.getEmail(), clienteDTOUpdated.getEmail(), MESSAGE_ERROR);

        }catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        try{
            clienteDAO.delete(clienteDTO.getId());
        } catch (Exception e){
            Assertions.fail(e.getMessage());
        }
    }
}
