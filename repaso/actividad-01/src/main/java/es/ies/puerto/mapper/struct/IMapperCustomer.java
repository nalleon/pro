package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.modelo.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperCustomer {

    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);

    public CustomerDTO toDTO(CustomerEntity entity);
    public CustomerEntity toEntity(CustomerDTO dto);
}
