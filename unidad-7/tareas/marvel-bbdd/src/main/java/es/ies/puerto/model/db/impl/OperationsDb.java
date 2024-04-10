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
    public Set<Character> obtain(String query) throws MyException {
        Set <Character> list = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = getConnection().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                buildCharacter(rs);
            }
        } catch (SQLException exception){
            throw new MyException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()){
                    rs.close();
                }
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
        return list;
    }
    public Set<String> obtainPowers () throws MyException {
        Set<String> powers = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        String query = "SELECT p.poder FROM Poderes p JOIN Personajes ch ON ch.id=p.personaje_id";
        try {
            statement = getConnection().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String power = rs.getString("poder");
                powers.add(power);
            }
        } catch (SQLException exception) {
            throw new MyException(exception.getMessage(), exception);
        }
        return powers;
    }

    public Character buildCharacter(ResultSet rs) throws SQLException, MyException {
        int id = rs.getInt("id");
        String name = rs.getString("nombre");
        String alias = rs.getString("alias");
        String gender = rs.getString("gender");
        Set<String> powers = obtainPowers();
        return new Character(id, name, alias, gender, powers);
    }
    @Override
    public Set<Character> obtainCharacters() throws MyException {
        String query="SELECT ch.id, ch.nombre, ch.alias, ch.genero, p.poder FROM Personajes AS ch" +
                " JOIN Poderes p ON p.personaje_id=ch.id";
        return obtain(query);
    }
    @Override
    public Character obtainCharacter(Character character) throws MyException {
        String query="SELECT ch.id, ch.nombre, ch.alias, ch.genero, p.poder " +
                "FROM Personajes ch AS u WHERE p.personaje_id="+character.getId();
        Set <Character> list = obtain(query);
        if (list.isEmpty()){
            return null;
        }
        return list.iterator().next();
    }
    @Override
    public void addCharacter(Character character) throws MyException {
        String qry = "INSERT INTO Personajes(nombre, alias, genero) " +
                "VALUES ("+character.getName()+", "+character.getAlias()+
                ", "+character.getGender()+")";
        update(qry);

        if (character.getPowers().size() == 0){
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
                "', alias='"+character.getAlias()+"', genero="+character.getGender()+
                " WHERE id='"+character.getId()+"'";
        update(qry);

        for (int i =0; i <= character.getPowers().size(); i++){
            String qryPowers = "UPDATE Poderes SET poder='"+character.getPowers()+"' WHERE id="+character.getId();
            update(qryPowers);
        }
        String qryPowers = "UPDATE Poderes SET poder='"+character.getPowers()+
                "', alias='"+character.getAlias()+"', genero="+character.getGender()+
                " WHERE id='"+character.getId()+"'";
        update(qryPowers);
    }
}
