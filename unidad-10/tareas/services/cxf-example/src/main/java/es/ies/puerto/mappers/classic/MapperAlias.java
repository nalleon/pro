package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAlias {
    public static AliasDTO aliasToAliasDTO(Alias alias){
        if (alias == null){
            return null;
        }
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setDescripcion(alias.getDescripcion());
        aliasDTO.setPersonaje_id(alias.getPersonaje_id());

        return aliasDTO;
    }

    public static Alias aliasDTOToAlias(AliasDTO aliasDTO){
        if (aliasDTO == null){
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());
        alias.setPersonaje_id(aliasDTO.getPersonaje_id());
        return alias;
    }

    public static PersonajeDTO aliasToPersonajeDTO(Alias alias) {
        if (alias == null) {
            return null;
        }

        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(alias.getPersonaje_id());
        personajeDTO.setAlias(alias);

        return personajeDTO;
    }

    public static Alias personajeDTOToAlias(PersonajeDTO personajeDTO) {
        if (personajeDTO == null) {
            return null;
        }

        Alias alias = new Alias();
        alias.setId(personajeDTO.getAlias().getId());
        alias.setDescripcion(personajeDTO.getAlias().getDescripcion());
        alias.setPersonaje_id(personajeDTO.getId());

        return alias;
    }
}
