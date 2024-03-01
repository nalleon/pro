package es.ies.puerto.negocio;

import es.ies.puerto.interfaces.ICrudOperaciones;
import es.ies.puerto.modelo.Alimento;
import es.ies.puerto.modelo.abstractas.ProductoAbstract;
import es.ies.puerto.negocio.interfaces.ITiendaInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tienda implements ITiendaInterface {

    ICrudOperaciones persistencia;

    List<ProductoAbstract> alimentos;

    public Tienda() {
        alimentos = new ArrayList<>();
    }

    @Override
    public boolean crearProducto(ProductoAbstract productoAbstract) {
        if (!existeProducto(productoAbstract)){
           return alimentos.add(productoAbstract);
        }
        return true;
    }

    @Override
    public boolean actualizarProducto(ProductoAbstract productoAbstract) {
        if (existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            alimentos.set(posicion,productoAbstract);
            return true;
        }
        return false;
    }
    @Override
    public boolean eliminarProducto(ProductoAbstract producto) {
        // no es necesaria la comprobacion
        return alimentos.remove(producto);
    }


    public boolean existeProducto(ProductoAbstract productoAbstract){
        return alimentos.contains(productoAbstract);
    }
    @Override
    public List<ProductoAbstract> obtenerProductos() {
        return alimentos;
    }

    @Override
    public ProductoAbstract obtenerProducto(ProductoAbstract productoAbstract) {
        if (existeProducto(productoAbstract)){
            int posicion = alimentos.indexOf(productoAbstract);
            return alimentos.get(posicion);
        }
        return null;
    }


    /**
     *     public List<ProductoAbstract> ordenarProductos(){
     *         return null ;
     *     }
     */

}
