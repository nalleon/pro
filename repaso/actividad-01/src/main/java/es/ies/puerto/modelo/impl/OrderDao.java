package es.ies.puerto.modelo.impl;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.dto.OrderDTO;
import es.ies.puerto.exception.ShopException;
import es.ies.puerto.mapper.struct.IMapperOrder;
import es.ies.puerto.modelo.abstractas.DaoAbstracts;
import es.ies.puerto.modelo.entity.OrderEntity;
import es.ies.puerto.modelo.interfaces.IDaoObjectFK;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends DaoAbstracts implements IDaoObjectFK<OrderDTO> {
    public OrderDao() throws ShopException {
    }

    @Override
    public List<OrderDTO> findAllObjects() throws SQLException, ShopException {
        String query = "SELECT o.id, o.customerId, o.product, o.quantity " +
                "FROM Order_Shop AS o";
        return obtain(query);
    }

    @Override
    public OrderDTO findById(int id) throws SQLException, ShopException {
        String query = "SELECT o.id, o.customerId, o.product, o.quantity " +
                "FROM Order_Shop AS o " +
                "WHERE o.id="+id;

        List<OrderDTO> list = obtain(query);
        if (list.isEmpty()){
            return null;
        }

        return list.get(0);
    }

    @Override
    public boolean addObject(OrderDTO dto, CustomerDTO customerDTO) throws ShopException {
        OrderEntity entity = IMapperOrder.INSTANCE.toEntity(dto, customerDTO);
        String query = "INSERT INTO Order_Shop (id, customerId, product, quantity) VALUES " +
                "("+ entity.getId()+", "+ entity.getCustomerId()+", '"+ entity.getProduct()+"', " +
                entity.getQuantity()+")";
        return update(query);
    }

    @Override
    public boolean removeObject(int id) throws ShopException {
        String query = "DELETE FROM Order_Shop " +
                "WHERE id="+id;

        return update(query);
    }

    @Override
    public boolean updateObject(OrderDTO dto, CustomerDTO customerDTO) throws ShopException {
        OrderEntity entity = IMapperOrder.INSTANCE.toEntity(dto, customerDTO);
        String query = "UPDATE Order_Shop set customerId="+ entity.getCustomerId()+", product='"+ entity.getProduct()+"', " +
                " quantity="+entity.getQuantity()+" WHERE id="+entity.getId();
        return update(query);
    }

    @Override
    public List<OrderDTO> obtain(String query) throws SQLException, ShopException {
        List<OrderDTO> list = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConnectionDb().createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("id");
                int costumerId = rs.getInt("customerId");
                String product = rs.getString("product");
                int quantity = rs.getInt("quantity");

                OrderEntity entity = new OrderEntity(id, costumerId, product,quantity);

                list.add(IMapperOrder.INSTANCE.toDTO(entity));
            }
        } catch (SQLException | ShopException e){
            throw new RuntimeException(e);
        } finally {
            closeResources(rs, statement);
        }
        return list;
    }
}
