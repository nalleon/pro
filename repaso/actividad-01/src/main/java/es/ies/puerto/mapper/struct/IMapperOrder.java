package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.modelo.entity.OrderEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper (uses = IMapperCustomer.class)
public interface IMapperOrder {

    IMapperOrder INSTANCE = Mappers.getMapper(IMapperOrder.class);

    public OrderDTO toDTO(OrderEntity entity);

    @Mapping(target="customerId", ignore = true)
    public OrderEntity toEntity(OrderDTO orderDTO, @Context CustomerDTO customerDTO);

    @AfterMapping
    default void setCustomerId(@MappingTarget OrderEntity entity, @Context CustomerDTO customerDTO){
    entity.setCustomerId(customerDTO.getId());
    }
}
