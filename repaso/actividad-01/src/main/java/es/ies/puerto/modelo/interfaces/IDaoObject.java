package es.ies.puerto.modelo.interfaces;
import es.ies.puerto.exception.ShopException;
import java.sql.SQLException;
import java.util.List;

public interface IDaoObject <T>{
    List<T> findAllObjects() throws SQLException, ShopException;
    T findById(int id) throws SQLException, ShopException;
    boolean addObject(T t) throws ShopException;
    boolean removeObject(int id) throws ShopException;
    default boolean updateObject(T t) throws ShopException {
        return false;
    }
    public List<T> obtain(String query) throws SQLException, ShopException;

}
