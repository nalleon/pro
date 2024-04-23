package es.ies.puerto.model.impl;

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
    int id = 3;
    String name = "nameTesting";
    Alias alias = new Alias(3, 3, "aliasTest");
    String gender = "genderTest";
    Set<Power> powers;
    Power power1 = new Power(1, "powerTesting1");
    Power power2 = new Power(2, "powerTesting2");

    @BeforeEach
    public void beforeEach(){
        powers = new HashSet<>(Arrays.asList(power1,power2));
        character = new Character(id, name,gender, alias, powers);
    }

    @Test
    public void characterNotNull(){
        Assertions.assertNotNull(character, MESSAGE_ERROR);
    }

    @Test
    public void setGetCharacter(){
        String nameUpdate = "nameUpdate";
        String genderUpdate = "genderUpdate";
        Alias aliasUpdate = new Alias(4,3,"aliasTest2");
        Power power = new Power(3, "powerTesting3");
        Set<Power> powersUpdate = new HashSet<>();
        powersUpdate.add(power);

        character.setName(nameUpdate);
        character.setGender(genderUpdate);
        character.setPowers(powersUpdate);

        Assertions.assertEquals(id, character.getCharacterId(), MESSAGE_ERROR);
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
        Assertions.assertTrue(character.toString().contains(alias.toString()),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(name),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(gender),
                MESSAGE_ERROR);
        Assertions.assertTrue(character.toString().contains(String.valueOf(powers)), MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        Character characterEquals = new Character(3);
        Character characterNotEquals = new Character(34);
        String characterStr = "testing";
        Assertions.assertEquals(character, characterEquals, MESSAGE_ERROR);
        Assertions.assertFalse(character.equals(characterNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(character.equals(characterStr), MESSAGE_ERROR);


    }
}
