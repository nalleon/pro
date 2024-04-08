package es.ies.puerto.model.db.impl;
import es.ies.puerto.exception.UserException;
import es.ies.puerto.model.impl.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperationsDb extends ConnectionDb{
    public OperationsDb(String url) throws UserException {
        super(url);
    }

    private void update(String query) throws UserException {
        Statement statement = null;
        try{
            statement = getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception){
            throw new UserException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()){
                    statement.close();
                }
                if (!getConnection().isClosed()){
                    getConnection().close();
                }
            } catch (SQLException e) {
                throw new UserException(e.getMessage(), e);
            }
        }
    }
    private Set<User> obtain(String query) throws UserException {
        Set <User> list = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;

        try{
            statement = getConnection().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {
                String userId = rs.getString("id");
                String userName = rs.getString("nombre");
                int userAge = rs.getInt("edad");
                String userCity = rs.getString("ciudad");
                User user = new User(userId, userName, userAge, userCity);
                list.add(user);
            }
        } catch (SQLException exception){
            throw new UserException(exception.getMessage(), exception);
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
                throw new UserException(e.getMessage(), e);
            }
        }
        return list;
    }
    public Set<User> obtainUsers() throws UserException {
       String query="SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios AS u";
       return obtain(query);
    }

    public User obtainUser(User user) throws UserException {
        String query="SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios AS u WHERE u.id='"+user.getId()+"'";
        Set <User> list = obtain(query);
        if (list.isEmpty()){
            return null;
        }
        return list.iterator().next();
    }
    public void addUser(User user) throws UserException {
        String qry = "INSERT INTO usuarios(nombre, edad, ciudad) " +
                     "VALUES ('"+user.getName()+"',"+ user.getAge()+",'"+user.getCity()+"')";
        update(qry);
    }

    public void removeUser(User user) throws UserException {
        String qry = "DELETE FROM usuarios " +
                "WHERE id='"+user.getId()+"'";
        update(qry);
    }

    public void updateUser(User user) throws UserException {
        String qry = "UPDATE usuarios SET nombre='"+user.getName()+
                "', ciudad='"+user.getCity()+"', edad="+user.getAge()+
                " WHERE id='"+user.getId()+"'";
        update(qry);
    }
}
