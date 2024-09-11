package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.exception.ShopException;
import es.ies.puerto.modelo.entity.CustomerEntity;

import java.util.List;
import java.sql.SQLException;

public interface IDaoObjectFK <T> {
    List<T> findAllObjects() throws SQLException, ShopException;
    T findById(int id) throws SQLException, ShopException;
    boolean addObject(T t, CustomerDTO customerDTO) throws ShopException;
    boolean removeObject(int id) throws ShopException;
    default boolean updateObject(T t, CustomerDTO customerDTO) throws ShopException {
        return false;
    }
    public List<T> obtain(String query) throws SQLException, ShopException;
}
