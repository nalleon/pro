package es.ies.puerto.services;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.services.interfaces.ICrudEquipamiento;
import es.ies.puerto.services.interfaces.ICrudServices;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class EquipamientoServiceTest  extends TestUtilities {
    ICrudEquipamiento marvelService;

    @Mock
    DaoEquipamiento daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        marvelService = new EquipamientoService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllEquipamiento()).thenReturn(new HashSet<>());
        Response respuesta = marvelService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = marvelService.addObject(new EquipamientoDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = marvelService.addObject(new EquipamientoDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);
        Response respuesta = marvelService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);
        Response respuesta = marvelService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

}
