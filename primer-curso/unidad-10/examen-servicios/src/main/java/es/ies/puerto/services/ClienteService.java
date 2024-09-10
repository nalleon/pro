package es.ies.puerto.services;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.impl.ClienteDAO;
import es.ies.puerto.services.interfaces.IClienteService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/cliente")
@Consumes("application/json")
@Produces("application/json")
public class ClienteService implements IClienteService {

    private ClienteDAO clienteDAO;

    public ClienteService() throws TiendaException {
        clienteDAO = new ClienteDAO();
    }

    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }


    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws TiendaException, SQLException {

        if (clienteDAO.findById(Integer.parseInt(id)) == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(clienteDAO.findById(Integer.parseInt(id))).build();
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws TiendaException, SQLException {
        return Response.ok(clienteDAO.findAll()).build();
    }

    @POST
    @Override
    public Response addObject(ClienteDTO clienteDTO) throws TiendaException, SQLException {
        boolean resultado = clienteDAO.add(clienteDTO);
            if (resultado){
                return Response.status(Response.Status.CREATED).build();
            }
            return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @POST
    @Override
    public Response updateObject(ClienteDTO clienteDTO) throws TiendaException {
        boolean resultado = clienteDAO.update(clienteDTO);
        if (resultado){
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id")String id) throws TiendaException {
        boolean resultado = clienteDAO.delete(Integer.parseInt(id));
        if (resultado){
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
