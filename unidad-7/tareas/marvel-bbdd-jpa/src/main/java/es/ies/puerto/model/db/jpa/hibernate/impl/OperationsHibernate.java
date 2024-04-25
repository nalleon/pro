package es.ies.puerto.model.db.jpa.hibernate.impl;

import es.ies.puerto.model.db.jpa.hibernate.ICrudHibernate;
import es.ies.puerto.model.db.jpa.hibernate.abstracts.OperationsHibernateAbstracts;
import es.ies.puerto.model.impl.HeroCharacter;

import java.util.*;
import javax.persistence.*;


public class OperationsHibernate extends OperationsHibernateAbstracts implements ICrudHibernate {
    public OperationsHibernate(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public List<HeroCharacter> obtainCharacters() {
        EntityManager em = super.getEmf().createEntityManager();
        String queryAll =  "SELECT ch FROM Personajes AS ch";
        TypedQuery<HeroCharacter> query = em.createQuery(queryAll, HeroCharacter.class);
        List<HeroCharacter> heroCharacters= query.getResultList();
        closeEntityManager(em);
        return heroCharacters;
    }

    @Override
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) {
        EntityManager em = super.getEmf().createEntityManager();
        heroCharacter = em.find(HeroCharacter.class, heroCharacter.getCharacterId());
        closeEntityManager(em);
        return heroCharacter;
    }

    @Override
    public void addCharacter(HeroCharacter heroCharacter) {
        EntityManager em = getEm();
        HeroCharacter attachedEntity = em.merge(heroCharacter);
        em.getTransaction().begin();
        em.persist(attachedEntity);
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void removeCharacter(HeroCharacter heroCharacter) {
        EntityManager em = super.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(heroCharacter) ? heroCharacter : em.merge(heroCharacter));
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void updateCharacter(HeroCharacter heroCharacter) {
        EntityManager em = super.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.merge(heroCharacter);
        em.getTransaction().commit();
        closeEntityManager(em);
    }

}
