package es.ies.puerto.services;
import java.util.List;
import es.ies.puerto.models.Artist;
import es.ies.puerto.repositories.ArtistRepositoryV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/artist")
public class ArtistServiceV1 {
    private static Logger LOG = LoggerFactory.getLogger(ArtistServiceV1.class);

    private ArtistRepositoryV1 artistRepositoryV1;

    public ArtistServiceV1(){

    }
    @Autowired
    public void setArtistRepository(ArtistRepositoryV1 artistRepositoryV1) {
        this.artistRepositoryV1 = artistRepositoryV1;
    }

    @GetMapping("/")
    public List<Artist> getAll(){
        return artistRepositoryV1.getAll();
    }
}
