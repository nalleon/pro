package es.ies.puerto.model.db.jpa.hibernate.entities;

import es.ies.puerto.model.db.jpa.hibernate.impl.OperationsHibernate;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.Character;
import es.ies.puerto.model.impl.Power;
import org.junit.jupiter.api.*;
import utilities.Utilities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class CharacterTest extends Utilities {
    static EntityManagerFactory emf;
    static OperationsHibernate operationsHibernate;
    Character character;
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, 3, "aliasTest");
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(10, "powerTesting1");
    Power power2 = new Power(11, "powerTesting2");

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operationsHibernate = new OperationsHibernate(emf);

    }

    @BeforeEach
    public void initEntityManager() {
        powers = new HashSet<>();
        powers.add(power1);
        powers.add(power2);
        character = new Character(id,name,gender,alias,powers);
        operationsHibernate.addCharacter(character);
    }
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

}
