package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.services.interfaces.ICrudAlias;
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

    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(new Alias());

    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(null);
    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(true);

    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(false);

    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(true);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(false);

    }
}
