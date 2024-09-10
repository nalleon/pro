package es.ies.puerto.mapper;

import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.mapper.struct.IMapperPedido;
import es.ies.puerto.modelo.entity.OrderEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperPedidoTest extends MapperHelper {
    OrderEntity orderEntityMapper;
    OrderDTO orderDTOMapper;

    @Test
    public void entityToDTOTest(){
        orderDTOMapper = IMapperPedido.INSTANCE.toDTO(pedido);
        Assertions.assertEquals(orderDTO.getId(), orderDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(orderDTO.getProducto(), orderDTOMapper.getProducto(), MESSAGE_ERROR);
        Assertions.assertEquals(orderDTO.getCantidad(), orderDTOMapper.getCantidad(), MESSAGE_ERROR);

        pedido = null;
        orderDTOMapper = IMapperPedido.INSTANCE.toDTO(pedido);

        Assertions.assertNull(orderDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        orderEntityMapper = IMapperPedido.INSTANCE.toEntity(orderDTO, customerDTO);
        Assertions.assertEquals(pedido.getId(), orderEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getClienteId(), orderEntityMapper.getClienteId(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getProducto(), orderEntityMapper.getProducto(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getCantidad(), orderEntityMapper.getCantidad(), MESSAGE_ERROR);

        orderDTO = null;
        customerDTO = null;
        orderEntityMapper = IMapperPedido.INSTANCE.toEntity(orderDTO, customerDTO);

        Assertions.assertNull(orderEntityMapper);
    }
}
