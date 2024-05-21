package es.ies.puerto.modelo.db.jpa.hibernate.interfaces;

import es.ies.puerto.modelo.db.entidades.Personaje;

import java.util.List;

public interface ICrudDB {
    List<Personaje> obtainAllEntities();
    Personaje obtainEntity(Personaje personaje);
    boolean addEntity(Personaje personaje);
    boolean removeEntity(Personaje personaje);
    boolean updateEntity (Personaje personaje);
}
