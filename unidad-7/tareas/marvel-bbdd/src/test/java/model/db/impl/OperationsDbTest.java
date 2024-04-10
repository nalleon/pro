package model.db.impl;
import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.impl.OperationsDb;
import es.ies.puerto.model.db.interfaces.ICrudDb;
import es.ies.puerto.model.impl.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperationsDbTest {
    int id = 20;
    String name = "testing";
    String alias = "test";
    String gender = "junit@test";
    Set<String> powers;
    ICrudDb persistence;
    Set<Character> characters;

    @BeforeEach
    public void beforeEach() {
        try {
        persistence = new OperationsDb();
        characters = persistence.obtainCharacters();
        powers = new HashSet<>(Arrays.asList("testing", "junit"));
        } catch (MyException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtainCharactersTest(){
        Assertions.assertFalse(characters.isEmpty(), "Expected result not found");
        Assertions.assertEquals(2, characters.size(), "Expected result not found");
    }

    @Test
    public void obtainCharacterTest() throws MyException {
        Character characterFind = new Character(2);
        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.getAlias(),"Peter Parker",
                "Expected result not found");
        Assertions.assertNotNull(characterFind.getName(),
                "Expected result not found");
        Assertions.assertFalse(characterFind.getPowers().isEmpty(), "Expected result not found");
        Assertions.assertNotNull(characterFind.getGender(),
                "Expected result not found");

        characterFind = new Character(3);
        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertFalse(characters.contains(characterFind), "Expected result not found");

    }

    @Test
    public void addDeleteCharacterTest() throws MyException {
        int originalSize = characters.size();
        Character characterAdd = new Character(id, alias, name, gender, powers);
        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();

        Assertions.assertTrue(characters.contains(characterAdd), "Expected result not found");
        int updatedSize = characters.size();

        Assertions.assertEquals(originalSize + 1, updatedSize, "Expected result not found");

        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertTrue(characters.contains(characterAdd), "Expected result not found");
        Assertions.assertEquals(originalSize+1, updatedSize, "Expected result not found");

        persistence.removeCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, "Expected result not found");


        persistence.removeCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, "Expected result not found");
    }

    @Test
    public void updateCharacterTest() throws MyException {
        Character characterFind = new Character(2);
        characterFind = persistence.obtainCharacter(characterFind);

        Character characterUpdate = persistence.obtainCharacter(characterFind);
        Character characterBackup = persistence.obtainCharacter(characterFind);

        characterUpdate.setName(name);
        characterUpdate.setGender(gender);
        characterUpdate.setPowers(powers);

        persistence.updateCharacter(characterUpdate);

        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.toString(), characterUpdate.toString(),
                "Expected result not found");

        persistence.updateCharacter(characterBackup);

        characterFind = new Character(3);
        characterUpdate = persistence.obtainCharacter(characterFind);
        int originalSize = persistence.obtainCharacters().size();

        persistence.updateCharacter(characterUpdate);
        characters = persistence.obtainCharacters();

        Assertions.assertFalse(persistence.obtainCharacters().contains(characterUpdate),
                "Expected result not found");
        Assertions.assertEquals(originalSize, characters.size(), "Expected result not found");

    }
}
