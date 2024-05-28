package es.ies.puerto.services;

import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.interfaces.ICrudPoder;
import es.ies.puerto.services.interfaces.ICrudServices;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
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

    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(new Poder());

    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPoder(any(Poder.class))).thenReturn(null);

    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(true);

    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePoder(any(Poder.class))).thenReturn(false);

    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(true);

    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePoder(any(Poder.class))).thenReturn(false);

    }
}
