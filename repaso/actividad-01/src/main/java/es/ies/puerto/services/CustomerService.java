package es.ies.puerto.services;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.exception.ShopException;
import es.ies.puerto.modelo.impl.CustomerDao;
import es.ies.puerto.services.interfaces.ICustomerService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/customer")
@Consumes("application/json")
@Produces("application/json")
public class CustomerService implements ICustomerService <CustomerDTO> {
    private CustomerDao dao;

    /**
     * Default constructor of the class
     * @throws ShopException
     */
    public CustomerService() throws ShopException {
        dao = new CustomerDao();
    }

    /**
     * Constructor of the class
     * @param dao of the customers
     */
    public CustomerService(CustomerDao dao) {
        this.dao = dao;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(String id) throws ShopException, SQLException {
        if (dao.findById(Integer.parseInt(id)) == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(dao.findById(Integer.parseInt(id))).build();
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws ShopException, SQLException {
        return Response.ok(dao.findAllObjects()).build();
    }

    @POST
    @Override
    public Response addObject(CustomerDTO customerDTO) throws ShopException, SQLException {
       boolean result = dao.addObject(customerDTO);
       if (result){
           return Response.status(Response.Status.CREATED).build();
       }
        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @PATCH
    @Override
    public Response updateObject(CustomerDTO customerDTO) throws ShopException {
        boolean result = dao.updateObject(customerDTO);
        if (result){
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();    }

    @DELETE
    @Override
    public Response deleteObjectById(String id) throws ShopException {
        boolean result = dao.removeObject(Integer.parseInt(id));
        if (result){
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
