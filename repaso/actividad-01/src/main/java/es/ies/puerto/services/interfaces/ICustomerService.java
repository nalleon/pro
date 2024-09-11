package es.ies.puerto.services.interfaces;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.exception.ShopException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

public interface ICustomerService <T>{
    Response getObjectById(@PathParam("id") String id) throws ShopException, SQLException;
    public Response getAll() throws ShopException, SQLException;
    public Response addObject(T t) throws ShopException, SQLException;
    public Response updateObject(T t) throws ShopException;
    public Response deleteObjectById(@PathParam("id") String id) throws ShopException;
}
