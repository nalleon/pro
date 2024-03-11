package es.ies.puerto.modelo.fichero.impl.xml;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.abstracts.FicheroAbstract;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.list.ProductList;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FileXml extends FicheroAbstract implements ICrudOperaciones {
    List<ProductoAbstracts> products;
    String path="src/main/resources";

    public FileXml (){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.xml";
        FICHERO_APARATOS = "src/main/resources/aparatos.xml";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.xml";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.xml";
    }

    @Override
    public String getProductFilePath(String productType) {
        switch (productType) {
            case "alimento":
                return path = FICHERO_ALIMENTOS;
            case "aparato":
                return path = FICHERO_APARATOS;
            case "souvenir":
                return path = FICHERO_SOUVENIRS;
            case "cuidado":
                return path = FICHERO_CUIDADO_PERSONAL;
            default:
                throw new IllegalArgumentException("Invalid type: " + productType);
        }
    }

    public String getList(String productType) {
        switch (productType) {
            case "alimento":
                return path = FICHERO_ALIMENTOS;
            case "aparato":
                return path = FICHERO_APARATOS;
            case "souvenir":
                return path = FICHERO_SOUVENIRS;
            case "cuidado":
                return path = FICHERO_CUIDADO_PERSONAL;
            default:
                throw new IllegalArgumentException("Invalid type: " + productType);
        }
    }
    @Override
    public List<ProductoAbstracts> obtainProducts() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            ProductList productList = serializer.read(ProductList.class, file);
            products = productList.getProductoAbstracts();
            return products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ProductoAbstracts obtainProduct(ProductoAbstracts productoAbstracts) {
        int position = products.indexOf(productoAbstracts);
        if (position > 0){
            return products.get(position);
        }
        return null;
    }

    @Override
    public void addProduct(ProductoAbstracts productoAbstracts) {
        products.add(productoAbstracts);

        ProductList productList = new ProductList(products);
        Persister serializer = new Persister();
        try {
            serializer.write(productList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteProduct(ProductoAbstracts productoAbstracts) {
        products.remove(productoAbstracts);

        ProductList productList = new ProductList(products);
        Persister serializer = new Persister();
        try {
            serializer.write(productList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateProduct(ProductoAbstracts productoAbstracts) {
        int position = products.indexOf(productoAbstracts);
        if (position > 0){
            return;
        }
        products.set(position,productoAbstracts);
        ProductList productList = new ProductList(products);
        Persister serializer = new Persister();
        try {
            serializer.write(productList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
