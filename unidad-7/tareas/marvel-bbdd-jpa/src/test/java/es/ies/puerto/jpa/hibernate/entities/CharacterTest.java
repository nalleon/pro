package es.ies.puerto.jpa.hibernate.entities;

import es.ies.puerto.model.impl.Character;
import org.junit.jupiter.api.*;
import utilities.Utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CharacterTest extends Utilities {
    static EntityManagerFactory emf;
    EntityManager em;

    Character character;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
    }

    @BeforeEach
    public void initEntityManager() {
        em = emf.createEntityManager();
        character = new Character();
        character.setName("personTest");
        try {
            // Persist in database
            em.getTransaction().begin();
            em.persist(character);
            em.getTransaction().commit();
        } catch (Throwable e) {
            Assertions.fail("Se ha producido un error:"+e.getMessage());
        }
    }

    @Test
    public void testPersistFind() {
        try {
            Character characterDB = em.find(Character.class, character.getCharacterId());
            Assertions.assertEquals(character.getName(), characterDB.getName());
        } catch (Throwable e) {
            Assertions.fail("Se ha producido un error:"+e.getMessage());
        }
    }

    @Test
    public void testUpdate() {
        try {
            Character characterFind = em.find(Character.class, character.getCharacterId()); // See file import.sql
            characterFind.setGender("Male");

            // Persist in database
            em.getTransaction().begin();
            em.merge(characterFind);
            em.getTransaction().commit();

            // Find by id
            Character characterDBUpdate = em.find(Character.class, character.getCharacterId());
            Assertions.assertEquals(characterFind.getGender(), characterDBUpdate.getGender());
        } catch (Throwable e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @AfterEach
    public void removePerson() {
        try {
            int personId = this.character.getCharacterId();
            Character character = em.find(Character.class, personId); // See file import.sql
            em.getTransaction().begin();
            em.remove(character);
            em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

            // Find by id
            Character characterDB = em.find(Character.class, personId); // See file import.sql

            Assertions.assertNull(characterDB);

        } catch (Throwable e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @AfterEach
    public void closeEntityManager() {
        em.close();
        em = null;
    }

    @AfterAll
    public static void closeEntityManagerFactory() {
        emf.close();
    }

}
