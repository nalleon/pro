package es.ies.puerto.services;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.modelo.impl.PedidoDAO;
import es.ies.puerto.services.interfaces.IPedidoService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/pedido")
@Consumes("application/json")
@Produces("application/json")
public class PedidoService implements IPedidoService {
    private PedidoDAO pedidoDAO;

    public PedidoService() throws TiendaException {
        pedidoDAO = new PedidoDAO();
    }

    public PedidoService(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }


    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id")String id) throws TiendaException, SQLException {
        PedidoDTO pedidoDTO = pedidoDAO.findById(Integer.parseInt(id));
        if (pedidoDTO == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(pedidoDTO).build();
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws TiendaException, SQLException {
        return Response.ok(pedidoDAO.findAll()).build();
    }

    @POST
    @Override
    public Response addObject(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException {
        boolean resultado = pedidoDAO.add(pedidoDTO, clienteDTO);
        if (resultado){
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @POST
    @Override
    public Response updateObject(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException {
        boolean resultado = pedidoDAO.update(pedidoDTO, clienteDTO);
        if (resultado){
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id")String id) throws TiendaException {
        boolean resultado = pedidoDAO.delete(Integer.parseInt(id));
        if (resultado){
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
