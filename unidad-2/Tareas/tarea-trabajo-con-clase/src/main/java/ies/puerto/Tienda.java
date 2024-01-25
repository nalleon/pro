package ies.puerto;

/**
 * Crea una clase Producto con propiedades nombre, precio y stock. Luego, crea una clase Tienda que tenga
 * una lista de productos y métodos para agregar, vender y mostrar el inventario.
 * @author Nabil
 */
public class Tienda {
   Producto producto;

   public Tienda(Producto producto) {
      this.producto = producto;
   }

   public Producto getProducto() {
      return producto;
   }

   public void setProducto(Producto producto) {
      this.producto = producto;
   }
   public String mostrarProductos(){
      return "Nombre del producto:" + producto.getNombreProducto() + ", Precio:" + producto.getPrecio() + ", Stock:" +
              producto.getStock();
   }
}
