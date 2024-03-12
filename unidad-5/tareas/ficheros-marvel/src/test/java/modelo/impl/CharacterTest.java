package modelo.impl;

import es.ies.puerto.modelo.impl.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CharacterTest {

    Character character;
    String name = "testing";
    String alias = "test";
    String gender = "junit@test";
    Set<String> powers = new HashSet<>(Arrays.asList("testing", "junit"));;
    @BeforeEach
    public void beforeEach(){
        character = new Character(alias, name,gender,powers);
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(character, "Result can not be null");
    }

    @Test
    public void setGetCharacter(){
        String nameUpdate = "nameUpdate";
        String genderUpdate = "genderUpdate";
        Set<String> powersUpdate = new HashSet<>((Arrays.asList("testingUpdate", "junitUpdate")));

        character.setName(nameUpdate);
        character.setGender(genderUpdate);
        character.setPowers(powersUpdate);

        Assertions.assertEquals(alias, character.getAlias(), "Expected result not found");
        Assertions.assertEquals(nameUpdate, character.getName(), "Expected result not found");
        Assertions.assertEquals(genderUpdate, character.getGender(), "Expected result not found");
        Assertions.assertEquals(powersUpdate, character.getPowers(), "Expected result not found");

    }

    @Test
    public void equalsCharacterTest(){
        Character characterFind = new Character(alias);
        Assertions.assertEquals(characterFind, character, "Expected result not found");
    }

    @Test
    public void toStringCharacter(){
        Assertions.assertTrue(character.toString().contains(alias),
                "Expected result not found");
        Assertions.assertTrue(character.toString().contains(name),
                "Expected result not found");
        Assertions.assertTrue(character.toString().contains(gender),
                "Expected result not found");
        Assertions.assertTrue(character.toString().contains(String.valueOf(powers)), "Expected result not found");
    }

    @Test
    public void toCsvTest(){
        Assertions.assertTrue(character.toCsv().contains(name),
                "Expected result not found");
        Assertions.assertTrue(character.toCsv().contains(alias),
                "Expected result not found");
        Assertions.assertTrue(character.toCsv().contains(gender),
                "Expected result not found");
        Assertions.assertNotNull(character.toCsv().contains(String.valueOf(powers)),
                "Expected result not found");
        Assertions.assertTrue(character.toCsv().contains(character.DELIMITER),
                "Expected result not found");
    }

    @Test
    public void hashCodeEqualsTest(){
        Character characterEquals = new Character(alias);
        Character characterNotEquals = new Character("Test");
        String characterStr = "testing";
        Assertions.assertEquals(character.hashCode(), characterEquals.hashCode(), "Expected result not found");
        Assertions.assertEquals(character, characterEquals, "Expected result not found");
        Assertions.assertFalse(character.equals(characterNotEquals), "Expected result not found");
        Assertions.assertFalse(character.equals(characterStr), "Expected result not found");


    }
}
