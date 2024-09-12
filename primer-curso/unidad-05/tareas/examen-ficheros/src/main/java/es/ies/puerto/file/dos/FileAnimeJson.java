package es.ies.puerto.file.dos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.file.abstracts.FileAbstracts;
import es.ies.puerto.file.tres.Arma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileAnimeJson extends FileAbstracts {
    List<Anime> animes;
    List<Anime> animesBackUp;

    public FileAnimeJson(){
        animes = new ArrayList<>();
        animesBackUp = obtenerAnimes();
    }
    public List<Anime> obtenerAnimes() {
        if (!fileExists(pathDos)){
            return animes;
        }
        try {
            String json = new String(Files.readAllBytes(Paths.get(pathDos)));
            Type listType = new TypeToken<ArrayList<Anime>>(){}.getType();
            animes = new Gson().fromJson(json,listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return animes;
    }
    public Anime obtenerAnime(Anime anime) {
        if (!animes.contains(anime)){
            return null;
        }
        return animes.get(animes.indexOf(anime));
    }
    public void addAnime(Anime anime) {
        if (!animes.contains(anime)){
            animes.add(anime);
            saveFile(animes);
        }
    }
    public void deleteAnime(Anime anime) {
        if (animes.remove(anime)){
            saveFile(animes);
        }
    }
    public void updateAnime(Anime anime) {
        if (!animes.contains(anime)){
            return;
        }
        int position = animes.indexOf(anime);
        animes.set(position, anime);
        saveFile(animes);
    }

    public void saveFile(List<Anime> animeList){
        try (FileWriter writer = new FileWriter(pathDos)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(animeList, writer);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }

    /**
     * Method to load a backUp of the file
     */
    public void loadBackUp(){
        saveFile(animesBackUp);
    }
}
