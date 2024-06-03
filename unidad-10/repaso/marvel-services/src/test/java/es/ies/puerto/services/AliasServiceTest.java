package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.services.cxf.AliasService;
import es.ies.puerto.services.interfaces.ICrudAlias;
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

public class AliasServiceTest  extends TestUtilities {
    ICrudAlias marvelService;

    @Mock
    DaoAlias daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        marvelService = new AliasService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllAlias()).thenReturn(new HashSet<>());
        Response respuesta = marvelService.getAll();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(new Alias());
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(null);
        Response respuesta = marvelService.getObjectById("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = marvelService.addObject(new AliasDTO(), "1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = marvelService.addObject(new AliasDTO(), "1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = marvelService.deleteObjectById("idTest", "1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = marvelService.deleteObjectById("idTest", "1");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(STATUS_404,respuesta.getStatus(), MESSAGE_ERROR);
    }
}
