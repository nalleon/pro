package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
 @Repository("artistRepositoryV1")
public class ArtistRepositoryV1 {
    public List<Artist> list;

    private SongRepository songRepository;

    public ArtistRepositoryV1() {
        list = new ArrayList<>();
        list.add(new Artist("1", "Pepe Benavente"));
        list.add(new Artist("2", "Michael Jackson"));
    }

    @Autowired
     public void setSongRepository(SongRepository songRepository) {
         this.songRepository = songRepository;
     }

     public List<Artist> getAll(){
        return list;
    }

     public Artist getById(String id) {
         Artist artist = new Artist(id);
         int index = list.indexOf(artist);
         if (index >=0) {
             artist = list.get(index);
             artist.setSongs(songRepository.getSongs());
         }
         return null;
     }
}
