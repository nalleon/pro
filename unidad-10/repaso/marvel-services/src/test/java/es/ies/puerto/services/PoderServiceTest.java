package es.ies.puerto.services;

import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.cxf.PoderService;
import es.ies.puerto.services.interfaces.ICrudPoder;

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

public class PoderServiceTest extends TestUtilities {
    ICrudPoder marvelService;

    @Mock
    DaoPoder daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        marvelService = new PoderService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllPoder()).thenReturn(new HashSet<>());
        Response respuesta = marvelService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(new Poder());
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(null);
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = marvelService.addObject(new PoderDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = marvelService.addObject(new PoderDTO());
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(true);
        Response respuesta = marvelService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(false);
        Response respuesta = marvelService.deleteObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }
}
