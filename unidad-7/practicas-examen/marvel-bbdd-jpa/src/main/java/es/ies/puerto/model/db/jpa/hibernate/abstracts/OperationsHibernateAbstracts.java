package es.ies.puerto.model.db.jpa.hibernate.abstracts;
import es.ies.puerto.model.db.jpa.hibernate.impl.OperationsHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OperationsHibernateAbstracts {
    EntityManagerFactory emf;
    EntityManager em;

    public OperationsHibernateAbstracts(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public void closeEntityManager(EntityManager em){
        if (em!=null) {
            em.close();
        }
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

}
