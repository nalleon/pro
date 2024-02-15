package es.ies.puerto.presentacion.app;
import es.ies.puerto.presentacion.abstracts.ArticuloAbstracts;
import es.ies.puerto.presentacion.implementacion.Alimento;
import es.ies.puerto.presentacion.implementacion.Aparato;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<ArticuloAbstracts> alimentos = read("src/main/resources/alimentos.csv");
        System.out.println(alimentos);
        List<ArticuloAbstracts> aparatos = readAparato("src/main/resources/aparatos.csv");
        System.out.println(aparatos);
        //read("src/main/resources/cuidado-personal.csv");
        //System.out.println();
        //read("src/main/resources/aparatos.csv");
        //System.out.println();
        // read("src/main/resources/souvenirs.csv");
    }
    public  static List<ArticuloAbstracts> read(String path, String articulo) {
        List<ArticuloAbstracts> articulos = new ArrayList<>();
        File file = new File(path);
        if (fileExists(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String string;

                int i=0;
                while ((string = br.readLine()) != null) {
                    String[] articleArray = string.split(",");
                    if (i>0) {
                        switch (articulo){
                            case "alimento":
                                Alimento alimento = new Alimento(articleArray[0], articleArray[4],
                                        Float.parseFloat(articleArray[1]), articleArray[2], articleArray[4]);
                                articulos.add(alimento);
                                break;
                            case "aparato":
                                break;

                            case "cuidado personal":
                                break;

                            case "souvenir":
                                break;
                            default:
                                System.out.println("Error. Insert a valid article.");
                                break;
                        }

                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist or is not valid");
        }
        return articulos;
    }

    public  static List<ArticuloAbstracts> readAparato(String path) {
        List<ArticuloAbstracts> articulos = new ArrayList<>();
        File file = new File(path);
        if (fileExists(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String string;

                int i=0;
                while ((string = br.readLine()) != null) {
                    if (i>0) {
                        String[] aparatosArray = string.split(",");
                        Aparato aparato = new Aparato(aparatosArray[0], aparatosArray[4], Float.parseFloat(aparatosArray[1]),
                        aparatosArray[2], aparatosArray[3]);
                        articulos.add(aparato);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File does not exist or is not valid");
        }
        return articulos;
    }

    public static boolean fileExists(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }
}
