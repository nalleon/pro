package es.ies.puerto.modelo.fichero.csv.implementation;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.abstracts.FicheroAbstract;
import es.ies.puerto.modelo.fichero.interfaces.IFichero;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSV extends FicheroAbstract implements IFichero {
    @Override
    public List<ProductoAbstracts> read(String path, String articulo) {
        List<ProductoAbstracts> articulos = new ArrayList<>();
        if (fileExist(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (articulo) {
                            case "alimento":
                                articulos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                articulos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                articulos.add(splitToDefault(arrayElemento)) ;
                                break;//Mostrar error;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }

    @Override
    public boolean reading(String path, String contenido) {

        return false;
    }
    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[4]),
                splitArray[1], splitArray[2]);
        return alimento;
    }
    private Aparato splitToDefault(String[] splitArray) {
        Aparato aparato = new Aparato(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[1]), splitArray[2]);
        return aparato;
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[1]),
                splitArray[2], Integer.parseInt(splitArray[4]));
        return cuidadoPersonal;
    }
}
