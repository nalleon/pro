package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PersonajeServiceTest extends TestUtilities {
 //   ICrudPersonaje marvelService;

    @Mock
    DaoPersonaje daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
   //     marvelService = new PersonajeService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllPersonaje()).thenReturn(new HashSet<>());

    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());

    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(null);

    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(true);

    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(false);

    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(true);

    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(false);

    }

}
