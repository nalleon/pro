package es.ies.puerto.mappers.struct;

import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.mappers.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPersonajeTest extends MappersHelp {
    PersonajeDTO personajeDTOMapper;
    Personaje personajeEntityMapper;
    @Test
    public void personajeToPersonajeDTOTest() {
        personajeDTOMapper = IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(personajeEntity);
        Assertions.assertEquals(personajeDTO.getId(), personajeDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getNombre(), personajeDTOMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getGenero(), personajeDTOMapper.getGenero(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getAlias(), personajeDTOMapper.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getEquipamientos(), personajeDTOMapper.getEquipamientos(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getPoderes(), personajeDTOMapper.getPoderes(), MESSAGE_ERROR);

    }

    @Test
    public void personajeDTOToPersonajeTest() {
        personajeEntityMapper =IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO);
        Assertions.assertEquals(personajeEntity.getId(), personajeEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeEntity.getNombre(), personajeEntityMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeEntity.getGenero(), personajeEntityMapper.getGenero(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeEntity.getAlias(), personajeEntityMapper.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeEntity.getEquipamientos(), personajeEntityMapper.getEquipamientos(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeEntity.getPoderes(), personajeEntityMapper.getPoderes(), MESSAGE_ERROR);
    }
}
