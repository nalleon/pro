package es.ies.puerto.mappers.classic;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.mappers.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperEquipamientoTest extends MappersHelp {
    EquipamientoDTO equipamientoDTOMapper;
    Equipamiento equipamientoEntityMapper;

    @Test
    public void equipamientoToEquipamientoDTOTest() {
        equipamientoDTOMapper = MapperEquipamiento.equipamientoToEquipamientoDTO(equipamientoEntity);
        Assertions.assertEquals(equipamientoDTO.getId(), equipamientoDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamientoDTO.getNombre(), equipamientoDTOMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamientoDTO.getDescripcion(), equipamientoDTOMapper.getDescripcion(), MESSAGE_ERROR);

    }

    @Test
    public void equipamientoDTOToEquipamientoTest() {
        equipamientoEntityMapper = MapperEquipamiento.equipamientoDTOToEquipamiento(equipamientoDTO);
        Assertions.assertEquals(equipamientoEntity.getId(), equipamientoEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamientoEntity.getNombre(), equipamientoEntityMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamientoEntity.getDescripcion(), equipamientoEntityMapper.getDescripcion(), MESSAGE_ERROR);
    }
}
