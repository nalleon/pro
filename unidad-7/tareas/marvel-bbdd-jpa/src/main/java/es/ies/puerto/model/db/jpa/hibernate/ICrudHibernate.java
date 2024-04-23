package es.ies.puerto.model.db.jpa.hibernate;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.impl.Character;

import java.util.Set;

public interface ICrudHibernate {
    public Set<Character> obtainCharacters();
    public Character obtainCharacter(Character character);
    public void addCharacter(Character character);
    public void removeCharacter(Character character);
    public void updateCharacter(Character character);
}
