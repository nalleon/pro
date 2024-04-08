package es.ies.puerto.model.file.impl;
import es.ies.puerto.model.file.abstracts.FileAbstracts;
import es.ies.puerto.model.file.interfaces.ICrudOperaciones;
import es.ies.puerto.model.impl.Character;

import java.io.*;
import java.util.*;


public class FileCsv extends FileAbstracts implements ICrudOperaciones {
    String path = "src/main/resources/marvel.csv";
    List<Character> characters;

    @Override
    public List<Character> obtainCharacters() {
       characters = new ArrayList<>();
       if (existFile(path)){
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
       }
        return characters;
    }

    public Character splitCharacter(String [] data){
        Set<String> powers = new HashSet<>();
        for(int i=3; i< data.length;i++){
            powers.add(data[i].trim());
        }
        return new Character(data[1], data[0], data[2], powers);
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
        if (!characters.contains(character)) {
            characters.add(character);
            updateFile(characters);
        }

    }

    @Override
    public void deleteCharacter(Character character) {
        if (characters.remove(character)) {
            updateFile(characters);
        }
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

    @Override
    public void updateFile(List<Character> characters){
        try (FileWriter writer = new FileWriter(path)){
            for (Character characterFile : characters){
                writer.write(characterFile.toCsv()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
