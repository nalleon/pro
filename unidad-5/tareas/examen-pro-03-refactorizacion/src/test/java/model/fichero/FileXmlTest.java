package model.fichero;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.impl.xml.FileXml;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileXmlTest {
    String nameAdd = "otro";
    float priceAdd = 1.4f;
    String dateOfEntranceAdd = "2024-09-03";
    String dateOfExpirationAdd = "2024-23-03";
    int popularityAdd = 8;

    ICrudOperaciones persistence;
    List<ProductoAbstracts> products;

    @BeforeEach
    public void beforeEach() {
        persistence = new FileXml();
        persistence.getProductFilePath("alimento");
        products = persistence.obtainProducts();
    }

    @Test
    public void obtainProductsTest() {
        Assertions.assertFalse(products.isEmpty(), "Expected result not found");
    }

   //@Test
    public void obtainProductTest() {
        ProductoAbstracts alimentoFind = new Alimento("ALM001");
        ProductoAbstracts aparatoFind = new Aparato("APA001");
        ProductoAbstracts souvenirFind = new Souvenir("SOU001");
        ProductoAbstracts cuidadoFind = new CuidadoPersonal("CUI001");

        persistence.getProductFilePath("alimento");
        alimentoFind = persistence.obtainProduct(alimentoFind);

        Assertions.assertEquals(alimentoFind.getUdi(),"ALM001",
                "Expected result not found");
        Assertions.assertNotNull(alimentoFind.getName(),
                "Expected result not found");
        Assertions.assertTrue (alimentoFind.getPrice() > 0,
                "Expected result not found");
        Assertions.assertNotNull(alimentoFind.getDateOfEntrance(),
                "Expected result not found");

        aparatoFind = persistence.obtainProduct(aparatoFind);

        Assertions.assertEquals(aparatoFind.getUdi(),"APA001",
                "Expected result not found");
        Assertions.assertNotNull(aparatoFind.getName(),
                "Expected result not found");
        Assertions.assertTrue (aparatoFind.getPrice() > 0,
                "Expected result not found");
        Assertions.assertNotNull(aparatoFind.getDateOfEntrance(),
                "Expected result not found");

        souvenirFind = persistence.obtainProduct(souvenirFind);
        Assertions.assertEquals(souvenirFind.getUdi(),"SOU001",
                "Expected result not found");
        Assertions.assertNotNull(souvenirFind.getName(),
                "Expected result not found");
        Assertions.assertTrue (souvenirFind.getPrice() > 0,
                "Expected result not found");
        Assertions.assertNotNull(souvenirFind.getDateOfEntrance(),
                "Expected result not found");

        cuidadoFind = persistence.obtainProduct(cuidadoFind);

        Assertions.assertEquals(cuidadoFind.getUdi(),"CUI001",
                "Expected result not found");
        Assertions.assertNotNull(cuidadoFind.getName(),
                "Expected result not found");
        Assertions.assertTrue (cuidadoFind.getPrice() > 0,
                "Expected result not found");
        Assertions.assertNotNull(cuidadoFind.getDateOfEntrance(),
                "Expected result not found");
    }


   // @Test
    public void addDeleteProductTest() {
        int numProductsInitial = products.size();
        ProductoAbstracts alimentoAdd = new Alimento(nameAdd, priceAdd,dateOfEntranceAdd, "ALM005",
                dateOfExpirationAdd);
        ProductoAbstracts aparatoAdd = new Aparato(nameAdd, priceAdd,dateOfEntranceAdd, "APA005");
        ProductoAbstracts souvenirAdd = new Souvenir(nameAdd, priceAdd,dateOfEntranceAdd, "SOU005");
        ProductoAbstracts cuidadoAdd = new CuidadoPersonal(nameAdd, priceAdd,dateOfEntranceAdd, "CUI005",
                popularityAdd);

        persistence.addProduct(alimentoAdd);
        persistence.addProduct(aparatoAdd);
        persistence.addProduct(souvenirAdd);
        persistence.addProduct(cuidadoAdd);
        products = persistence.obtainProducts();

        int numTotalProducts = products.size();
        Assertions.assertTrue(products.contains(alimentoAdd),
                "Product not ofund");
        Assertions.assertEquals(numProductsInitial +4 ,
                numTotalProducts,
                "Expected result not found");

        persistence.deleteProduct(alimentoAdd);
        persistence.deleteProduct(aparatoAdd);
        persistence.deleteProduct(souvenirAdd);
        persistence.deleteProduct(cuidadoAdd);
        products = persistence.obtainProducts();

        int numProductsDelete = products.size();
        Assertions.assertEquals(numProductsInitial , numProductsDelete,
                "Expect result must match");
    }


}

