package es.ies.puerto.model.db.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.abstracts.OperationsDbAbstracts;
import es.ies.puerto.model.db.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperationsDb extends OperationsDbAbstracts implements ICrudDb {


    public OperationsDb() throws MyException {
    }

    @Override
    public Set<Character> obtain(String sql) throws MyException {
        Set<Character> characters = null;
        Set<String> powers = null;

        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConnection().createStatement();
            rs = statement.executeQuery(sql);
            characters = new HashSet<>();
            while (rs.next()) {
                characters.add(buildCharacter(rs));
            }
        } catch (Exception e) {
            throw new MyException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                closeConnection();
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (Exception e) {
                throw new MyException(sql, e);
            }
        }
        return characters;
    }


    public Set<String> obtainPowers (int id) throws MyException {
        Set<String> powers = null;
        ResultSet rs = null;
        Statement statement = null;

        String query = "SELECT poder FROM Poderes WHERE personaje_id="+id;
        try {
            powers = new HashSet<>();
            statement = getConnection().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                powers.add(rs.getString("poder"));
            }
        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        } finally {
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
        return powers;
    }

    public Character buildCharacter(ResultSet rs) throws SQLException, MyException {
        int id = rs.getInt("id");
        String name = rs.getString("nombre");
        String alias = rs.getString("alias");
        String gender = rs.getString("genero");
        Set<String> powers = obtainPowers(id);
        return new Character(id, name, alias, gender, powers);
    }
    @Override
    public Set<Character> obtainCharacters() throws MyException {
        String query="SELECT id, nombre, alias, genero FROM Personajes";
        return obtain(query);
    }
    @Override
    public Character obtainCharacter(Character character) throws MyException {
        String query="SELECT id, nombre, alias, genero FROM Personajes WHERE id="+character.getId();
        return obtain(query).iterator().next();
    }
    @Override
    public void addCharacter(Character character) throws MyException {
        String qry = "INSERT INTO Personajes(id, nombre, alias, genero) " +
                "VALUES ("+character.getId()+", '"+character.getName()+"', '"+character.getAlias()+
                "', '"+character.getGender()+"')";
        update(qry);

        if (character.getPowers().isEmpty()){
            return;
        }

        for (int i =0; i <= character.getPowers().size(); i++){
            String qryPowers = "INSERT INTO Poderes(personaje_id, poder)" +
                    "VALUES ("+character.getId()+", '"+character.getPowers()+"')";
            update(qryPowers);
        }
    }
    @Override
    public void removeCharacter(Character character) throws MyException {
        String qry = "DELETE FROM Personajes WHERE id="+character.getId();
        update(qry);

        String qryPowers = "DELETE FROM Poderes WHERE personaje_id="+character.getId();
        update(qryPowers);
    }
    @Override
    public void updateCharacter(Character character) throws MyException {
        String qry = "UPDATE Personajes SET nombre='"+character.getName()+
                "', alias='"+character.getAlias()+"', genero='"+character.getGender()+
                "' WHERE id="+character.getId();
        update(qry);

        for (String power : character.getPowers()) {
            String insertQry = "INSERT INTO Poderes(personaje_id, poder) VALUES (" +
                    character.getId() + ", '" + power + "')";
            update(insertQry);
        }
    }
}
