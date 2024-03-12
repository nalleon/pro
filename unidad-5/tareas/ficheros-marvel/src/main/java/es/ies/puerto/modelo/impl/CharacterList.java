package es.ies.puerto.modelo.impl;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "personajes")
public class CharacterList {
    @ElementList(inline = true)
    private List<Character> characters;

    public CharacterList() {
    }

    public CharacterList(List<Character> characters) {
        this.characters = characters;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
