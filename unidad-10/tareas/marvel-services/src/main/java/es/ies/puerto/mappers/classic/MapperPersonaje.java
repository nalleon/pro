package es.ies.puerto.mappers.classic;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.util.HashSet;
import java.util.Set;

public class MapperPersonaje {

    public static PersonajeDTO personajeToPersonajeDTO(Personaje personaje){
        if (personaje == null){
            return null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setGenero(personaje.getGenero());

        if (personaje.getPoderes() != null){
            Set<PoderDTO> list = new HashSet<>();
            for (Poder poder: personaje.getPoderes()){
                list.add(MapperPoder.poderToPoderDTO(poder));

            }
            personajeDTO.setPoderes(list);
        }

        if (personajeDTO.getEquipamientos() != null){
            Set<EquipamientoDTO> list = new HashSet<>();
            for (Equipamiento equipamiento : personaje.getEquipamientos()){
                list.add(MapperEquipamiento.equipamientoToEquipamientoDTO(equipamiento));

            }
            personajeDTO.setEquipamientos(list);
        }
        personajeDTO.setAlias(personaje.getAlias());

        return personajeDTO;
    }

    public static Personaje personajeDTOToPersonaje(PersonajeDTO personajeDTO){
        if (personajeDTO == null){
            return null;
        }

        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setGenero(personajeDTO.getGenero());
        if (personajeDTO.getPoderes() != null){
            Set<Poder> list = new HashSet<>();
            for (PoderDTO poderDTO : personajeDTO.getPoderes()){
                list.add(MapperPoder.poderDTOToPoder(poderDTO));

            }
            personaje.setPoderes(list);
        }

        if (personajeDTO.getEquipamientos() != null){
            Set<Equipamiento> list = new HashSet<>();
            for (EquipamientoDTO equipamiento : personajeDTO.getEquipamientos()){
                list.add(MapperEquipamiento.equipamientoDTOToEquipamiento(equipamiento));

            }
            personaje.setEquipamientos(list);
        }

        personaje.setAlias(personajeDTO.getAlias());

        return personaje;
    }
}
