package es.ies.puerto.services;

import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/artist")
public class ArtistServiceV2 {
    private static Logger LOG = LoggerFactory.getLogger(ArtistServiceV2.class);

    private ArtistRepository artistRepository;

    public ArtistServiceV2(){

    }
    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @GetMapping("/")
    public List<Artist> getAll(){
        return artistRepository.getAll();
    }
}
