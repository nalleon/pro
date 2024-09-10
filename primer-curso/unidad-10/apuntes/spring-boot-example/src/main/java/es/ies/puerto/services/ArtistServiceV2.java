package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.ArtistRepositoryV1;
import es.ies.puerto.repositories.ArtistRepositoryV2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/artist")
public class ArtistServiceV2 {
    private static Logger LOG = LoggerFactory.getLogger(ArtistServiceV2.class);

    private ArtistRepositoryV2 artistRepositoryV2;

    public ArtistServiceV2(){

    }
    @Autowired
    public void setArtistRepository(ArtistRepositoryV2 artistRepositoryV2) {
        this.artistRepositoryV2 = artistRepositoryV2;
    }

    @GetMapping("/")
    public List<Artist> getAll(){
        return artistRepositoryV2.getAll();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable(name = "id") final String id) {
        return artistRepositoryV2.getById(id);
    }

}
