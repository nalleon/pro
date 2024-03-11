package es.ies.puerto.modelo.fichero.interfaces;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;

import java.util.List;

public interface ICrudOperaciones {
    public List<ProductoAbstracts> obtainProducts();
    public ProductoAbstracts obtainProduct(ProductoAbstracts productoAbstracts);
    public void addProduct(ProductoAbstracts productoAbstracts);
    public void deleteProduct(ProductoAbstracts productoAbstracts);
    public void updateProduct(ProductoAbstracts productoAbstracts);
    public String getProductFilePath(String productType);
}
