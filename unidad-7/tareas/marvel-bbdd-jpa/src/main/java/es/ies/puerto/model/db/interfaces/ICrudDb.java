package es.ies.puerto.model.db.interfaces;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.impl.Character;

import java.util.Set;

public interface ICrudDb {
    public Set<Character> obtain(String query) throws MyException ;
    public Set<Character> obtainCharacters() throws MyException ;
    public Character obtainCharacter(Character character) throws MyException ;
    public void addCharacter(Character character) throws MyException;
    public void removeCharacter(Character character) throws MyException ;
    public void updateCharacter(Character character) throws MyException ;
}
