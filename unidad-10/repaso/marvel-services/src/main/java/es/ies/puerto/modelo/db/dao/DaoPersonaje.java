package es.ies.puerto.modelo.db.dao;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.abstracts.DaoAbstract;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DaoPersonaje extends DaoAbstract {

    public DaoPersonaje() throws MarvelException {
        super();
    }
    private Set<Personaje> obtener(String query) throws MarvelException {
        Set<Personaje> personajes = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String personajeId = rs.getString("personajeId");
                String nombrePersonaje = rs.getString("nombrePersonaje");
                String aliasId = rs.getString("aliasId");
                String aliasStr = rs.getString("alias");
                String genero = rs.getString("genero");
                String poderId = rs.getString("poderId");
                String nombrePoder = rs.getString("nombrePoder");
                String equipId = rs.getString("equipId");
                String nombreEquip = rs.getString("nombreEquip");
                String descripcion = rs.getString("descripcion");
                Poder poder = new Poder(poderId, nombrePoder);
                Equipamiento equipamiento = new Equipamiento(equipId, nombreEquip, descripcion, personajeId);
                Alias alias = new Alias(aliasId, aliasStr, personajeId);
                Personaje personaje = new Personaje(personajeId, nombrePersonaje, genero, alias, new HashSet<>(),
                        new HashSet<>());
                personajes.add(personaje);
                for (Personaje elemento : personajes) {
                    if (personaje.equals(elemento)) {
                        elemento.getPoderes().add(poder);
                        elemento.getEquipamientos().add(equipamiento);
                    }
                }
            }

        } catch (SQLException exception) {
            throw new MarvelException(exception.getMessage(), exception);
        } finally {
            try {
              closeResources(rs, statement);
            } catch (SQLException exception) {
                throw new MarvelException(exception.getMessage(), exception);
            }
        }
        return personajes;
    }



    public Set<Personaje> findAllPersonaje() throws MarvelException {
        String query = "SELECT p.id AS personajeId, p.nombre AS nombrePersonaje, " +
                "a.id AS aliasId, a.alias, p.genero, po.id AS poderId, po.nombre AS nombrePoder, " +
                "eq.id AS equipId, eq.nombre AS nombreEquip, eq.descripcion " +
                "FROM Personaje AS p " +
                "LEFT JOIN Personaje_Poder AS pp ON p.id = pp.personaje_id " +
                "LEFT JOIN Poder AS po ON po.id = pp.poder_id " +
                "LEFT JOIN Alias AS a ON p.id = a.personaje_id " +
                "LEFT JOIN Equipamiento AS eq ON p.id = eq.personaje_id";
        return obtener(query);
    }

    public Personaje findPersonaje(String id) throws MarvelException {
        Personaje personaje = new Personaje(id);
        return findPersonaje(personaje);
    }

    public Personaje findPersonaje(Personaje personaje) throws MarvelException {
        String query = "SELECT p.id AS personajeId, p.nombre AS nombrePersonaje, " +
                "a.id AS aliasId, a.alias, p.genero, po.id AS poderId, po.nombre AS nombrePoder, " +
                "eq.id AS equipId, eq.nombre AS nombreEquip, eq.descripcion " +
                "FROM Personaje AS p " +
                "LEFT JOIN Personaje_Poder AS pp ON p.id = pp.personaje_id " +
                "LEFT JOIN Poder AS po ON po.id = pp.poder_id " +
                "LEFT JOIN Alias AS a ON p.id = a.personaje_id " +
                "LEFT JOIN Equipamiento AS eq ON p.id = eq.personaje_id " +
                "WHERE p.id = '" + personaje.getId() + "'";
        Set<Personaje> personajes = obtener(query);
        if(personajes.isEmpty()) {
            return null;
        }
        return personajes.iterator().next();
    }

    public boolean updatePersonaje(Personaje personaje) throws MarvelException {
        boolean encontrado = true;
        DaoAlias daoAlias = new DaoAlias();
        DaoPoder daoPoder = new DaoPoder();
        DaoEquipamiento daoEquipamiento = new DaoEquipamiento();
        String query = "UPDATE Personaje " +
                "SET nombre = '" + personaje.getNombre() + "', " +
                "genero = '" + personaje.getGenero() + "' " +
                "WHERE id = '" + personaje.getId() + "'; " +
                "DELETE FROM Personaje_Poder WHERE personaje_id = '" + personaje.getId() + "';";


        if (findPersonaje(personaje) == null) {
            encontrado = false;
            query = "INSERT INTO Personaje VALUES " +
                    "('" + personaje.getId() + "', " +
                    "'" + personaje.getNombre() + "', " +
                    "'" + personaje.getGenero() + "');";
        }
        daoAlias.updateAlias(personaje.getAlias());
        for (Poder poder : personaje.getPoderes()) {
            daoPoder.updatePoder(poder);
            query += "INSERT INTO Personaje_Poder VALUES " +
                    "('" + personaje.getId() + "', '" + poder.getId() + "');";
        }
        for (Equipamiento equipamiento : personaje.getEquipamientos()) {
            daoEquipamiento.updateEquipamiento(equipamiento);
        }
        actualizar(query);
        return encontrado;
    }

    public boolean deletePersonaje(Personaje personaje) throws MarvelException {
        personaje = findPersonaje(personaje);
        if (personaje == null) {
            return false;
        }

        String query = "DELETE FROM Personaje AS p WHERE p.id = '" + personaje.getId() + "'; " +
                "DELETE FROM Personaje_Poder AS pp WHERE pp.personaje_id = '" + personaje.getId() + "'; ";
        DaoAlias daoAlias = new DaoAlias();
        DaoEquipamiento daoEquipamiento = new DaoEquipamiento();
        DaoPoder daoPoder = new DaoPoder();
        daoAlias.deleteAlias(personaje.getAlias());

        for(Poder poder : personaje.getPoderes()) {
            daoPoder.deletePoder(poder);
        }

        for (Equipamiento equipamiento : personaje.getEquipamientos()) {
            daoEquipamiento.deleteEquipamiento(equipamiento);
        }
        actualizar(query);
        return true;
    }
}
