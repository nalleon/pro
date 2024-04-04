package es.ies.puerto.model.db;

import es.ies.puerto.exception.UserException;
import es.ies.puerto.model.db.impl.OperationsDb;
import es.ies.puerto.model.impl.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperationsDbTest {
    OperationsDb operationsDb;
    String urlDb = "src/main/resources/usuarios.db";

    String MESSAGE_ERROR = "Expected result not found";


    @BeforeEach
    public void beforeEach(){
        operationsDb = new OperationsDb(urlDb);
    }

    @Test
    public void obtainAllUsersTest(){
        try {
           Set<User> list = operationsDb.obtainUsers();
           Assertions.assertEquals(10, list.size(), MESSAGE_ERROR);
        } catch (UserException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtainUserTest(){
        User user = new User("5");
        try {
            user = operationsDb.obtainUser(user);
            Assertions.assertNotNull(user, MESSAGE_ERROR);
            Assertions.assertNotNull(user.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(user.getName(), MESSAGE_ERROR);
            Assertions.assertNotNull(user.getAge(), MESSAGE_ERROR);
            Assertions.assertNotNull(user.getCity(), MESSAGE_ERROR);

        } catch (UserException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void addRemoveUserTest(){
        User user = new User("11", "name", 20, "miCiudad");
        try {
           operationsDb.addUser(user);
            User userObtained = operationsDb.obtainUser(user);

            Assertions.assertEquals(user, userObtained, MESSAGE_ERROR);

        } catch (UserException e) {
            Assertions.fail(e.getMessage());
        }
    }
}
