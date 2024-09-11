package es.ies.puerto.services.interfaces;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.exception.ShopException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

public interface IOrderService <T>{
    Response getObjectById(@PathParam("id") String id) throws ShopException, SQLException;
    public Response getAll() throws ShopException, SQLException;
    public Response addObject(T t, CustomerDTO customerDTO) throws ShopException;
    public Response updateObject(T t, CustomerDTO customerDTO) throws ShopException;
    public Response deleteObjectById(@PathParam("id") String id) throws ShopException;
}
