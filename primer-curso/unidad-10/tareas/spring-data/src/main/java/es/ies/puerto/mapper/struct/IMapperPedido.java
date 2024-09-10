package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.PedidoEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper (uses = IMapperCliente.class)
public interface IMapperPedido {
    IMapperPedido INSTANCE = Mappers.getMapper(IMapperPedido.class);

    public PedidoDTO toDTO(PedidoEntity pedido);

    @Mapping(target="clienteId", ignore = true)
    public PedidoEntity toEntity(PedidoDTO pedidoDTO, @Context ClienteDTO clienteDTO);

    @AfterMapping
    default  void setClienteId(@MappingTarget PedidoEntity pedido, @Context ClienteDTO clienteDTO){
        pedido.setClienteId(clienteDTO.getId());
    }
}
