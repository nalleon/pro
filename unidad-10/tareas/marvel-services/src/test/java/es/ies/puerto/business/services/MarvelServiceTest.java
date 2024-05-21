package es.ies.puerto.business.services;
import es.ies.puerto.business.repository.MarvelRepository;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

public class MarvelServiceTest {
    public static final String ERRROR_MESSAGE = "EXPECTED RESULT NOT FOUND";
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_201 = 201;
    public static final int STATUS_304 = 304;
    public static final int STATUS_204 = 204;
    MarvelService marvelService;

    @Mock
    MarvelRepository marvelRepository;

    @BeforeEach
    public void init() throws MarvelException {
        MockitoAnnotations.openMocks(this);
        marvelService = new MarvelService();
        marvelService.setMarvelRepository(marvelRepository);
    }

    @Test
    void getAllTest() throws MarvelException {
        Mockito.when(marvelRepository.getPersonajes()).thenReturn(new ArrayList<>());
        Response response = marvelService.getPersonajes();

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_200, response.getStatus(), ERRROR_MESSAGE);
    }
    @Test
    void getOneOKTest() throws MarvelException {
        Mockito.when(marvelRepository.getPersonajeById(anyString())).thenReturn(new Personaje());
        Response response = marvelService.getPersonajeById("1");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_200, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        Mockito.when(marvelRepository.getPersonajeById(anyString())).thenReturn(null);
        Response response = marvelService.getPersonajeById("idTest");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_404, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void saveSongOKTest() throws MarvelException {
        Mockito.when(marvelRepository.savePersonaje(any(Personaje.class))).thenReturn(true);
        Response response = marvelService.addPersonaje(new Personaje("paco"));

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_201, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        Mockito.when(marvelRepository.savePersonaje(any(Personaje.class))).thenReturn(false);
        Response response = marvelService.addPersonaje(new Personaje("1"));

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_304, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void deleteSongOKTest() throws MarvelException {
        Mockito.when(marvelRepository.deletePersonajeById(anyString())).thenReturn(true);
        Response response = marvelService.deletePersonajeById("1");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_204, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void deleteSongErrorTest() throws MarvelException {
        Mockito.when(marvelRepository.deletePersonajeById(anyString())).thenReturn(false);
        Response response = marvelService.deletePersonajeById("idTest");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_404, response.getStatus(), ERRROR_MESSAGE);
    }
}


