package es.ies.puerto.modelo.fichero.interfaces;

import es.ies.puerto.modelo.impl.Character;

import java.util.List;

public interface ICrudOperaciones {
    List<Character> obtainCharacters();
    Character obtainCharacter(Character character);
    void addCharacter(Character character);
    void deleteCharacter(Character character);
    void updateCharacter(Character character);
    void updateFile(List<Character> characters);
}
