package es.ies.puerto.modelo.abstractas;

import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DaoAbstracts extends Conexion {
    public DaoAbstracts() throws TiendaException {
    }
    public boolean actualizar(String query) throws TiendaException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
            return true;
        } catch (SQLException exception) {
            return false;
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new TiendaException(e.getMessage(), e);
            }
        }
    }

    public void closeResources(ResultSet rs, Statement statement) throws SQLException, TiendaException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }

        if (statement != null && !statement.isClosed()) {
            statement.close();
        }
        if (!getConexion().isClosed()) {
            getConexion().close();
        }
    }
}
