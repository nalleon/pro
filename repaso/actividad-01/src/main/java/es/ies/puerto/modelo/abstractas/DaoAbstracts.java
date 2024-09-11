package es.ies.puerto.modelo.abstractas;

import es.ies.puerto.exception.ShopException;
import es.ies.puerto.modelo.ConnectionDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DaoAbstracts extends ConnectionDb {
    public DaoAbstracts() throws ShopException {
    }
    public boolean update(String query) throws ShopException {
        Statement statement = null;
        try {
            statement = getConnectionDb().createStatement();
            statement.executeUpdate(query);
            return true;
        } catch (SQLException exception) {
            return false;
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConnectionDb().isClosed()) {
                    getConnectionDb().close();
                }
            } catch (SQLException e) {
                throw new ShopException(e.getMessage(), e);
            }
        }
    }

    public void closeResources(ResultSet rs, Statement statement) throws SQLException, ShopException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }

        if (statement != null && !statement.isClosed()) {
            statement.close();
        }
        if (!getConnectionDb().isClosed()) {
            getConnectionDb().close();
        }
    }
}
