package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses =  IMapperPersonaje.class)
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);

    @Mapping(target = "personaje_id", source = "id")
    Poder poderDTOTOpoder(PoderDTO poderDTO, PersonajeDTO personajeDTO);

    PoderDTO poderTOpoderDTO(Poder poder);

}
