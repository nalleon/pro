package es.ies.puerto.modelo.impl;

import es.ies.puerto.exception.ShopException;
import es.ies.puerto.mapper.struct.IMapperCustomer;
import es.ies.puerto.modelo.abstractas.DaoAbstracts;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.modelo.entity.CustomerEntity;
import es.ies.puerto.modelo.interfaces.IDaoObject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends DaoAbstracts implements IDaoObject<CustomerDTO> {

    public CustomerDao() throws ShopException {
        super();
    }

    @Override
    public List<CustomerDTO> findAllObjects() throws SQLException, ShopException {
        String query = "SELECT c.id, c.name, c.email " +
                "FROM Customer AS c";
        return obtain(query);
    }

    @Override
    public CustomerDTO findById(int id) throws SQLException, ShopException {
        String query = "SELECT c.id, c.name, c.email " +
                "FROM Customer AS c " +
                "WHERE c.id="+id;
        
        List<CustomerDTO> list = obtain(query);
        if (list.isEmpty()){
            return null;
        }
        
        return list.get(0);
    }

    @Override
    public boolean addObject(CustomerDTO dto) throws ShopException {
        CustomerEntity entity = IMapperCustomer.INSTANCE.toEntity(dto);
        String query = "INSERT INTO Customer (id, name, email) VALUES " +
                "("+ entity.getId()+", '"+ entity.getName()+"', '"+ entity.getEmail()+"')";
        return update(query);
    }

    @Override
    public boolean removeObject(int id) throws ShopException {
        String query = "DELETE FROM Customer WHERE id="+id;
        return update(query);
    }

    @Override
    public boolean updateObject(CustomerDTO dto) throws ShopException {
        CustomerEntity entity = IMapperCustomer.INSTANCE.toEntity(dto);
        String query = "UPDATE Customer set name='"+ entity.getName()+"', email='"+ entity.getEmail()+"' " +
                "WHERE id="+entity.getId();

        return update(query);
    }

    @Override
    public List<CustomerDTO> obtain(String query) throws SQLException, ShopException {
        List<CustomerDTO> list = new ArrayList<>();
        Statement statement = null;
        ResultSet rs = null;

            try {
                statement = getConnectionDb().createStatement();
                rs = statement.executeQuery(query);

                while (rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");

                    CustomerEntity entity = new CustomerEntity(id,name,email);

                    list.add(IMapperCustomer.INSTANCE.toDTO(entity));
                }
            } catch (SQLException | ShopException e){
                throw new RuntimeException(e);
            } finally {
                closeResources(rs, statement);
            }
        return list;
    }
}
