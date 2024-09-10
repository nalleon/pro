package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;

import java.sql.SQLException;
import java.util.List;

public interface ICrudDaoPedidos {
    PedidoDTO findById(int id) throws SQLException, TiendaException;
    List<PedidoDTO> findAll() throws SQLException, TiendaException;
    boolean add(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException;
    boolean update(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException;
    boolean delete(int id) throws TiendaException;

    public List<PedidoDTO> obtener(String query) throws SQLException, TiendaException;
}
