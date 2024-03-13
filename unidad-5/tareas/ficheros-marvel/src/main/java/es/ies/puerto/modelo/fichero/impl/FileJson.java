package es.ies.puerto.modelo.fichero.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.fichero.abstracts.FileAbstracts;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Character;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends FileAbstracts implements ICrudOperaciones {
    String path ="src/main/resources/marvel.json";
    List<Character> characters;

    public FileJson(){
        characters = new ArrayList<>();
    }
    @Override
    public List<Character> obtainCharacters() {
        if (existFile(path)){
            try{
                String json = new String(Files.readAllBytes(Paths.get(path)));
                Type listType = new TypeToken<ArrayList<Character>>(){}.getType();
                characters = new Gson().fromJson(json,listType);

            } catch (IOException e) {
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
        characters.set(position, character);
        updateFile(characters);
    }

    @Override
    public void updateFile(List<Character> characters){
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(characters, writer);
        } catch (IOException e) {
            System.err.println("Error while saving data: " + e.getMessage());
        }
    }
}
