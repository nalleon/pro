package es.ies.puerto.model.db.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.impl.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperationsDb extends ConnectionDb{
    public OperationsDb(String url) throws MyException {
        super(url);
    }

    private void update(String query) throws MyException {
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
                if (!getConnection().isClosed()){
                    getConnection().close();
                }
            } catch (SQLException e) {
                throw new MyException(e.getMessage(), e);
            }
        }
    }
    private Set<Character> obtain(String query) throws MyException {
        Set <Character> list = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = getConnection().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {

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
        String gender = rs.getString("alias");
        Set<String> powers = obtainPowers();
        return new Character(id, name, alias, gender, powers);
    }
    public Set<Character> obtainCharacters() throws MyException {
        String query="SELECT ch.id, ch.nombre, ch.alias, ch.genero FROM Personajes AS ch";
        return obtain(query);
    }

    public Character obtainCharacter(Character Character) throws MyException {
        String query="SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios AS u WHERE u.id='"+Character.getId()+"'";
        Set <Character> list = obtain(query);
        if (list.isEmpty()){
            return null;
        }
        return list.iterator().next();
    }
    public void addCharacter(Character Character) throws MyException {
        String qry = "INSERT INTO usuarios(nombre, edad, ciudad) " +
                "VALUES ('"+Character.getName()+"',"+ Character.getAge()+",'"+Character.getCity()+"')";
        update(qry);
    }

    public void removeCharacter(Character Character) throws MyException {
        String qry = "DELETE FROM usuarios " +
                "WHERE id='"+Character.getId()+"'";
        update(qry);
    }

    public void updateCharacter(Character Character) throws MyException {
        String qry = "UPDATE usuarios SET nombre='"+Character.getName()+
                "', ciudad='"+Character.getCity()+"', edad="+Character.getAge()+
                " WHERE id='"+Character.getId()+"'";
        update(qry);
    }
}
