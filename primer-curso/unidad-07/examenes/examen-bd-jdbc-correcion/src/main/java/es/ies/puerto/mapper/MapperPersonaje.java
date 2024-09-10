package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.AliasInt;
import es.ies.puerto.intercambio.PersonajeInt;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonaje {

    public static Personaje personajeIntToPersonajeEntity(PersonajeInt personajeInt){
        Personaje personaje = null;
        if (personajeInt == null){
            return null;
        }

        personaje = new Personaje();
        personaje.setId(personajeInt.getId());
        personaje.setAlias(MapperAlias.aliasIntToAliasEntity(personajeInt.getAlias()));

        return personaje;
    }

    public static PersonajeInt aliasEntityToAliasInt(Personaje personaje){
        PersonajeInt personajeInt = null;
        if (personaje == null){
            return null;
        }

        personajeInt = new PersonajeInt();
        personajeInt.setId(personaje.getId());
        personajeInt.setAlias(MapperAlias.aliasEntityToAliasInt(personaje.getAlias()));

        return personajeInt;
    }
}
