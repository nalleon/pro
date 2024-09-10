package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper(uses = IMapperAddress.class)
public interface IMapperCustomer {
    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);
    Customer costumerDtoToCustomerEntity(CustomerDTO customerDTO);
    CustomerDTO customerEntityToCostumerDto(Customer customer);
}
