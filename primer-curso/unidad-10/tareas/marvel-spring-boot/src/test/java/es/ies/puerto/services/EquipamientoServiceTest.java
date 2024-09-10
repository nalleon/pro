package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class EquipamientoServiceTest  extends TestUtilities {
   // ICrudEquipamiento marvelService;

    @Mock
    DaoEquipamiento daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
     //   marvelService = new EquipamientoService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllEquipamiento()).thenReturn(new HashSet<>());
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(new Equipamiento());
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findEquipamiento(any(Equipamiento.class))).thenReturn(null);
    }

    @Test
    void saveOkTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(true);
    }

    @Test
    void saveDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateEquipamiento(any(Equipamiento.class))).thenReturn(false);

    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(true);

    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteEquipamiento(any(Equipamiento.class))).thenReturn(false);

    }

}
