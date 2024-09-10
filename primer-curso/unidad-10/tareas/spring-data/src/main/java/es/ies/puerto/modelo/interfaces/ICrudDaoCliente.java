package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;

import java.sql.SQLException;
import java.util.List;

public interface ICrudDaoCliente {
    ClienteDTO findById(int id) throws SQLException, TiendaException;
    List<ClienteDTO> findAll() throws SQLException, TiendaException;
    boolean add(ClienteDTO clienteDTO) throws TiendaException;
    boolean update(ClienteDTO clienteDTO) throws TiendaException;
    boolean delete(int id) throws TiendaException;

    public List<ClienteDTO> obtener(String query) throws SQLException, TiendaException;
}
