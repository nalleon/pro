package negocio;
import es.ies.puerto.modelo.Alimento;
import es.ies.puerto.negocio.Tienda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    Tienda tienda;
    Alimento alimento;
    String id = "idAlimento";
    String nombre= "nombreAlimento";
    String nombreUpdate = "nombreActualizar";
    float precio = 2f;
    float precioUpdate = 3f;
    String fEntrada = "01/03/2024";
    String fEntradaUpdate = "02/03/2024";
    String fCaducidad= "16/03/2024";
    String fCaducidadUpdate = "17/03/2024";


    @BeforeEach
    public void beforeEach(){
        tienda = new Tienda();
        alimento = new Alimento(id,nombre,precio, fEntrada,fCaducidad);
        tienda.crearProducto(alimento);
    }

    @Test
    public void tiendaNotNullTest(){
        Assertions.assertNotNull(tienda, "La tienda no puede ser nula");
    }

    @Test
    public void addAlimentoTiendaTest(){
        tienda.crearProducto(alimento);
        tienda.obtenerProductos();
        Assertions.assertEquals(1, tienda.obtenerProductos().size(),
                "No se ha obtenido el tamaño esperado");
    }


    @Test
    public void crearProductoTrueTest(){
        tienda.crearProducto(alimento);
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "El resultado no es esperado");
    }

    @Test
    public void crearProductoExisteTest(){
        Alimento alimentoCrear = new Alimento("udi1");
        Assertions.assertTrue(tienda.crearProducto(alimentoCrear), "El resultado no es esperado");
    }
    @Test
    public void actualizarProductoFalseTest(){
        Alimento alimentoActualizar = new Alimento("udi3");
        Assertions.assertFalse(tienda.actualizarProducto(alimentoActualizar),"El resultado no es esperado");
    }

    @Test
    public void actualizarProductoTrueTest(){
        Alimento alimentoActualizar = new Alimento(id, nombreUpdate, precioUpdate, fEntradaUpdate, fCaducidadUpdate);
        tienda.actualizarProducto(alimentoActualizar);

        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);

        Assertions.assertEquals(nombreUpdate, alimentoBuscar.getNombre(),
                "El resultado no es el esperado");
        Assertions.assertEquals(precioUpdate, alimentoBuscar.getPrecio(),
                "El resultado no es el esperado");
        Assertions.assertEquals(fEntradaUpdate, alimentoBuscar.getfEntrada(),
                "El resultado no es el esperado");
        Assertions.assertEquals(fCaducidadUpdate, alimentoBuscar.getfCaducidad(),
                "El resultado no es el esperado");
    }

    @Test
    public void eliminarProductoTrueTest(){
        tienda.eliminarProducto(alimento);
        Assertions.assertEquals(0, tienda.obtenerProductos().size(),"El resultado no es el esperado");
        //Assertions.assertTrue(tienda.eliminarProducto(alimento), "El resultado no es el esperado");
    }

    @Test
    public void eliminarProductoFalseTest(){
        Alimento alimentoEliminar = new Alimento("id");
        tienda.eliminarProducto(alimentoEliminar);
        Assertions.assertEquals(1, tienda.obtenerProductos().size(), "El resultado no es el esperado");
        //Assertions.assertFalse(tienda.eliminarProducto(alimentoEliminar), "El resultado no es el esperado");
    }

    @Test
    public void obtenerProductoTest(){
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        alimentoBuscar.setfCaducidad(fCaducidadUpdate);

        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(),
                "El resultado no es el esperado");
        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(),
                "El resultado no es el esperado");
        Assertions.assertEquals(fEntrada, alimentoBuscar.getfEntrada(),
                "El resultado no es el esperado");
        Assertions.assertEquals(fCaducidadUpdate, alimentoBuscar.getfCaducidad(),
                "El resultado no es el esperado");
    }

    @Test
    public void obtenerProductoNullTest(){
        Alimento alimentoBuscar = new Alimento("id2");
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertNull(alimentoBuscar, "No se ha obtenido el valor esperado");
    }
}
