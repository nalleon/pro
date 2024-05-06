package es.ies.puerto.business;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MapperCustomer;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CustomerBusiness {
    public CustomerDTO obtainCustomer(CustomerDTO customerDTO){
        if (customerDTO == null){
            return null;
        }
        Customer customer = MapperCustomer.costumerDtoToCustomerEntity(customerDTO);
        Address address = MapperAddress.customerDTOToAdressEntity(customerDTO);

        CustomerDTO response = MapperCustomer.customerEntityToCostumerDto(customer, address);

        return response;
    }

    public CustomerDTO obtainCustomerById(Long id){
        if (id == null){
            return null;
        }
        CustomerDTO customerDTO = new CustomerDTO(id);
        return obtainCustomer(customerDTO);
    }
}
