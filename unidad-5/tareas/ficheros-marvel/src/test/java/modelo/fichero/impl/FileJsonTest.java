package modelo.fichero.impl;

import es.ies.puerto.modelo.fichero.impl.FileJson;
import es.ies.puerto.modelo.fichero.impl.FileXml;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileJsonTest {

    String name = "testing";
    String alias = "test";
    String gender = "junit@test";
    Set<String> powers;
    ICrudOperaciones persistence;
    List<Character> characters;

    @BeforeEach
    public void beforeEach(){
        persistence = new FileJson();
        characters = persistence.obtainCharacters();
        powers = new HashSet<>(Arrays.asList("testing", "junit"));
    }

    @Test
    public void obtainCharactersTest(){
        Assertions.assertFalse(characters.isEmpty(), "Expected result not found");
    }

    @Test
    public void obtainCharacterTest(){
        Character characterFind = new Character("Peter Parker");
        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertEquals(characterFind.getAlias(),"Peter Parker",
                "Expected result not found");
        Assertions.assertNotNull(characterFind.getName(),
                "Expected result not found");
        Assertions.assertFalse(characterFind.getPowers().isEmpty(), "Expected result not found");
        Assertions.assertNotNull(characterFind.getGender(),
                "Expected result not found");

        characterFind = new Character(alias);
        characterFind = persistence.obtainCharacter(characterFind);
        Assertions.assertNull(characterFind, "Expected result not found");

    }

    @Test
    public void addDeleteCharacterTest(){
        int originalSize = characters.size();
        Character characterAdd = new Character(alias,name,gender, powers);

        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        int updatedSize = characters.size();

        Assertions.assertTrue(characters.contains(characterAdd), "Expected result not found");
        Assertions.assertEquals(originalSize+1, updatedSize, "Expected result not found");

        persistence.addCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertTrue(characters.contains(characterAdd), "Expected result not found");
        Assertions.assertEquals(originalSize+1, updatedSize, "Expected result not found");

        persistence.deleteCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, "Expected result not found");


        persistence.deleteCharacter(characterAdd);
        characters = persistence.obtainCharacters();
        updatedSize = characters.size();
        Assertions.assertEquals(originalSize, updatedSize, "Expected result not found");
    }

    @Test
    public void updateCharacterTest(){
        Character characterFind = new Character("Peter Parker");
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

        characterFind = new Character("testing");
        characterUpdate = persistence.obtainCharacter(characterFind);
        int originalSize = persistence.obtainCharacters().size();

        persistence.updateCharacter(characterUpdate);
        characters = persistence.obtainCharacters();

        Assertions.assertFalse(persistence.obtainCharacters().contains(characterUpdate),
                "Expected result not found");
        Assertions.assertEquals(originalSize, characters.size(), "Expected result not found");

    }
}

