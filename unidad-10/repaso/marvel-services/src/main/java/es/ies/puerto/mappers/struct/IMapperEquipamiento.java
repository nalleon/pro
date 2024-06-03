package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
@Mapper(uses = IMapperPersonaje.class)
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);

    @Mapping(target = "id", source = "equipamientoDTO.id")
    @Mapping(target = "personaje_id", ignore = true)
    Equipamiento equipamientoDTOToEquipamiento(EquipamientoDTO equipamientoDTO,
                                               @Context PersonajeDTO personajeDTO);

    @AfterMapping
    default void setPersonajeId(@MappingTarget Equipamiento equipamiento, @Context PersonajeDTO personajeDTO) {
        equipamiento.setPersonaje_id(personajeDTO.getId());
    }

    EquipamientoDTO equipamientoToEquipamientoDTO(Equipamiento equipamiento);


}
