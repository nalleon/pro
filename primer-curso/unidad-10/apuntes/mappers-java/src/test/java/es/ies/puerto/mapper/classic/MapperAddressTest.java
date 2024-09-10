package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {
    public static final String MESSAGE_ERROR = "EXPECTED RESULT NOT FOUND";
    /**
     * @addressDTOMapper is the result of the mapper's execution
     */
    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void addressToAddressDTOTest(){
        addressDTOMapper = MapperAddress.addressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(), addressDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(addressDTO.getAddress(), addressDTOMapper.getAddress(), MESSAGE_ERROR);
        Assertions.assertEquals(addressDTO.getCountry(), addressDTOMapper.getCountry(), MESSAGE_ERROR);
        Assertions.assertEquals(addressDTO.getZipCode(), addressDTOMapper.getZipCode(), MESSAGE_ERROR);
    }

    @Test
    public void addressDTOToAddressTest(){
        addressEntityMapper = MapperAddress.addressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntity.getId(), addressEntityMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(addressEntity.getAddress(), addressEntityMapper.getAddress(), MESSAGE_ERROR);
        Assertions.assertEquals(addressEntity.getCountry(), addressEntityMapper.getCountry(), MESSAGE_ERROR);
        Assertions.assertEquals(addressEntity.getZipCode(), addressEntityMapper.getZipCode(), MESSAGE_ERROR);
    }
}
