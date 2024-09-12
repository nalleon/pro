package es.ies.puerto.file.cuatro;

import es.ies.puerto.file.abstracts.FileAbstracts;
import es.ies.puerto.file.dos.Anime;
import es.ies.puerto.file.uno.FileXmlCriatura;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilePokedexXml extends FileAbstracts {
    List<Pokemon> pokemonList;
    List<Pokemon> pokemonListBackUp;

    public FilePokedexXml (){
        pokemonList = new ArrayList<>();
        pokemonListBackUp = obtenerPokemons();
    }

    public List<Pokemon> obtenerPokemons() {
        pokemonList = new ArrayList<>();
        if (!fileExists(pathCuatro)){
            return pokemonList;
        }

        Persister serializer = new Persister();
        try{
            Pokedex pokedex = serializer.read(Pokedex.class, new File(pathCuatro));
            pokemonList = pokedex.getPokemons();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return pokemonList;
    }
    public Pokemon obtenerPokemon(Pokemon pokemon) {
        if (!pokemonList.contains(pokemon)){
            return null;
        }
        return pokemonList.get(pokemonList.indexOf(pokemon));
    }
    public void addPokemon(Pokemon pokemon) {
        if (!pokemonList.contains(pokemon)){
            pokemonList.add(pokemon);
            saveFile(pokemonList);
        }
    }
    public void deletePokemon(Pokemon pokemon) {
        if (pokemonList.remove(pokemon)){
            saveFile(pokemonList);
        }
    }
    public void updatePokemon(Pokemon pokemon) {
        if(!pokemonList.contains(pokemon)){
            return;
        }
        int position = pokemonList.indexOf(pokemon);
        pokemonList.set(position, pokemon);
        saveFile(pokemonList);
    }

    public void saveFile(List<Pokemon> pokemons) {
        Pokedex pokedex = new Pokedex(pokemons);
        Persister serializer = new Persister();
        try {
            serializer.write(pokedex, new File(pathCuatro));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to load a backUp of the file
     */
    public void loadBackUp(){
        saveFile(pokemonListBackUp);
    }
}
