package modelo.impl;

import es.ies.puerto.modelo.impl.Character;
import es.ies.puerto.modelo.impl.CharacterList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.*;

public class CharacterListTest {

    CharacterList characterList;
    Character character;
    String name = "testing";
    String alias = "test";
    String gender = "junit@test";
    Set<String> powers = new HashSet<>(Arrays.asList("testing", "junit"));;
    @BeforeEach
    public void beforeEach(){
        characterList = new CharacterList();
        character = new Character(alias, name,gender,powers);
    }


    @Test
    public void getSetTest(){
        List<Character> setCharacters = new ArrayList<>(Arrays.asList(character, new Character("testing")));
        characterList.setCharacters(setCharacters);

        Assertions.assertEquals(setCharacters, characterList.getCharacters(), "Expected result not found");
    }
    @Test
    public void characterToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(character, new File("src/test/resources/marvelTest.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
