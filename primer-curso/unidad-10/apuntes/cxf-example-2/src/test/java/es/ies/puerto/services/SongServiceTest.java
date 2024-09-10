package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

public class SongServiceTest {
    public static final String ERRROR_MESSAGE = "EXPECTED RESULT NOT FOUND";
    public static final int STATUS_200 = 200;
    public static final int STATUS_404 = 404;
    public static final int STATUS_201 = 201;
    public static final int STATUS_304 = 304;
    public static final int STATUS_204 = 204;
    SongService songService;

    @Mock
    SongRepository songRepositoryMock;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        songService = new SongService();
        songService.setSongRepository(songRepositoryMock);
    }

    @Test
    void getAllTest(){
        Mockito.when(songRepositoryMock.getSongs()).thenReturn(new ArrayList<>());
        Response response = songService.getSongs();

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_200, response.getStatus(), ERRROR_MESSAGE);
    }
    @Test
    void getOneOKTest(){
        Mockito.when(songRepositoryMock.getSongById(anyString())).thenReturn(new Song());
        Response response = songService.getSongById("1");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_200, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void getOneNotFoundTest(){
        Mockito.when(songRepositoryMock.getSongById(anyString())).thenReturn(null);
        Response response = songService.getSongById("idTest");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_404, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void saveSongOKTest(){
        Mockito.when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(true);
        Response response = songService.addSong(new Song());

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_201, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void saveSongDuplicateTest(){
        Mockito.when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(false);
        Response response = songService.addSong(new Song("1"));

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_304, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void deleteSongOKTest(){
        Mockito.when(songRepositoryMock.deleteSongById(anyString())).thenReturn(true);
        Response response = songService.deleteSongById("1");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_204, response.getStatus(), ERRROR_MESSAGE);
    }

    @Test
    void deleteSongErrorTest(){
        Mockito.when(songRepositoryMock.deleteSongById(anyString())).thenReturn(false);
        Response response = songService.deleteSongById("idTest");

        Assertions.assertNotNull(response, ERRROR_MESSAGE);
        Assertions.assertEquals(STATUS_404, response.getStatus(), ERRROR_MESSAGE);
    }
}
