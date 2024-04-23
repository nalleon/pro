package es.ies.puerto.model.db.impl;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.impl.OperationsDb;
import es.ies.puerto.model.db.jdbc.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Alias;
import es.ies.puerto.model.impl.Character;
import es.ies.puerto.model.impl.Power;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperationsDbTest extends Utilities {
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, 3, "aliasTest");
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(10, "powerTesting1");
    Power power2 = new Power(11, "powerTesting2");
    ICrudDb persistence;
    Set<Character> characters;

    @BeforeEach
    public void beforeEach() {
        try {
        persistence = new OperationsDb();
        characters = persistence.obtainCharacters();
        powers = new HashSet<>(Arrays.asList(power1, power2));
        } catch (MyException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtainCharactersTest() {
        Assertions.assertFalse(characters.isEmpty(), MESSAGE_ERROR);
        //Assertions.assertEquals(2, characters.size(), MESSAGE_ERROR);
    }

    @Test
    public void obtainCharacterTest() throws MyException {
        Character characterFind = new Character(2);
        characterFind = persistence.obtainCharacter(characterFind);
        Alias aliasTest = new Alias(2,2, "Peter Parker");
        Assertions.assertEquals(characterFind.getAlias(),aliasTest,
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
        Character characterAdd = new Character(id, name, gender, alias, powers);

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
        Character characterAdd = new Character(id, name, gender, alias, powers);
        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();

        Character characterFind = new Character(characterAdd.getCharacterId());
        characterFind = persistence.obtainCharacter(characterFind);

        Character characterUpdate = persistence.obtainCharacter(characterFind);

        characterUpdate.setName("nameUpdate");
        characterUpdate.setGender("genderUpdate");
        characterUpdate.setAlias(new Alias(3,3,"aliasUpdate"));
        Power powerTest1 = new Power(10, "powerUpdate1");
        Set<Power> powersUpdate = new HashSet<>();
        powersUpdate.add(powerTest1);
        characterUpdate.setPowers(powersUpdate);

        persistence.updateCharacter(characterUpdate);

        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.toString(), characterUpdate.toString(),
                MESSAGE_ERROR);

        persistence.removeCharacter(characterUpdate);
    }
}
