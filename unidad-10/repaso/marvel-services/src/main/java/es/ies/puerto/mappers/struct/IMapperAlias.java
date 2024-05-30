package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(uses = IMapperPersonaje.class)
public interface IMapperAlias {


    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(target = "personaje_id", ignore = true)
    Alias aliasDTOToAlias(AliasDTO aliasDTO, @Context PersonajeDTO personajeDTO);

    @AfterMapping
    default void setPersonajeId(@MappingTarget Alias alias, @Context PersonajeDTO personajeDTO) {
        alias.setPersonaje_id(personajeDTO.getId());
    }

    AliasDTO aliasToAliasDTO(Alias alias);
}
