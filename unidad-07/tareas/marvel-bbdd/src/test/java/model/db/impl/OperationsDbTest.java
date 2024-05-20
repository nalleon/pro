package model.db.impl;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.impl.OperationsDb;
import es.ies.puerto.model.db.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperationsDbTest extends Utilities {
    int id = 3;
    String name = "nameTesting";
    String alias = "aliasTest";
    String gender = "genderTest";
    Set<String> powers;
    ICrudDb persistence;
    Set<Character> characters;

    @BeforeEach
    public void beforeEach() {
        try {
        persistence = new OperationsDb();
        characters = persistence.obtainCharacters();
        powers = new HashSet<>(Arrays.asList("powerTesting", "powerTesting2"));
        } catch (MyException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtainCharactersTest() {
        Assertions.assertFalse(characters.isEmpty(), MESSAGE_ERROR);
        Assertions.assertEquals(2, characters.size(), MESSAGE_ERROR);
    }

    @Test
    public void obtainCharacterTest() throws MyException {
        Character characterFind = new Character(2);
        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.getAlias(),"Peter Parker",
                MESSAGE_ERROR);
        Assertions.assertNotNull(characterFind.getName(),
                MESSAGE_ERROR);
        Assertions.assertFalse(characterFind.getPowers().isEmpty(), MESSAGE_ERROR);
        Assertions.assertNotNull(characterFind.getGender(),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeleteCharacterTest() throws MyException {
        int originalSize = characters.size();
        Character characterAdd = new Character(id, alias, name, gender, powers);
        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();

        Assertions.assertTrue(characters.contains(characterAdd), MESSAGE_ERROR);
        int updatedSize = characters.size();

        Assertions.assertEquals(originalSize + 1, updatedSize, MESSAGE_ERROR);

        persistence.removeCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, MESSAGE_ERROR);

        persistence.removeCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, MESSAGE_ERROR);
    }

    @Test
    public void updateCharacterTest() throws MyException {
        Character characterAdd = new Character(id, alias, name, gender, new HashSet<>());
        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();

        Character characterFind = new Character(3);
        characterFind = persistence.obtainCharacter(characterFind);

        Character characterUpdate = persistence.obtainCharacter(characterFind);

        characterUpdate.setName("testing2");
        characterUpdate.setName("testing2");
        characterUpdate.setGender("testing2");
        characterUpdate.setPowers(powers);

        persistence.updateCharacter(characterUpdate);

        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.toString(), characterUpdate.toString(),
                MESSAGE_ERROR);

        persistence.removeCharacter(characterUpdate);
    }
}
