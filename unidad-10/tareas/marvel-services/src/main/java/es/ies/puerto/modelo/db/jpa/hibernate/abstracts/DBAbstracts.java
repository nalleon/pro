package es.ies.puerto.modelo.db.jpa.hibernate.abstracts;

import es.ies.puerto.modelo.db.jpa.hibernate.interfaces.ICrudDB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class DBAbstracts implements ICrudDB {
    EntityManagerFactory emf;
    EntityManager em;

    public DBAbstracts() {}
    public DBAbstracts(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void closeEntityManager(){
        if (getEm()!= null && getEm().isOpen()) {
            getEm().close();
        }
    }
    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
