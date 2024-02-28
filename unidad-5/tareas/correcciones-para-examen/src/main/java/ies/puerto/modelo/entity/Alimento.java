package ies.puerto.modelo.entity;

public class Alimento extends Articulo{
    public Alimento(String id, String nombre,
                    float precio, String fCaducidad, String fEntrada) {
        super(id, nombre, precio, fCaducidad, fEntrada);
    }
    @Override
    public String toCsv(){
        return getNombre()+ DELIMITADOR +getPrecio()+DELIMITADOR+getfEntrada()+DELIMITADOR+getId();
    }
}
