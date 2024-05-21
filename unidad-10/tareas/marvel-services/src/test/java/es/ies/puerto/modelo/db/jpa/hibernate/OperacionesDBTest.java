package es.ies.puerto.modelo.db.jpa.hibernate;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.db.jpa.hibernate.impl.OperacionesDB;
import es.ies.puerto.utilities.UtilitiesTest;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class OperacionesDBTest extends UtilitiesTest {
    static OperacionesDB operacionesDB;
    static EntityManagerFactory emf;

    Personaje personaje;
    Equipamiento equipamiento;
    Alias alias;
    Poder poder;

    @BeforeAll
    public static void setUp(){
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operacionesDB = new OperacionesDB();
        operacionesDB = new OperacionesDB(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        poder = poderEntity;
        alias = aliasEntity;
        equipamiento = equipamientoEntity;
        personaje = personajeEntity;
        alias.setPersonaje(personaje);
        equipamiento.setPersonaje(personaje);
        poder.setPersonaje(new HashSet<>(Collections.singletonList(personaje)));
    }
    //@Test
    public void findGameTest() {
        try {
            Personaje personajeFind = operacionesDB.obtainEntity(personaje);
            Assertions.assertEquals(personaje.getNombre(), personajeFind.getNombre(), MESSAGE_ERROR);
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void findGamesTest() {
        List<Personaje> personajeList = operacionesDB.obtainAllEntities();
        Assertions.assertNotNull(personajeList, MESSAGE_ERROR);
    }
    //@Test
    public void updateTest() {
        try {
            Personaje personajeUpdate = personaje;

            personajeUpdate.setNombre("nameTestUpdate");
            personajeUpdate.setGenero("generoUpdaye");
            Equipamiento equipamientoUpdate = new Equipamiento("2", "nombreUpdate",
                    "descUpdate", PERSONAJE_ID);
            personajeUpdate.setEquipamientos(new HashSet<>(Collections.singletonList(equipamientoUpdate)));
            Alias aliasUpdate = new Alias("2", "nombreUpdate", PERSONAJE_ID);
            personajeUpdate.setAlias(aliasUpdate);

            Poder poderUpdate = new Poder("2", "nombreUpdate");

            personajeUpdate.setPoderes(new HashSet<>(Collections.singletonList(poderUpdate)));

            operacionesDB.updateEntity(personajeUpdate);
            personajeUpdate = operacionesDB.obtainEntity(personajeUpdate);
            Assertions.assertEquals(personaje.getId(), personajeUpdate.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeUpdate.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeUpdate.getGenero(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeUpdate.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeUpdate.getEquipamientos(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeUpdate.getPoderes(), MESSAGE_ERROR);

        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }


    @AfterEach
    public void afterEach(){
        operacionesDB.removeEntity(personaje);
    }
}
