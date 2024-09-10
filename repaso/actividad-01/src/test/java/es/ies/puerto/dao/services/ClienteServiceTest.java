package es.ies.puerto.dao.services;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.services.ClienteService;
import es.ies.puerto.services.interfaces.IClienteService;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ClienteServiceTest extends TestUtilities {

    IClienteService service;

    @Mock
    ClienteDAO clienteDAOMock;

    @BeforeEach
    public void init() throws TiendaException {
        MockitoAnnotations.openMocks(this);
        service = new ClienteService();
        service = new ClienteService(clienteDAOMock);
    }

    @Test
    void getAllTest() throws SQLException, TiendaException {
        when(clienteDAOMock.findAll()).thenReturn(new ArrayList<>());
        Response respuesta = service.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws SQLException, TiendaException {
        when(clienteDAOMock.findById(any(Integer.TYPE))).thenReturn(new ClienteDTO());
        Response respuesta = service.getObjectById("1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws SQLException, TiendaException  {
        when(clienteDAOMock.findById(any(Integer.TYPE))).thenReturn(null);
        Response respuesta = service.getObjectById("30");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void addOkTest() throws SQLException, TiendaException  {
        when(clienteDAOMock.add(any(ClienteDTO.class))).thenReturn(true);
        Response respuesta = service.addObject(new ClienteDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void addDuplicateTest()throws SQLException, TiendaException {
        when(clienteDAOMock.add(any(ClienteDTO.class))).thenReturn(false);
        Response respuesta = service.addObject(new ClienteDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }


    @Test
    void updateOkTest() throws SQLException, TiendaException  {
        when(clienteDAOMock.update(any(ClienteDTO.class))).thenReturn(true);
        Response respuesta = service.updateObject(new ClienteDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void updateDuplicateTest()throws SQLException, TiendaException {
        when(clienteDAOMock.update(any(ClienteDTO.class))).thenReturn(false);
        Response respuesta = service.addObject(new ClienteDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws SQLException, TiendaException  {
        when(clienteDAOMock.delete(any(Integer.TYPE))).thenReturn(true);
        Response respuesta = service.deleteObjectById("1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws SQLException, TiendaException {
        when(clienteDAOMock.delete(any(Integer.TYPE))).thenReturn(false);
        Response respuesta = service.deleteObjectById("124");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }


}
