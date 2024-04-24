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

    public OperationsHibernate (){}

    public OperationsHibernate(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Set<Character> obtainCharacters() {
        Set<Character> characterSet = new HashSet<>();
        getEm().createQuery("SELECT ch FROM Personajes ch", Character.class).getResultStream().forEach(characterSet::add);
        closeEntityManager(getEm());
        return characterSet;
    }

    @Override
    public Character obtainCharacter(Character character) {
        character = getEm().find(Character.class, character.getCharacterId());
        closeEntityManager(getEm());
        return character;
    }

    @Override
    public void addCharacter(Character character) {
        getEm().getTransaction().begin();
        getEm().persist(character);
        getEm().getTransaction().commit();
        closeEntityManager(getEm());
    }

    @Override
    public void removeCharacter(Character character) {
        getEm().getTransaction().begin();
        getEm().remove(getEm().contains(character) ? character : getEm().merge(character));
        getEm().getTransaction().commit();
        closeEntityManager(getEm());
    }

    @Override
    public void updateCharacter(Character character) {
        getEm().getTransaction().begin();
        getEm().merge(character);
        getEm().getTransaction().commit();
        closeEntityManager(getEm());
    }


}
