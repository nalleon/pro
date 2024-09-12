package es.ies.puerto.file.cuatro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokedexTest {
    Pokedex pokedex;
    Pokemon pokemon;
    String id = "247";
    String nombre = "nombreTest";
    List<String> tipos = new ArrayList<>(Arrays.asList("test", "junit"));
    String descripcion = "esto es un test";

    @BeforeEach
    public void beforeEach(){
        pokedex = new Pokedex();
        pokemon = new Pokemon(id,nombre,tipos,descripcion);
    }

    @Test
    public void getSetTest(){
        List<Pokemon> setPokemons = new ArrayList<>();
        setPokemons.add(pokemon);
        pokedex.setPokemons(setPokemons);

        Assertions.assertEquals(setPokemons, pokedex.getPokemons(), "Expected result not found");
    }
    @Test
    public void characterToXml() {
        Persister serializer = new Persister();
        try {
            serializer.write(pokemon, new File("src/test/resources/pokedex.xml"));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}
