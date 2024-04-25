package es.ies.puerto.model.db.jpa.hibernate.entities;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.impl.OperationsDb;
import es.ies.puerto.model.db.jpa.hibernate.impl.OperationsHibernate;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.HeroCharacter;
import es.ies.puerto.model.impl.Power;
import org.junit.jupiter.api.*;
import utilities.Utilities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class OperationsHibernateTest extends Utilities {
    static EntityManagerFactory emf;
    static OperationsHibernate operationsHibernate;
    HeroCharacter heroCharacter;
    int id = 3;
    String name = "nameTesting";
    Alias alias= new Alias(3, new HeroCharacter(3), "aliasTest");;
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(10, "powerTesting1");
    Power power2 = new Power(11, "powerTesting2");

    OperationsDb operationsDb;
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
        heroCharacter = new HeroCharacter(id,name,gender,alias,powers);
        operationsHibernate.addCharacter(heroCharacter);
    }

    @Test
    public void testPersistFindUpdateRemove() {
        //Assertions.assertNotNull(operationsHibernate.obtainCharacters(), MESSAGE_ERROR);

        HeroCharacter heroCharacterDB = operationsHibernate.obtainCharacter(heroCharacter);
        Assertions.assertEquals(heroCharacter.getName(), heroCharacterDB.getName(), MESSAGE_ERROR);

        heroCharacter.setName("nameTest");

        operationsHibernate.updateCharacter(heroCharacter);
        HeroCharacter heroCharacterDBUpdate = operationsHibernate.obtainCharacter(heroCharacter);
        Assertions.assertEquals(heroCharacter.getName(), heroCharacterDBUpdate.getName(), MESSAGE_ERROR);


        operationsHibernate.removeCharacter(heroCharacter);
        Assertions.assertNull(operationsHibernate.obtainCharacter(heroCharacter), MESSAGE_ERROR);
    }

    @AfterEach
    public void afterEach() throws MyException {
        operationsDb = new OperationsDb();
        operationsDb.update(dropTablesQry);
        operationsDb.update(scriptBBDD);
    }

    @AfterAll
    public static void afterAll() {
        emf.close();
    }
}
