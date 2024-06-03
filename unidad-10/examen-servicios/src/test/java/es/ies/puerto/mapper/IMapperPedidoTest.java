package es.ies.puerto.mapper;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.mapper.struct.IMapperCliente;
import es.ies.puerto.mapper.struct.IMapperPedido;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.utilities.MapperHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperPedidoTest extends MapperHelper {
    PedidoEntity pedidoEntityMapper;
    PedidoDTO pedidoDTOMapper;

    @Test
    public void entityToDTOTest(){
        pedidoDTOMapper = IMapperPedido.INSTANCE.toDTO(pedido);
        Assertions.assertEquals(pedidoDTO.getId(), pedidoDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(pedidoDTO.getProducto(), pedidoDTOMapper.getProducto(), MESSAGE_ERROR);
        Assertions.assertEquals(pedidoDTO.getCantidad(), pedidoDTOMapper.getCantidad(), MESSAGE_ERROR);

        pedido = null;
        pedidoDTOMapper = IMapperPedido.INSTANCE.toDTO(pedido);

        Assertions.assertNull(pedidoDTOMapper);
    }

    @Test
    public void dtoToEntityTest(){
        pedidoEntityMapper = IMapperPedido.INSTANCE.toEntity(pedidoDTO, clienteDTO);
        Assertions.assertEquals(pedido.getId(), pedidoEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getClienteId(), pedidoEntityMapper.getClienteId(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getProducto(), pedidoEntityMapper.getProducto(), MESSAGE_ERROR);
        Assertions.assertEquals(pedido.getCantidad(), pedidoEntityMapper.getCantidad(), MESSAGE_ERROR);

        pedidoDTO = null;
        clienteDTO = null;
        pedidoEntityMapper = IMapperPedido.INSTANCE.toEntity(pedidoDTO, clienteDTO);

        Assertions.assertNull(pedidoEntityMapper);
    }
}
