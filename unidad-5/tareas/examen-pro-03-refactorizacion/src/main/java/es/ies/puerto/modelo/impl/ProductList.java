package es.ies.puerto.modelo.impl;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import org.simpleframework.xml.ElementList;

import java.util.List;

public class ProductList {
    @ElementList(inline = true)
    private List<ProductoAbstracts> productoAbstracts;

    public ProductList() {}

    public ProductList(List<ProductoAbstracts> productoAbstracts) {
        this.productoAbstracts = productoAbstracts;
    }

    public List<ProductoAbstracts> getProductoAbstracts() {
        return productoAbstracts;
    }

    public void setProductoAbstracts(List<ProductoAbstracts> productoAbstracts) {
        this.productoAbstracts = productoAbstracts;
    }
}
