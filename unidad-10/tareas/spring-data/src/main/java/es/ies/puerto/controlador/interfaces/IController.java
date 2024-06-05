package es.ies.puerto.controlador.interfaces;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IController <T> {
    List<T> getAllObjects();
    ResponseEntity<T> saveObject(T object);
    ResponseEntity<T> updateObject(int id, T object);
    ResponseEntity<Void> deleteObject(int id);
}
