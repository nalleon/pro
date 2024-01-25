package ies.puerto;
/**
 * Crea una clase Producto con propiedades nombre, precio y stock. Luego, crea una clase Tienda que tenga
 * una lista de productos y métodos para agregar, vender y mostrar el inventario.
 * @author Nabil
 */
public class Producto {
    private String nombreProducto;
    private float precio;
    private int stock;

    /**
     * Constructor por defecto de la clase.
     */
    public Producto() {}

    /**
     * Constructor de la clase con todos sus parametros
     * @param nombreProducto del producto
     * @param precio del producto
     * @param stock del producto
     */
    public Producto(String nombreProducto, float precio, int stock){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Getters/Setters de la clase
     */

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
