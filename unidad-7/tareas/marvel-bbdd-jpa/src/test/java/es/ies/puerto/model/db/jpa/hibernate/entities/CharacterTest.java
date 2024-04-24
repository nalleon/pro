package es.ies.puerto.model.db.jpa.hibernate.entities;

import es.ies.puerto.model.db.jpa.hibernate.impl.OperationsHibernate;
import es.ies.puerto.model.impl.Character;
import org.junit.jupiter.api.*;
import utilities.Utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CharacterTest extends Utilities {
    static EntityManagerFactory emf;
    static OperationsHibernate operationsHibernate;
    EntityManager em;
    static Character character;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operationsHibernate = new OperationsHibernate(emf);
        character = new Character();

    }
    /**
    @BeforeEach
    public void initEntityManager() {
        operationsHibernate = new OperationsHibernate(emf);
        em = operationsHibernate.getEm();
        character = new Character();
        operationsHibernate.addCharacter(character);
    }
**/
    @Test
    public void testPersistFind() {
        try {
            Character characterDB = operationsHibernate.obtainCharacter(character);
            Assertions.assertEquals(character.getName(), characterDB.getName());
        } catch (Throwable e) {
            Assertions.fail("Error at:"+e.getMessage());
        }
    }

    @Test
    public void testUpdate() {
        try {
            Character characterFind = operationsHibernate.obtainCharacter(character); // See file import.sql
            characterFind.setGender("Male");

            // Persist in database
            operationsHibernate.updateCharacter(characterFind);

            // Find by id
            Character characterDBUpdate = operationsHibernate.obtainCharacter(character);
            Assertions.assertEquals(characterFind.getGender(), characterDBUpdate.getGender());
        } catch (Throwable e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @AfterEach
    public void removePerson() {
        try {
            Character character = operationsHibernate.obtainCharacter(this.character); // See file import.sql
            operationsHibernate.removeCharacter(character);// TODO java.sql.SQLException: database is locked (sometimes)

            // Find by id
            Character characterDB = operationsHibernate.obtainCharacter(this.character); // See file import.sql

            Assertions.assertNull(characterDB);

        } catch (Throwable e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @AfterEach
    public void closeEntityManager() {
        operationsHibernate.closeEntityManager(em);
    }

    @AfterAll
    public static void closeEntityManagerFactory() {
        emf.close();
    }
}
