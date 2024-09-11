package es.ies.puerto.services;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.exception.ShopException;
import es.ies.puerto.modelo.impl.CustomerDao;
import es.ies.puerto.services.CustomerService;
import es.ies.puerto.services.interfaces.ICustomerService;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CustomerServiceTest extends TestUtilities {

    ICustomerService service;

    @Mock
    CustomerDao daoMock;

    @BeforeEach
    public void init() throws ShopException {
        MockitoAnnotations.openMocks(this);
        service = new CustomerService();
        service = new CustomerService(daoMock);
    }

    @Test
    void getAllTest() throws SQLException, ShopException {
        when(daoMock.findAllObjects()).thenReturn(new ArrayList<>());
        Response response = service.getAll();
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_200,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws SQLException, ShopException {
        when(daoMock.findById(any(Integer.TYPE))).thenReturn(new CustomerDTO());
        Response response = service.getObjectById("1");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_200,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws SQLException, ShopException {
        when(daoMock.findById(any(Integer.TYPE))).thenReturn(null);
        Response response = service.getObjectById("30");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_404,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void addOkTest() throws SQLException, ShopException {
        when(daoMock.addObject(any(CustomerDTO.class))).thenReturn(true);
        Response response = service.addObject(new CustomerDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_201,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void addDuplicateTest()throws SQLException, ShopException {
        when(daoMock.addObject(any(CustomerDTO.class))).thenReturn(false);
        Response response = service.addObject(new CustomerDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_304,response.getStatus(), MESSAGE_ERROR);
    }


    @Test
    void updateOkTest() throws SQLException, ShopException {
        when(daoMock.updateObject(any(CustomerDTO.class))).thenReturn(true);
        Response response = service.updateObject(new CustomerDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_201,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void updateDuplicateTest()throws SQLException, ShopException {
        when(daoMock.updateObject(any(CustomerDTO.class))).thenReturn(false);
        Response response = service.addObject(new CustomerDTO());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_304,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws SQLException, ShopException {
        when(daoMock.removeObject(any(Integer.TYPE))).thenReturn(true);
        Response response = service.deleteObjectById("1");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_204,response.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws SQLException, ShopException {
        when(daoMock.removeObject(any(Integer.TYPE))).thenReturn(false);
        Response response = service.deleteObjectById("124");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(STATUS_404,response.getStatus(), MESSAGE_ERROR);
    }
    
}
