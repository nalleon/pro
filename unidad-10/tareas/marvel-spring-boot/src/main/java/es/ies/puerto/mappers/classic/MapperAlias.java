package es.ies.puerto.mappers.classic;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAlias {
    public static AliasDTO aliasToAliasDTO(Alias alias){
        if (alias == null){
            return null;
        }
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setDescripcion(alias.getDescripcion());

        return aliasDTO;
    }

    public static Alias aliasDTOToAlias(AliasDTO aliasDTO){
        if (aliasDTO == null){
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());

        return alias;
    }

    public static Alias aliasRelatePersonaje(AliasDTO aliasDTO, PersonajeDTO personajeDTO){
        if (aliasDTO == null){
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());
        alias.setPersonaje_id(personajeDTO.getId());
        return alias;
    }
}
