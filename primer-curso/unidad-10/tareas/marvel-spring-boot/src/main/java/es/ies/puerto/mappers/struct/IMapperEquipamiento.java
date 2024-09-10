package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses =  IMapperPersonaje.class)
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);

    @Mapping(source = "equipamientoDTO.id", target = "id")
    @Mapping(source = "equipamientoDTO.nombre", target = "nombre")
    @Mapping(source = "id", target = "personaje_id")
    Equipamiento equipamientoDTOTOEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO);

    EquipamientoDTO equipamientoTOEquipamientoDTO(Equipamiento equipamiento);
}