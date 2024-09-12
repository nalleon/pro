package es.ies.puerto.file.uno;

import es.ies.puerto.file.abstracts.FileAbstracts;
import es.ies.puerto.file.cuatro.Pokedex;
import es.ies.puerto.file.cuatro.Pokemon;
import org.simpleframework.xml.core.Persister;

import javax.sound.midi.MidiFileFormat;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXmlCriatura extends FileAbstracts {
    List<Criatura> criaturas;
    List<Criatura> criaturasBackUp;

    public FileXmlCriatura(){
        criaturas = new ArrayList<>();
        criaturasBackUp = obtenerCriaturas();
    }

    public List<Criatura> obtenerCriaturas() {
        if (!fileExists(pathUno)){
            return criaturas;
        }
        Persister serializer = new Persister();
        try {
            CriaturaList criaturaList = serializer.read(CriaturaList.class, new File(pathUno));
            criaturas = criaturaList.getCriaturas();
            return criaturas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Criatura obtener(Criatura criatura) {
        if (!criaturas.contains(criatura)){
            return null;
        }
        return criaturas.get(criaturas.indexOf(criatura));
    }
    public void addCriatura(Criatura criatura) {
        if(!criaturas.contains(criatura)){
            criaturas.add(criatura);
            saveFile(criaturas);
        }
    }
    public void deleteCriatura(Criatura criatura) {
        if(criaturas.remove(criatura)){
            saveFile(criaturas);
        }
    }
    public void updateCriatura(Criatura criatura) {
        if(!criaturas.contains(criatura)){
            return;
        }
        criaturas.set(criaturas.indexOf(criatura), criatura);
        saveFile(criaturas);
    }

    public void saveFile(List<Criatura> criaturaList) {
        CriaturaList criaturaListAux = new CriaturaList(criaturaList);
        Persister serializer = new Persister();

        try {
            serializer.write(criaturaListAux, new File(pathUno));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method to load a backUp of the file
     */
    public void loadBackUp(){
        saveFile(criaturasBackUp);
    }
}
