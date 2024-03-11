package es.ies.puerto.modelo.fichero.impl.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.abstracts.FicheroAbstract;
import es.ies.puerto.modelo.fichero.interfaces.ICrudOperaciones;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends FicheroAbstract implements ICrudOperaciones {
    List<ProductoAbstracts> products;
    String path="src/main/resources";

    public FileJson (){
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.json";
        FICHERO_APARATOS = "src/main/resources/aparatos.json";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.json";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.json";
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
        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<ProductoAbstracts>>(){}.getType();
            products = new Gson().fromJson(json, listType);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return products;
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
        if (products.contains(productoAbstracts)){
            return;
        }
        products.add(productoAbstracts);
        saveChanges(products);
    }

    @Override
    public void deleteProduct(ProductoAbstracts productoAbstracts) {
        if (!products.contains(productoAbstracts)){
            return;
        }
        products.remove(productoAbstracts);
        saveChanges(products);
    }

    @Override
    public void updateProduct(ProductoAbstracts productoAbstracts) {
        if (!products.contains(productoAbstracts)){
            return;
        }
        int position = products.indexOf(productoAbstracts);
        products.set(position,productoAbstracts);
        saveChanges(products);
    }

    private void saveChanges(List<ProductoAbstracts> products) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(products, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
