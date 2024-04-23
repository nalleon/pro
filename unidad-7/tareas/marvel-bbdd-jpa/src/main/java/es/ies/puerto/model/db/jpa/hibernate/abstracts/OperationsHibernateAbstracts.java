package es.ies.puerto.model.db.jpa.hibernate.abstracts;

import javax.persistence.EntityManager;

public class OperationsHibernateAbstracts {
    public void closeEntityManager(EntityManager em){
        if (em!=null) {
            em.close();
        }
    }
}
