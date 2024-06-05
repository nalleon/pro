package es.ies.puerto.services.spring.data.interfaces;

import java.util.List;

public interface ICrudServices<T> {
    List<T> getAllObjects();
    T saveObject(T object);
    T updateObject(T object);
    void deleteObject(int id);
}
