package es.ies.puerto.model.db.abstracts;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.impl.ConnectionDb;
import es.ies.puerto.model.impl.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperationsDbAbstracts extends ConnectionDb {

    public OperationsDbAbstracts() throws MyException {
        super();
    }

    public OperationsDbAbstracts(String url) throws MyException {
        super(url);
    }

    public void update(String query) throws MyException {
        Statement statement = null;
        try{
            statement = getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception){
            throw new MyException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()){
                    statement.close();
                }
                if (!getConnection().isClosed()){
                    getConnection().close();
                }
            } catch (SQLException e) {
                throw new MyException(e.getMessage(), e);
            }
        }
    }

}
