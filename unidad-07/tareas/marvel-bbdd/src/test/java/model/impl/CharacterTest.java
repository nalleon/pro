package model.impl;

import es.ies.puerto.model.impl.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.Utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharacterTest extends Utilities {

    Character character;
    int id = 20;
    String name = "testing";
    String alias = "test";
    String gender = "junit@test";
    Set<String> powers = new HashSet<>(Arrays.asList("testing", "junit"));;
    @BeforeEach
    public void beforeEach(){
        character = new Character(id, name, alias,gender,powers);
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(character, MESSAGE_ERROR);
    }

    @Test
    public void setGetCharacter(){
        String nameUpdate = "nameUpdate";
        String genderUpdate = "genderUpdate";
        Set<String> powersUpdate = new HashSet<>((Arrays.asList("testingUpdate", "junitUpdate")));

        character.setName(nameUpdate);
        character.setGender(genderUpdate);
        character.setPowers(powersUpdate);

        Assertions.assertEquals(id, character.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(alias, character.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(nameUpdate, character.getName(), MESSAGE_ERROR);
        Assertions.assertEquals(genderUpdate, character.getGender(), MESSAGE_ERROR);
        Assertions.assertEquals(powersUpdate, character.getPowers(), MESSAGE_ERROR);

    }

    @Test
    public void equalsCharacterTest(){
        Character characterFind = new Character(id);
        Assertions.assertEquals(characterFind, character, MESSAGE_ERROR);
    }

    @Test
    public void toStringCharacter(){
        Assertions.assertTrue(character.toString().contains(alias),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(name),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(gender),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(String.valueOf(powers)), MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        Character characterEquals = new Character(20);
        Character characterNotEquals = new Character(34);
        String characterStr = "testing";
        Assertions.assertEquals(character, characterEquals, MESSAGE_ERROR);
        Assertions.assertFalse(character.equals(characterNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(character.equals(characterStr), MESSAGE_ERROR);


    }
}
