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

    String MESSAGE_ERROR = "EXPECTED RESULT NOT FOUND";

    User user;

    @BeforeEach
    public void beforeEach() throws UserException {
        operationsDb = new OperationsDb(urlDb);
        user = new User("11", "name", 20, "miCiudad");
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
        try {
            int numUsers= operationsDb.obtainUsers().size();

            operationsDb.addUser(user);
            User userObtained = operationsDb.obtainUser(user);

            Assertions.assertEquals(user, userObtained, MESSAGE_ERROR);
            Assertions.assertEquals(11, numUsers+1, MESSAGE_ERROR);

            operationsDb.removeUser(user);
            int numUsersFinal = operationsDb.obtainUsers().size();
            Assertions.assertEquals(numUsers, numUsersFinal, MESSAGE_ERROR);

        } catch (UserException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void updateUserTest(){
        String nameUpdate = "Pepe Juan";
        int ageUpdate=32;
        String cityUpdate="Iserlohn Fortress";

        try {
            operationsDb.addUser(user);
            user.setName(nameUpdate);
            user.setAge(ageUpdate);
            user.setCity(cityUpdate);
            operationsDb.updateUser(user);
            User userFound = operationsDb.obtainUser(user);

            Assertions.assertEquals(user.getId(), userFound.getId(), MESSAGE_ERROR);
            Assertions.assertEquals(user.getName(), userFound.getName(), MESSAGE_ERROR);
            Assertions.assertEquals(user.getAge(), userFound.getAge(), MESSAGE_ERROR);
            Assertions.assertEquals(user.getCity(), userFound.getCity(), MESSAGE_ERROR);

            operationsDb.removeUser(userFound);
        } catch (Exception e) {
            Assertions.fail(MESSAGE_ERROR+": "+e.getMessage());
        }
    }
}
