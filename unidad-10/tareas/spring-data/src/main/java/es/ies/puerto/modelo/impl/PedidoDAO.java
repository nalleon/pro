package es.ies.puerto.modelo.impl;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.exception.TiendaException;
import es.ies.puerto.mapper.struct.IMapperPedido;
import es.ies.puerto.modelo.abstractas.DaoAbstracts;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.modelo.interfaces.ICrudDaoPedidos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO extends DaoAbstracts implements ICrudDaoPedidos {
    public PedidoDAO() throws TiendaException {
    }

    @Override
    public PedidoDTO findById(int id) throws SQLException, TiendaException {
        String query = "SELECT c.id, c.clienteId, c.producto, c.cantidad " +
                "FROM Pedido AS c " +
                "WHERE c.id="+id;

        List<PedidoDTO> pedidoDTOList = obtener(query);
        if (pedidoDTOList.isEmpty()){
            return null;
        }

        return pedidoDTOList.get(0);
    }

    @Override
    public List<PedidoDTO> findAll() throws SQLException, TiendaException {
        String query = "SELECT c.id, c.clienteId, c.producto, c.cantidad FROM Pedido AS c";
        return obtener(query);
    }

    @Override
    public boolean add(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException {
        PedidoEntity pedidoEntity = IMapperPedido.INSTANCE.toEntity(pedidoDTO, clienteDTO);
        String query = "INSERT INTO Pedido (id, clienteId, producto, cantidad) VALUES " +
                "("+pedidoEntity.getId()+", "+pedidoEntity.getClienteId()+", '"+pedidoEntity.getProducto()+"', " +
                    pedidoEntity.getCantidad()+")";
        return actualizar(query);
    }

    @Override
    public boolean update(PedidoDTO pedidoDTO, ClienteDTO clienteDTO) throws TiendaException {
        PedidoEntity pedidoEntity = IMapperPedido.INSTANCE.toEntity(pedidoDTO,clienteDTO);
        String query = "UPDATE Pedido set producto='"+pedidoEntity.getProducto()+"', " +
                "cantidad="+pedidoEntity.getCantidad()+" " +
                "WHERE id="+pedidoEntity.getId() + " AND clienteId="+clienteDTO.getId();

        actualizar(query);
        return false;
    }

    @Override
    public boolean delete(int id) throws TiendaException {
        String query = "DELETE FROM Pedido " +
                "WHERE id="+id;

        return actualizar(query);
    }

    @Override
    public List<PedidoDTO> obtener(String query) throws SQLException, TiendaException {
        List<PedidoDTO> pedidoDTOList = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("id");
                int clienteId = rs.getInt("id");
                String producto = rs.getString("producto");
                int cantidad = rs.getInt("cantidad");

                PedidoEntity pedidoEntity = new PedidoEntity(id, clienteId, producto,cantidad);

                pedidoDTOList.add(IMapperPedido.INSTANCE.toDTO(pedidoEntity));
            }

        } catch (SQLException | TiendaException e) {
            throw new RuntimeException(e);
        } finally {
            closeResources(rs, statement);

        }

        return pedidoDTOList;
    }
}
