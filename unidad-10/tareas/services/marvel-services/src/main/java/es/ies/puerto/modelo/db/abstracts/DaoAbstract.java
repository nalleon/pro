package es.ies.puerto.modelo.db.abstracts;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoAbstract extends Conexion {
    public DaoAbstract() throws MarvelException {
        super();
    }

    public boolean actualizar(String query) throws MarvelException {
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
                throw new MarvelException(e.getMessage(), e);
            }
        }
    }

    public void closeResources(ResultSet rs, Statement statement) throws SQLException, MarvelException {
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
