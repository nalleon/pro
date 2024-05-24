package es.ies.puerto.mappers.classic;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

public class MapperEquipamiento {
    public static EquipamientoDTO equipamientoToEquipamientoDTO(Equipamiento equipamiento){
        if (equipamiento == null){
            return null;
        }
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(equipamiento.getId());
        equipamientoDTO.setNombre(equipamiento.getNombre());
        equipamientoDTO.setDescripcion(equipamiento.getDescripcion());
        return equipamientoDTO;
    }

    public static Equipamiento equipamientoDTOToEquipamiento(EquipamientoDTO equipamientoDTO){
        if (equipamientoDTO == null){
            return null;
        }
        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDTO.getId());
        equipamiento.setNombre(equipamientoDTO.getNombre());
        equipamiento.setDescripcion(equipamientoDTO.getDescripcion());
        return equipamiento;
    }

    public static Equipamiento relateEquipamientoPersonaje(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO){
        if (equipamientoDTO == null){
            return null;
        }
        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDTO.getId());
        equipamiento.setNombre(equipamientoDTO.getNombre());
        equipamiento.setDescripcion(equipamientoDTO.getDescripcion());
        equipamiento.setPersonaje_id(personajeDTO.getId());
        return equipamiento;
    }
}
