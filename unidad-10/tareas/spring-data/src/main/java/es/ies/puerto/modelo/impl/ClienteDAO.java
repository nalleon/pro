package es.ies.puerto.modelo.impl;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.mapper.struct.IMapperCliente;
import es.ies.puerto.modelo.abstractas.DaoAbstracts;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.interfaces.ICrudDaoCliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends DaoAbstracts implements ICrudDaoCliente {
    public ClienteDAO() throws TiendaException {
        super();
    }

    @Override
    public ClienteDTO findById(int id) throws SQLException, TiendaException {
        String query = "SELECT c.id, c.nombre, c.email " +
                       "FROM Cliente AS c " +
                       "WHERE c.id="+id;

        List<ClienteDTO> clienteDTOList = obtener(query);
        if (clienteDTOList.isEmpty()){
            return null;
        }

        return clienteDTOList.get(0);
    }

    @Override
    public List<ClienteDTO> findAll() throws SQLException, TiendaException {
        String query = "SELECT c.id, c.nombre, c.email FROM Cliente AS c";
        return obtener(query);
    }

    @Override
    public boolean add(ClienteDTO clienteDTO) throws TiendaException {
        ClienteEntity clienteEntity = IMapperCliente.INSTANCE.toEntity(clienteDTO);
        String query = "INSERT INTO Cliente (id, nombre, email) VALUES " +
                       "("+clienteEntity.getId()+", '"+clienteEntity.getNombre()+"', '"+clienteEntity.getEmail()+"')";
        return actualizar(query);
    }

    @Override
    public boolean update(ClienteDTO clienteDTO) throws TiendaException {
        ClienteEntity clienteEntity = IMapperCliente.INSTANCE.toEntity(clienteDTO);
        String query = "UPDATE Cliente set nombre='"+clienteEntity.getNombre()+"', " +
                       "email='"+clienteEntity.getEmail()+"' " +
                       "WHERE id="+clienteEntity.getId();


        return actualizar(query);
    }

    @Override
    public boolean delete(int id) throws TiendaException {
        String query = "DELETE FROM Cliente " +
                       "WHERE id="+id;

        return actualizar(query);
    }

    @Override
    public List<ClienteDTO> obtener(String query) throws SQLException, TiendaException {
        List<ClienteDTO> clienteDTOList = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
            try {
                statement = getConexion().createStatement();
                rs = statement.executeQuery(query);

                while (rs.next()){
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String email = rs.getString("email");

                    ClienteEntity clienteEntity = new ClienteEntity(id, nombre,email);

                    clienteDTOList.add(IMapperCliente.INSTANCE.toDTO(clienteEntity));
                }

            } catch (SQLException | TiendaException e) {
                throw new RuntimeException(e);
            } finally {
                closeResources(rs, statement);

        }

        return clienteDTOList;
    }
}
