package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import es.ies.puerto.services.ArtistServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("artistRepositoryV2")
public class ArtistRepositoryV2 {
   public List<Artist> list;
   private ArtistRepositoryV1 artistRepositoryV1;
   private SongRepository songRepository;

   public ArtistRepositoryV2() {
       list = new ArrayList<>();
       list.add(new Artist("1", "Pepe Benavente"));
       list.add(new Artist("2", "Michael Jackson"));
   }

    @Autowired
    public void setArtistRepositoryV1(ArtistRepositoryV1 artistRepositoryV1) {
        this.artistRepositoryV1 = artistRepositoryV1;
    }

    public SongRepository getSongRepository() {
        return songRepository;
    }

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
