package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses =  IMapperPersonaje.class)
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(source = "aliasDTO.id", target = "id")
    @Mapping( source = "id", target = "personaje_id")
    Alias aliasDTOTOAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO);

    AliasDTO aliasTOAliasDTO(Alias alias);

}
