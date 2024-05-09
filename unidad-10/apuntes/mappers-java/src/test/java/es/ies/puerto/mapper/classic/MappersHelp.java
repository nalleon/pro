package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.junit.jupiter.api.BeforeEach;

public class MappersHelp {
    public static final String ADDRESS = "My address";
    public static final String COUNTRY = "My country";
    public static final String ZIP_CODE = "My zipCode";
    public static final long ID = 1L;
    public static final String PROVINCE_ISLAND = "San Borondon";
    public static final String FIRSTNAME = "firstnameTest";
    public static final String LASTNAME = "lastnameTest";
    public static final String PASSWORD = "123456WS";
    public Address addressEntity;
    public AddressDTO addressDTO;
    public Customer customerEntity;
    public CustomerDTO customerDTO;

    @BeforeEach
    public void beforeEach(){
        addressDTO = new AddressDTO();
        addressDTO.setId(ID);
        addressDTO.setAddress(ADDRESS);
        addressDTO.setCountry(COUNTRY);
        addressDTO.setZipCode(ZIP_CODE);
        addressDTO.setIsland(PROVINCE_ISLAND);

        addressEntity = new Address();
        addressEntity.setId(ID);
        addressEntity.setAddress(ADDRESS);
        addressEntity.setCountry(COUNTRY);
        addressEntity.setZipCode(ZIP_CODE);
        addressEntity.setProvince(PROVINCE_ISLAND);

        customerEntity = new Customer();
        customerEntity.setId(ID);
        customerEntity.setFirstname(FIRSTNAME);
        customerEntity.setLastname(LASTNAME);
        customerEntity.setPassword(PASSWORD);


        customerDTO = new CustomerDTO();
        customerDTO.setId(ID);
    }
}
