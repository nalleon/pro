package es.ies.puerto.file.tres;

import es.ies.puerto.file.abstracts.FileAbstracts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileArmasCsv extends FileAbstracts {
    List<Arma> armas;
    List<Arma> armasBackUp = obtenerArmas();
    public List<Arma> obtenerArmas() {
        armas = new ArrayList<>();
        if (!fileExists(pathTres)){
            return armas;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(pathTres))){
            String str;
            while ((str = br.readLine()) != null){
                String [] data = str.split(delimiter);
                armas.add(splitArma(data));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return armas;
    }

    /**
     * Auxiliar method to split properties of the class into a string
     * @param data to split
     * @return an object of the class
     */
    public Arma splitArma(String [] data){
        return new Arma(data[0], data[1],data[2],data[3], Integer.parseInt(data[4]));
    }

    public Arma obtenerArma(Arma arma) {
        if (!armas.contains(arma)){
            return null;
        }
        return armas.get(armas.indexOf(arma));
    }
    public void addArma(Arma arma) {
        if (!armas.contains(arma)){
            armas.add(arma);
            saveFile(armas);
        }
    }
    public void deleteArma(Arma arma) {
        if (armas.remove(arma)){
            saveFile(armas);
        }
    }
    public void updateArma(Arma arma) {
        if (!armas.contains(arma)){
            return;
        }
        armas.set(armas.indexOf(arma),arma);
        saveFile(armas);
    }

    public void saveFile(List<Arma> armaList){
        try (FileWriter writer = new FileWriter(pathTres)){
            for (Arma arma : armaList){
                writer.write(arma.toCsv());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to load a backUp of the file
     */
    public void loadBackUp(){
        saveFile(armasBackUp);
    }
}
