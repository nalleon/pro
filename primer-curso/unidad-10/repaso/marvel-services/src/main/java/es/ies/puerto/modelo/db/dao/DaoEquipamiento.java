package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.abstracts.DaoAbstract;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
@Repository
public class DaoEquipamiento extends DaoAbstract {


    public DaoEquipamiento() throws MarvelException {
        super();
    }

    public Set<Equipamiento> findAllEquipamiento() throws MarvelException {
        String query;
        query  = "select p.id, p.nombre, p.descripcion, p.personaje_id from Equipamiento as p";
        return obtener(query);
    }

    public Equipamiento findEquipamiento(Equipamiento Equipamiento) throws MarvelException {
        String query = "select p.id, p.nombre, p.descripcion, p.personaje_id from Equipamiento as p" +
                " where p.id='"+Equipamiento.getId()+"'";
        Set<Equipamiento> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public boolean updateEquipamiento(Equipamiento Equipamiento) throws MarvelException {

        String query = "INSERT INTO Equipamiento as p (id,nombre)" +
                " VALUES ('"+Equipamiento.getId()+"','"
                + Equipamiento.getNombre()+"')";
        Equipamiento findEquipamiento = findEquipamiento(Equipamiento);
        if (findEquipamiento!= null) {
            query = "update Equipamiento set nombre='"+Equipamiento.getNombre()+"' " +
                    "where id='"+Equipamiento.getId()+"'";
        }

        //Si existe actualiza
        //Si NO existe inserta
        return actualizar(query);
    }

    public boolean deleteEquipamiento(Equipamiento Equipamiento) throws MarvelException {
        String query = "delete FROM Equipamiento as p" +
                " where p.id='"+Equipamiento.getId()+"'";
        return actualizar(query);
    }

    private Set<Equipamiento> obtener(String query) throws MarvelException {
        Set<Equipamiento> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String idPersonaje = rs.getString("personaje_id");

                Equipamiento Equipamiento = new Equipamiento(id, nombre,descripcion,idPersonaje);
                lista.add(Equipamiento);
            }
        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
                closeResources(rs,statement);
            } catch (SQLException e) {
                throw new MarvelException(e.getMessage(), e);
            }
        }
        return lista;
    }

}
