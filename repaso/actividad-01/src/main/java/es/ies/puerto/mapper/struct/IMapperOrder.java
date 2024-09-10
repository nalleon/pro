package es.ies.puerto.mapper.struct;

import org.mapstruct.*;

@Mapper (uses = IMapperCustomer.class)
public interface IMapperPedido {


    //@Mapping(target="clienteId", ignore = true)
   // public PedidoEntity toEntity(PedidoDTO pedidoDTO, @Context ClienteDTO clienteDTO);

   // @AfterMapping
    //default  void setClienteId(@MappingTarget PedidoEntity pedido, @Context ClienteDTO clienteDTO){
    //  pedido.setClienteId(clienteDTO.getId());
    //}
}
