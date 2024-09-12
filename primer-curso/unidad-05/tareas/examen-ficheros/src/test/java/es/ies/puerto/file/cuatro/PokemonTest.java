package es.ies.puerto.file.cuatro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

public class PokemonTest {

    Pokemon pokemon;
    String id = "247";
    String nombre = "nombreTest";
    List<String> tipos = new ArrayList<>(Arrays.asList("test", "junit"));
    String descripcion = "esto es un test";

    @BeforeEach
    public void beforeEach(){
        pokemon = new Pokemon(id,nombre,tipos,descripcion);
    }

    @Test
    public void pokemonNotNullTest(){
        Assertions.assertNotNull(pokemon, MESSAGE_ERROR);
    }

    @Test
    public void setGetPokemonTest(){
        String nombreActualizar = "nombreActualizado";
        String descripcionActualizar = "descripcionActualizar";
        String idActualizar= "235";
        List<String> tiposActualizar = new ArrayList<>(Arrays.asList("testing", "junit5"));

        pokemon.setId(idActualizar);
        pokemon.setNombre(nombreActualizar);
        pokemon.setTipos(tiposActualizar);
        pokemon.setDescripcion(descripcionActualizar);

        Assertions.assertEquals(idActualizar, pokemon.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(nombreActualizar, pokemon.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(descripcionActualizar, pokemon.getDescripcion(), MESSAGE_ERROR);
        Assertions.assertEquals(tiposActualizar, pokemon.getTipos(), MESSAGE_ERROR);
    }

    @Test
    public void toStringPokemon(){
        Assertions.assertTrue(pokemon.toString().contains(id), MESSAGE_ERROR);
        Assertions.assertTrue(pokemon.toString().contains(nombre), MESSAGE_ERROR);
        Assertions.assertTrue(pokemon.toString().contains(descripcion), MESSAGE_ERROR);
        Assertions.assertTrue(pokemon.toString().contains(String.valueOf(tipos)), MESSAGE_ERROR);
    }


    @Test
    public void hashCodeEqualsTest(){
        Pokemon pokemonEquals= new Pokemon("247");
        Pokemon pokemonNotEquals = new Pokemon("223");
        String pokemonStr = "test";
        Assertions.assertEquals(pokemon.hashCode(),pokemonEquals.hashCode(), MESSAGE_ERROR);
        Assertions.assertEquals(pokemon,pokemonEquals, MESSAGE_ERROR);
        Assertions.assertFalse(pokemon.equals(pokemonNotEquals), MESSAGE_ERROR);
        Assertions.assertFalse(pokemon.equals(pokemonStr), MESSAGE_ERROR);

    }
}
