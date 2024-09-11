package es.ies.puerto.mapper;

import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.mapper.struct.IMapperOrder;
import es.ies.puerto.modelo.entity.OrderEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperOrderTest extends MapperHelper {
    OrderEntity orderEntityMapper;
    OrderDTO orderDTOMapper;

    @Test
    public void entityToDTOTest(){
        orderDTOMapper = IMapperOrder.INSTANCE.toDTO(orderEntity);
        Assertions.assertEquals(orderDTO.getId(), orderDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(orderDTO.getProduct(), orderDTOMapper.getProduct(), MESSAGE_ERROR);
        Assertions.assertEquals(orderDTO.getQuantity(), orderDTOMapper.getQuantity(), MESSAGE_ERROR);

        orderEntity = null;
        orderDTOMapper = IMapperOrder.INSTANCE.toDTO(orderEntity);

        Assertions.assertNull(orderDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        orderEntityMapper = IMapperOrder.INSTANCE.toEntity(orderDTO, customerDTO);
        Assertions.assertEquals(orderEntity.getId(), orderEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(orderEntity.getCustomerId(), orderEntityMapper.getCustomerId(), MESSAGE_ERROR);
        Assertions.assertEquals(orderEntity.getProduct(), orderEntityMapper.getProduct(), MESSAGE_ERROR);
        Assertions.assertEquals(orderEntity.getQuantity(), orderEntityMapper.getQuantity(), MESSAGE_ERROR);

        orderDTO = null;
        customerDTO = null;
        orderEntityMapper = IMapperOrder.INSTANCE.toEntity(orderDTO, customerDTO);

        Assertions.assertNull(orderEntityMapper);
    }
}
