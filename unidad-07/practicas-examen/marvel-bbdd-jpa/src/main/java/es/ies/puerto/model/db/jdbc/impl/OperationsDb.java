package es.ies.puerto.model.db.jdbc.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.abstracts.OperationsDbAbstracts;
import es.ies.puerto.model.db.jdbc.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.HeroCharacter;
import es.ies.puerto.model.impl.Power;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OperationsDb extends OperationsDbAbstracts implements ICrudDb {

    public OperationsDb() throws MyException {
    }

    @Override
    public Set<HeroCharacter> obtain(String sql) throws MyException {
        Set<HeroCharacter> heroCharacters = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConnection().createStatement();
            rs = statement.executeQuery(sql);
            heroCharacters = new HashSet<>();
            while (rs.next()) {
                heroCharacters.add(buildCharacter(rs));
            }
        } catch (Exception e) {
            throw new MyException(e.getMessage(), e);
        } finally {
            closeResources(statement, rs);
        }
        return heroCharacters;
    }

    @Override
    public Set<HeroCharacter> obtainCharacters() throws MyException {
        String qry = "SELECT ch.id, ch.nombre, ch.genero, a.id AS alias_id, a.alias, p.id AS poder_id p.poder AS poder " +
                     "FROM Personajes AS ch " +
                     "JOIN Personajes_Poderes AS chp ON ch.id=chp.personaje_id " +
                     "JOIN Poderes AS p ON p.id=chp.poder_id " +
                     "JOIN Alias a ON a.personaje_id=ch.id ";
        return obtain(qry);
    }

    public Alias buildAlias(ResultSet rs) throws MyException {
        Alias alias = null;
        try {
            alias = new Alias();
            int id = rs.getInt("alias_id");
            int characterId = rs.getInt("id");
            String aliasName = rs.getString("alias");
            alias = new Alias(id, new HeroCharacter(characterId), aliasName);

        } catch (SQLException e) {
            throw new MyException(e.getMessage(), e);
        }
        return alias;
    }

    public Set<Power> buildPower(ResultSet rs) throws MyException {
        Set<Power> powerSet = null;
        try {
            powerSet = new HashSet<>();
            int id = rs.getInt("poder_id");
            String powerName = rs.getString("poder");
            Power power = new Power(id, powerName);
            powerSet.add(power);

        } catch (SQLException e) {
            throw new MyException(e.getMessage(), e);
        }
        return powerSet;
    }

    public HeroCharacter buildCharacter (ResultSet rs) throws SQLException, MyException {
        int id = rs.getInt("id");
        String name= rs.getString("nombre");
        String gender = rs.getString("genero");
        Alias alias = buildAlias(rs);
        Set<Power> powers = buildPower(rs);

        return new HeroCharacter(id,name,gender,alias,powers);
    }

    @Override
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) throws MyException {
        String qry = "SELECT ch.id, ch.nombre, ch.genero, a.id AS alias_id, a.alias, p.id AS poder_id p.poder AS poder " +
                "FROM Personajes AS ch " +
                "JOIN Personajes_Poderes AS chp ON ch.id=chp.personaje_id " +
                "JOIN Poderes AS p ON p.id=chp.poder_id " +
                "JOIN Alias a ON a.personaje_id=ch.id " +
                "WHERE ch.id="+heroCharacter.getCharacterId();
        Set<HeroCharacter> characterSet = obtain(qry);

        return characterSet.iterator().next();
    }

    @Override
    public void addCharacter(HeroCharacter heroCharacter) throws MyException {
        String query = "INSERT INTO Personajes(id, nombre, genero) VALUES(" +
                heroCharacter.getCharacterId()+ ", '"+ heroCharacter.getName() + "', '" +heroCharacter.getName()+ "')";
        update(query);
        addToAliasTable(heroCharacter);
        addToPowersTable(heroCharacter);
        addToCharactersPowersTable(heroCharacter);
    }


    public void addToAliasTable(HeroCharacter heroCharacter) throws MyException{
        String query = "INSERT INTO Alias(id, personaje_id, alias) VALUES (" +
                heroCharacter.getAlias().getAliasId()+", "+ heroCharacter.getCharacterId()+", '"
                +heroCharacter.getAlias().getAlias()+"' ";
        update(query);
    }

    public void addToPowersTable(HeroCharacter heroCharacter) throws MyException {
        for (Power power : heroCharacter.getPowers()){
            String query = "INSERT INTO Poderes(id, poder) VALUES (" +
                            power.getPowerId()+", '"+power.getPower()+"' ";
            update(query);
        }

    }

    public void addToCharactersPowersTable(HeroCharacter heroCharacter) throws MyException{
        for (Power power : heroCharacter.getPowers()){
            String query = "INSERT INTO Personajes(persoanje_id, poder_id) VALUES (" +
                    heroCharacter.getCharacterId()+", '"+power.getPowerId()+"' ";
            update(query);
        }
    }

    @Override
    public void removeCharacter(HeroCharacter heroCharacter) throws MyException {
        String query = "DELETE FROM Personajes WHERE id="+heroCharacter.getCharacterId();
        update(query);
        removeFromAliasTable(heroCharacter);
        removeFromPowersTable(heroCharacter);
        removeFromCharactersPowersTable(heroCharacter);
    }

    public void removeFromAliasTable(HeroCharacter heroCharacter) throws MyException {
        String query = "DELETE FROM Alias WHERE id="+heroCharacter.getAlias().getAliasId();
        update(query);
    }

    public void removeFromPowersTable(HeroCharacter heroCharacter) throws MyException {
        for (Power power : heroCharacter.getPowers()) {
            String query = "DELETE FROM Poderes WHERE id=" +power.getPowerId();
            update(query);
        }
    }

    public void removeFromCharactersPowersTable(HeroCharacter heroCharacter) throws MyException {
        for (Power power : heroCharacter.getPowers()) {
            String query = "DELETE FROM Personajes_Poderes WHERE personaje_id="+heroCharacter.getCharacterId()+
                    " AND poder_id=" +power.getPowerId();
            update(query);
        }
    }
    @Override
    public void updateCharacter(HeroCharacter heroCharacter) throws MyException {
        String query = "UPDATE Personajes SET nombre='" +heroCharacter.getName() +"', '"+heroCharacter.getGender()+"' " +
                "WHERE id="+heroCharacter.getCharacterId();
        update(query);
    }

    public void updateAliasTable(HeroCharacter heroCharacter) throws MyException{
        String query = "UPDATE Alias SET personaje_id="+heroCharacter.getAlias().getHeroCharacter().getCharacterId()+
                ", alias='"+heroCharacter.getAlias().getAlias();
        update(query);
    }

    public void updatePowerTable(HeroCharacter heroCharacter) throws MyException {
        for (Power power : heroCharacter.getPowers()){
            String query = "UPDATE Poderes SET poder='"+power.getPower()+" " +
                    "WHERE id="+power.getPowerId();
            update(query);
        }
    }


}