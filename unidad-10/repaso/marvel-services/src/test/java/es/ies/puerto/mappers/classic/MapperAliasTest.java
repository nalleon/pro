package es.ies.puerto.mappers.classic;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.mappers.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAliasTest extends MappersHelp {
    AliasDTO aliasDTOMapper;
    Alias aliasEntityMapper;

    @Test
    public void aliasToAliasDTOTest() {
        aliasDTOMapper = MapperAlias.aliasToAliasDTO(aliasEntity);
        Assertions.assertEquals(aliasDTO.getId(), aliasDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasDTO.getDescripcion(), aliasDTOMapper.getDescripcion(), MESSAGE_ERROR);

    }

    @Test
    public void aliasDTOToAliasTest() {
        aliasEntityMapper = MapperAlias.aliasDTOToAlias(aliasDTO);
        Assertions.assertEquals(aliasEntity.getId(), aliasEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasEntity.getDescripcion(), aliasEntityMapper.getDescripcion(), MESSAGE_ERROR);
    }
}
