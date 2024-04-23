package es.ies.puerto.model.db.jpa.hibernate.impl;

import es.ies.puerto.model.db.jpa.hibernate.ICrudHibernate;
import es.ies.puerto.model.db.jpa.hibernate.abstracts.OperationsHibernateAbstracts;
import es.ies.puerto.model.impl.Character;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.Set;

public class OperationsHibernate extends OperationsHibernateAbstracts implements ICrudHibernate {
    EntityManagerFactory emf;

    public OperationsHibernate (){
        emf = Persistence.createEntityManagerFactory("sqlite-jpa");
    }


    //TODO
    @Override
    public Set<Character> obtainCharacters() {
        EntityManager em = emf.createEntityManager();
        Set<Character> characterSet = new HashSet<>();
        em.createQuery("SELECT ch FROM Personajes ch", Character.class).getResultStream().forEach(characterSet::add);
        closeEntityManager(em);
        return characterSet;
    }

    @Override
    public Character obtainCharacter(Character character) {
        EntityManager em = emf.createEntityManager();
        character = em.find(Character.class, character.getCharacterId());
        closeEntityManager(em);
        return character;
    }

    @Override
    public void addCharacter(Character character) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(character);
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void removeCharacter(Character character) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(character) ? character : em.merge(character));
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void updateCharacter(Character character) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(character);
        em.getTransaction().commit();
        closeEntityManager(em);
    }
}
