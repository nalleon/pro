package es.ies.puerto.model.db.jdbc.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.abstracts.OperationsDbAbstracts;
import es.ies.puerto.model.db.jdbc.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.Character;
import es.ies.puerto.model.impl.Power;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OperationsDb extends OperationsDbAbstracts implements ICrudDb {
    public OperationsDb() throws MyException {
    }
    @Override
    public Set<Character> obtain(String sql) throws MyException {
        Set<Character> characters = null;
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
            closeResources(statement, rs);
        }
        return characters;
    }

    /**
     * Method that obtains the powers of a character in the database
     * @param rs of the sqlite query
     * @throws MyException
     */
    public Set<Power> obtainPowers (ResultSet rs) throws MyException {
        Set<Power> powers = null;
        try {
            powers = new HashSet<>();

                int powerId = rs.getInt("poder_id");
                String powerName = rs.getString("poder");
                Power power = new Power(powerId, powerName);
                powers.add(power);

        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        }
        return powers;
    }

    /**
     * Method that obtains the alias of a character in the database
     * @param rs of the sqlite query
     * @throws MyException
     */
    public Alias obtainAlias (ResultSet rs) throws MyException{
        Alias alias = null;
        try {
            alias = new Alias();
                    int aliasId = rs.getInt("alias_id");
                    int characterId = rs.getInt("personaje_id");
                    String aliasName = rs.getString("alias");
                    alias = new Alias(aliasId, characterId, aliasName);

        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        }
        return alias;
    }
    /**
     * Method that builds an object from the class Character
     * @param rs of the query
     * @throws MyException
     */
    public Character buildCharacter(ResultSet rs) throws SQLException, MyException {
        int id = rs.getInt("personaje_id");
        String name = rs.getString("nombre_personaje");
        String gender = rs.getString("genero");
        Alias alias = obtainAlias(rs);
        Set<Power> powers = obtainPowers(rs);
        return new Character(id, name, gender,alias, powers);
    }
    @Override
    public Set<Character> obtainCharacters() throws MyException {
        String qry = "SELECT ch.id AS personaje_id, ch.nombre AS nombre_personaje, ch.genero, " +
                "a.id AS alias_id, a.alias, " +
                "p.id AS poder_id, p.poder " +
                "FROM Personajes AS ch " +
                "JOIN Alias AS a ON ch.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS chp ON ch.id = chp.personaje_id " +
                "JOIN Poderes AS p ON chp.poder_id = p.id";
        return obtain(qry);
    }
    @Override
    public Character obtainCharacter(Character character) throws MyException {
        String qry = "SELECT ch.id AS personaje_id, ch.nombre AS nombre_personaje, ch.genero, " +
                "a.id AS alias_id, a.alias, " +
                "p.id AS poder_id, p.poder " +
                "FROM Personajes AS ch " +
                "JOIN Alias AS a ON ch.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS chp ON ch.id = chp.personaje_id " +
                "JOIN Poderes AS p ON chp.poder_id = p.id "+
                "WHERE ch.id="+character.getCharacterId();
        return obtain(qry).iterator().next();
    }
    @Override
    public void addCharacter(Character character) throws MyException {
        String qryCharacter = "INSERT INTO Personajes(id, nombre, genero) " +
                "VALUES ("+character.getCharacterId()+ ", '"+character.getName()+
                "', '"+character.getGender()+"')";
        update(qryCharacter);
        addPowers(character);
        addAlias(character);
        addCharactersPowers(character);
    }

    /**
     * Method that adds the powers of a character in the database
     * @param character to add its powers
     * @throws MyException
     */
    public void addPowers(Character character) throws MyException{
        for (Power power : character.getPowers()){
            String qryPowers = "INSERT INTO Poderes(id, poder)" +
                    "VALUES ("+ power.getPowerId()+", '"+power.getPower()+"')";
            update(qryPowers);
        }
    }

    /**
     * Method that adds the alias of a character in the database
     * @param character to add its alias
     * @throws MyException
     */
    public void addAlias(Character character) throws MyException{
        String qry = "INSERT INTO Alias(id, personaje_id, alias) VALUES ("+ character.getAlias().getAliasId()+", "
                +character.getCharacterId()+", '"+character.getAlias().getAlias()+"')";
        update(qry);
    }

    /**
     * Method that adds the powers of a character in the database
     * @param character to add its powers
     * @throws MyException
     */
    public void addCharactersPowers(Character character) throws MyException{
        for (Power power:character.getPowers()) {
            String qryCharPowers = "INSERT INTO Personajes_Poderes(personaje_id, poder_id) VALUES (" +
                    character.getCharacterId() + ", " + power.getPowerId() + ")";
            update(qryCharPowers);
        }
    }

    @Override
    public void removeCharacter(Character character) throws MyException {
        String qry = "DELETE FROM Personajes WHERE id="+character.getCharacterId();
        update(qry);
        removePowers(character);
        removeCharactersPowers(character);
        removeAlias(character);
    }

    /**
     * Method that remove the powers of a character in the database
     * @param character to remove its powers
     * @throws MyException
     */
    public void removePowers(Character character) throws MyException{
        for (Power power:character.getPowers()) {
            String qryCharPowers = "DELETE FROM Poderes WHERE id=" + power.getPowerId();
            update(qryCharPowers);
        }
    }

    /**
     * Method that removes the alias of a character in the database
     * @param character to remove its alias
     * @throws MyException
     */
    public void removeAlias(Character character) throws MyException{
        String qry = "DELETE FROM Alias WHERE personaje_id="+character.getCharacterId();
        update(qry);
    }

    public void removeCharactersPowers(Character character) throws MyException{
        String qryCharacterPowers = "DELETE FROM Personajes_Poderes WHERE personaje_id="+character.getCharacterId();
        update(qryCharacterPowers);
    }

    @Override
    public void updateCharacter(Character character) throws MyException {
        String qry = "UPDATE Personajes SET nombre='"+character.getName()+
                "', genero='"+character.getGender()+ "' WHERE id="+character.getCharacterId();
        update(qry);
        updatePowers(character);
        updateAlias(character);
        updateCharacterPowers(character);
    }

    /**
     * Method that updates the powers of a character in the database
     * @param character to update its powers
     * @throws MyException
     */
    public void updatePowers(Character character) throws MyException {
        for (Power power:character.getPowers()) {
            String qryPowers = "UPDATE Poderes SET " +
                    "poder='"+power.getPower()+"' " +
                    "WHERE id="+power.getPowerId()+";";
            update(qryPowers);
        }
    }
    /**
     * Method that updates the alias of a character in the database
     * @param character to update its alias
     * @throws MyException
     */
    public void updateAlias(Character character) throws MyException {
        String qryAlias = "UPDATE Alias SET alias='"+ character.getAlias().getAlias() + "' " +
                "WHERE personaje_id="+character.getCharacterId();
        update(qryAlias);
    }

    /**
     * Method that updates the id of the powers from a character in the database
     * @param character to update in table Personajes_Poderes
     * @throws MyException
     */

    public void updateCharacterPowers(Character character) throws MyException {
        for (Power power : character.getPowers()) {
            String qryChrPowers = "REPLACE INTO Personajes_Poderes (personaje_id, poder_id) VALUES " +
                    "("+character.getCharacterId()+", "+power.getPowerId()+ ")";
            update(qryChrPowers);
        }
    }

}
