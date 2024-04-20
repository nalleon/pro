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
    public OperationsDbAbstracts() {
        super();
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
                closeConnection();

            } catch (SQLException e) {
                throw new MyException(e.getMessage(), e);
            }
        }
    }
    public void closeResources(Statement statement, ResultSet rs) throws MyException {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }

            closeConnection();

            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (Exception e) {
            throw new MyException(e.getMessage(), e);
        }
    }
}
