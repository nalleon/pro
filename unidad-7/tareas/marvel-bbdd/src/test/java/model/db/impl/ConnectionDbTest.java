package model.db.impl;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.impl.ConnectionDb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConnectionDbTest {
    ConnectionDb connectionDb;
    String url = "src/main/resources/marvel.db";

    @BeforeEach
    public void beforeEach() throws MyException {
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
