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
        String queryAll =  "SELECT ch FROM "+HeroCharacter.class.getName()+" AS ch";
        List<HeroCharacter> heroCharacters= em.createQuery(queryAll, HeroCharacter.class).getResultList();
        closeEntityManager(em);
        return heroCharacters;
    }

    @Override
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter) {

        return heroCharacter;
    }

    @Override
    public void addCharacter(HeroCharacter heroCharacter) {

    }

    @Override
    public void removeCharacter(HeroCharacter heroCharacter) {

    }

    @Override
    public void updateCharacter(HeroCharacter heroCharacter) {

    }

}
