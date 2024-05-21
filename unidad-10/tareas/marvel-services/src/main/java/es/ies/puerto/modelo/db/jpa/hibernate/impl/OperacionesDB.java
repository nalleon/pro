package es.ies.puerto.modelo.db.jpa.hibernate.impl;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.jpa.hibernate.abstracts.DBAbstracts;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public class OperacionesDB extends DBAbstracts {
    public OperacionesDB() {
    }

    public OperacionesDB(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public List<Personaje> obtainAllEntities() {
        String query =  "SELECT p FROM "+Personaje.class.getName()+" AS p";
        return getEm().createQuery(query, Personaje.class).getResultList();
    }

    @Override
    public Personaje obtainEntity(Personaje personaje) {
        personaje = getEm().find(Personaje.class, personaje.getId());
        return personaje;
    }

    @Override
    public boolean addEntity(Personaje personaje) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch (Exception  e){
            return false;
        } finally {
            closeEntityManager();
        }
    }

    @Override
    public boolean removeEntity(Personaje personaje) {
        try {
            personaje = obtainEntity(personaje);
            getEm().getTransaction().begin();
            getEm().remove(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch (Exception  e){
            return false;
        } finally {
            closeEntityManager();
        }
    }

    @Override
    public boolean updateEntity(Personaje personaje) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(personaje);
            getEm().getTransaction().commit();
            return true;
        } catch (Exception  e){
            return false;
        } finally {
            closeEntityManager();
        }
    }
}
