package es.ies.puerto.mapper;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.mapper.struct.IMapperCliente;
import es.ies.puerto.mapper.struct.IMapperPedido;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperClienteTest extends MapperHelper {
    ClienteEntity clienteEntityMapper;
    ClienteDTO clienteDTOMapper;

    @Test
    public void entityToDTOTest(){
        clienteDTOMapper = new ClienteDTO();
        clienteDTOMapper = IMapperCliente.INSTANCE.toDTO(clienteEntity);
        Assertions.assertEquals(clienteDTO.getId(), clienteDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDTO.getEmail(), clienteDTOMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDTO.getNombre(), clienteDTOMapper.getNombre(), MESSAGE_ERROR);

        clienteEntity = null;
        clienteDTOMapper = IMapperCliente.INSTANCE.toDTO(clienteEntity);

        Assertions.assertNull(clienteDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        clienteEntityMapper = IMapperCliente.INSTANCE.toEntity(clienteDTO);
        Assertions.assertEquals(clienteEntity.getId(), clienteEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteEntity.getEmail(), clienteEntityMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteEntity.getNombre(), clienteEntityMapper.getNombre(), MESSAGE_ERROR);

        clienteDTO = null;
        clienteEntityMapper = IMapperCliente.INSTANCE.toEntity(clienteDTO);

        Assertions.assertNull(clienteEntityMapper);
    }

}
