package es.ies.puerto.modelo.fichero.impl;

import es.ies.puerto.modelo.fichero.abstracts.FileAbstracts;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Character;
import es.ies.puerto.modelo.impl.CharacterList;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends FileAbstracts implements ICrudOperaciones {

    String path ="src/main/resources/marvel.xml";
    List<Character> characters;

    public FileXml (){
        characters = new ArrayList<>();
    }

    @Override
    public List<Character> obtainCharacters() {
        Persister serializer = new Persister();
        if (existFile(path)){
            try{
                File file = new File(path);
                CharacterList characterList = serializer.read(CharacterList.class, file);
                characters = characterList.getCharacters();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return characters;
    }

    @Override
    public Character obtainCharacter(Character character) {
        if (!characters.contains(character)){
            return null;
        }
        int position = characters.indexOf(character);
        return characters.get(position);
    }

    @Override
    public void addCharacter(Character character) {
        if (characters.contains(character)){
            return;
        }
        characters.add(character);
        updateFile(characters);
    }

    @Override
    public void deleteCharacter(Character character) {
        if (!characters.contains(character)){
            return;
        }
        characters.remove(character);
        updateFile(characters);
    }

    @Override
    public void updateCharacter(Character character) {
        if (!characters.contains(character)){
            return;
        }
        int position = characters.indexOf(character);
        characters.set(position,character);
        updateFile(characters);
    }

    private void updateFile(List<Character> characters){
        CharacterList characterList = new CharacterList(characters);
        Persister serializer = new Persister();
        try {
            serializer.write(characterList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
