package es.ies.puerto.modelo.impl.list;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;
@Root(name = "root")
public class ProductList {
    @ElementList(inline = true, entry = "row")
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
