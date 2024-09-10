package es.ies.puerto.mapper;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.struct.IMapperCliente;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperClienteTest extends MapperHelper {
    CustomerEntity customerEntityMapper;
    CustomerDTO customerDTOMapper;

    @Test
    public void entityToDTOTest(){
        customerDTOMapper = new CustomerDTO();
        customerDTOMapper = IMapperCliente.INSTANCE.toDTO(customerEntity);
        Assertions.assertEquals(customerDTO.getId(), customerDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(customerDTO.getEmail(), customerDTOMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(customerDTO.getNombre(), customerDTOMapper.getNombre(), MESSAGE_ERROR);

        customerEntity = null;
        customerDTOMapper = IMapperCliente.INSTANCE.toDTO(customerEntity);

        Assertions.assertNull(customerDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        customerEntityMapper = IMapperCliente.INSTANCE.toEntity(customerDTO);
        Assertions.assertEquals(customerEntity.getId(), customerEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(customerEntity.getEmail(), customerEntityMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(customerEntity.getNombre(), customerEntityMapper.getNombre(), MESSAGE_ERROR);

        customerDTO = null;
        customerEntityMapper = IMapperCliente.INSTANCE.toEntity(customerDTO);

        Assertions.assertNull(customerEntityMapper);
    }

}
