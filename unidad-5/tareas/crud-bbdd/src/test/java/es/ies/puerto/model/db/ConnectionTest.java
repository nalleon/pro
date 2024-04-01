package es.ies.puerto.model.db;

import es.ies.puerto.exception.UserException;
import es.ies.puerto.model.db.impl.ConnectionDb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConnectionTest {

    ConnectionDb connectionDb;
    String url = "src/main/resources/usuarios.db";

    @BeforeEach
    public void beforeEach(){
        connectionDb = new ConnectionDb(url);
    }

    @Test
    public void connectDb(){
        try {
          connectionDb.getConnection();
        } catch (Exception exception){
            Assertions.fail(exception.getMessage());
        }
    }
}
