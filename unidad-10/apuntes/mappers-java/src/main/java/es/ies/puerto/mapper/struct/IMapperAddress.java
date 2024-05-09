package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAddress {
    IMapperAddress INSTANCE = Mappers.getMapper(IMapperAddress.class);

    /**
     * @param addressDTO origin
     * @return address result
     */

    @Mapping(target = "province", source = "island")
    Address addressDTOToAddress(AddressDTO addressDTO);

    @Mapping(target = "island", source = "province")
    AddressDTO addressToAddressDTO(Address address);


}
