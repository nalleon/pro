package es.ies.puerto.mapper;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.struct.IMapperCustomer;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperCustomerTest extends MapperHelper {
    CustomerEntity customerEntityMapper;
    CustomerDTO customerDTOMapper;

    @Test
    public void entityToDTOTest(){
        customerDTOMapper = new CustomerDTO();
        customerDTOMapper = IMapperCustomer.INSTANCE.toDTO(customerEntity);
        Assertions.assertEquals(customerDTO.getId(), customerDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(customerDTO.getEmail(), customerDTOMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(customerDTO.getName(), customerDTOMapper.getName(), MESSAGE_ERROR);

        customerEntity = null;
        customerDTOMapper = IMapperCustomer.INSTANCE.toDTO(customerEntity);

        Assertions.assertNull(customerDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        customerEntityMapper = IMapperCustomer.INSTANCE.toEntity(customerDTO);
        Assertions.assertEquals(customerEntity.getId(), customerEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(customerEntity.getEmail(), customerEntityMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(customerEntity.getName(), customerEntityMapper.getName(), MESSAGE_ERROR);

        customerDTO = null;
        customerEntityMapper = IMapperCustomer.INSTANCE.toEntity(customerDTO);

        Assertions.assertNull(customerEntityMapper);
    }

}
