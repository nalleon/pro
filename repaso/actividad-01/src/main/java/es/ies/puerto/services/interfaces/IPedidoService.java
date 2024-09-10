package es.ies.puerto.services.interfaces;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

public interface IPedidoService {
    Response getObjectById(@PathParam("id") String id) throws TiendaException, SQLException;
    public Response getAll() throws TiendaException, SQLException;
    public Response addObject(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException;
    public Response updateObject(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException;
    public Response deleteObjectById(@PathParam("id") String id) throws TiendaException;
}
