package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperCliente {
    IMapperCliente INSTANCE = Mappers.getMapper(IMapperCliente.class);
    public ClienteDTO toDTO(ClienteEntity clienteEntity);

    public ClienteEntity toEntity(ClienteDTO clienteDTO);
}
