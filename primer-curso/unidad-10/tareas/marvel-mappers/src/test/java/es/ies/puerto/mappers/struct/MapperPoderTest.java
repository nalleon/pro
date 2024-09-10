package es.ies.puerto.mappers.struct;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.mappers.MappersHelp;
import es.ies.puerto.mappers.classic.MapperPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPoderTest extends MappersHelp {
    PoderDTO poderDTOMappper;
    Poder poderEntityMapper;

     @Test
     public void poderToPoderDTOTest() {
        poderDTOMappper = IMapperPoder.INSTANCE.poderToPoderDTO(poderEntity);
        Assertions.assertEquals(poderDTO.getId(), poderDTOMappper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(poderDTO.getNombre(), poderDTOMappper.getNombre(), MESSAGE_ERROR);

    }

    @Test
    public void poderDTOToPoderTest() {
        poderEntityMapper = IMapperPoder.INSTANCE.poderDTOToPoder(poderDTO);
        Assertions.assertEquals(poderEntity.getId(), poderEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(poderEntity.getNombre(), poderEntityMapper.getNombre(), MESSAGE_ERROR);
    }
}
