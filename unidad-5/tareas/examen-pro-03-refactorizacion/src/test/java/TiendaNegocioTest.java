import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.negocio.TiendaNegocio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class TiendaNegocioTest {

    private FileCSV fileCSV = new FileCSV();

    private List<ProductoAbstracts> productoAbstractsList = new ArrayList<>();
    TiendaNegocio tiendaNegocio = new TiendaNegocio();

    @BeforeEach
    public void beforeEach() {
        tiendaNegocio = new TiendaNegocio(fileCSV, productoAbstractsList);
    }

    @Test
    public void tiendaNotNullTest(){
        Assertions.assertNotNull(tiendaNegocio, "Class can not be null.");
    }

    @Test
    public void tiendaGetSetTest (){
        FileCSV updatedFileCSV = new FileCSV();
        List<ProductoAbstracts> updatedList = new ArrayList<>();
        tiendaNegocio.setFileCSV(updatedFileCSV);
        tiendaNegocio.setProductoAbstractsList(updatedList);
        Assertions.assertEquals(updatedFileCSV, tiendaNegocio.getFileCSV(), "Expected result not found");
        Assertions.assertEquals(updatedList, tiendaNegocio.getProductoAbstractsList(),
                "Expected result not found");
    }

    @Test
    public void toStringTest(){
        Assertions.assertTrue(tiendaNegocio.toString().contains(fileCSV.toString()), "Expected result not found");
        Assertions.assertTrue(tiendaNegocio.toString().contains(productoAbstractsList.toString()),
                "Expected result not found");
    }

}
