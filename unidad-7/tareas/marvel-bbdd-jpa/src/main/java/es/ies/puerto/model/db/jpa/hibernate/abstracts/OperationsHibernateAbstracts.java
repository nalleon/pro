package es.ies.puerto.model.db.jpa.hibernate.abstracts;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class OperationsHibernateAbstracts {
    EntityManagerFactory emf;
    EntityManager em;
    public OperationsHibernateAbstracts() {}

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
}
