package es.ies.puerto.modelo.fichero.impl.xml;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.abstracts.FicheroAbstract;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.list.*;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends FicheroAbstract implements ICrudOperaciones {
    List<ProductoAbstracts> products;
    String path="src/main/resources";

    public FileXml (){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.xml";
        FICHERO_APARATOS = "src/main/resources/aparatos.xml";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.xml";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.xml";
        products = new ArrayList<>();
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


    @Override
    public List<ProductoAbstracts> obtainProducts() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            switch (path){
                case "src/main/resources/alimentos.xml":
                    AlimentoList alimentoList = serializer.read(AlimentoList.class, file);
                break;
                case "src/main/resources/aparatos.xml":
                    AparatoList aparatoList = serializer.read(AparatoList.class, file);
                    break;
                case "src/main/resources/souvenirs.xml":
                    SouvenirList souvenirList = serializer.read(SouvenirList.class, file);
                    break;
                case "src/main/resources/cuidado-personal.xml":
                    CuidadoList cuidadoList = serializer.read(CuidadoList.class, file);
                    break;
            }

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
        if (products.contains(productoAbstracts)) {
            return;
        }
        products.add(productoAbstracts);
        updateFile(products);
    }

    @Override
    public void deleteProduct(ProductoAbstracts productoAbstracts) {
        if (!products.contains(productoAbstracts)) {
            return;
        }
        products.remove(productoAbstracts);
        updateFile(products);
    }

    @Override
    public void updateProduct(ProductoAbstracts productoAbstracts) {
        int position = products.indexOf(productoAbstracts);
        if (position > 0){
            return;
        }
        products.set(position,productoAbstracts);
        updateFile(products);
    }

    private void updateFile(List<ProductoAbstracts> products){
        ProductList productList = new ProductList(products);
        Persister serializer = new Persister();
        try {
            serializer.write(productList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
