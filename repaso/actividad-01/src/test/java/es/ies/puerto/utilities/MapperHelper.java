package es.ies.puerto.utilities;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;
import org.junit.jupiter.api.BeforeEach;

public class MapperHelper extends TestUtilities {
    public static final int CLIENTE_ID = 1;
    public static final String PRODUCTO = "productoTest";
    public static final int CANTIDAD = 1234;
    public static final int ID = 1;
    public static final String EMAIL = "email@test";
    public static final String NOMBRE = "nombreTest";
    public PedidoEntity pedido;
    public PedidoDTO pedidoDTO;
    public ClienteEntity clienteEntity;
    public ClienteDTO clienteDTO;

    @BeforeEach
    public void beforeEach(){
        clienteEntity = new ClienteEntity();
        clienteEntity.setId(CLIENTE_ID);
        clienteEntity.setEmail(EMAIL);
        clienteEntity.setNombre(NOMBRE);

        clienteDTO = new ClienteDTO();
        clienteDTO.setId(CLIENTE_ID);
        clienteDTO.setEmail(EMAIL);
        clienteDTO.setNombre(NOMBRE);

        pedido = new PedidoEntity();
        pedido.setClienteId(CLIENTE_ID);
        pedido.setProducto(PRODUCTO);
        pedido.setCantidad(CANTIDAD);
        pedido.setId(ID);

        pedidoDTO = new PedidoDTO();
        pedidoDTO.setProducto(PRODUCTO);
        pedidoDTO.setCantidad(CANTIDAD);
        pedidoDTO.setId(ID);
    }
}
