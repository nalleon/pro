package es.ies.puerto.modelo.fichero.impl;

import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Character;
import es.ies.puerto.modelo.utilidades.Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCsv extends Utilities implements ICrudOperaciones {
    String path = "src/main/resources/marvel.csv";
    List<Character> characters;

    public FileCsv (){
        characters = new ArrayList<>();
    }
    @Override
    public List<Character> obtainCharacters() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String str;
            while ((str = br.readLine()) != null){
                String [] data = str.split(DELIMITER);
                Character character = splitCharacter(data);
                characters.add(character);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return characters;
    }

    public Character splitCharacter(String [] data){
        Set<String> powers = new HashSet<>();
        Character character = new Character(data[1], data[0], data[2], powers);
        for(int i=3; i< data.length;i++){
            powers.add(data[i].trim());
        }
        return character;
    }
    @Override
    public Character obtainCharacter(Character character) {
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String str;
            while ((str = br.readLine()) != null){
                String [] data = str.split(DELIMITER);
                String alias = data[1];
                if (alias == character.getAlias()){
                    String name = data[0];
                    String gender = data[2];
                    Set<String> powers =new HashSet<>(Arrays.asList(data[3].split(", ")));
                    character.setName(name);
                    character.setGender(gender);
                    character.setPowers(powers);
                    found = true;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return character;
    }

    @Override
    public void addCharacter(Character character) {
        Character characterFind = new Character(character.getAlias());
        characterFind = obtainCharacter(character);

        if (characterFind.getPowers() == null){
            try (FileWriter writer = new FileWriter(path, true)){
                writer.write(character.toCsv()+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void deleteCharacter(Character character) {
        characters.remove(character);
        try (FileWriter writer = new FileWriter(path)){
            for (Character characterFile : characters){
                writer.write(characterFile.toCsv()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCharacter(Character character) {
        try(FileWriter writer = new FileWriter(path)){
            for (Character characterFile : characters){
                if (characterFile.equals(character)){
                    writer.write(character.toCsv()+"\n");
                } else {
                    writer.write(characterFile.toCsv()+"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
