package es.ies.puerto.services;

import es.ies.puerto.business.MarvelBusiness;
import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperPoder;
import es.ies.puerto.mappers.struct.IMapperPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/v1/poder")
public class PoderService {

    private static Logger LOG = LoggerFactory.getLogger(PoderService.class);

    private MarvelBusiness marvelBusiness;

    @Autowired
    public void setMarvelBusiness(MarvelBusiness marvelBusiness) {
        this.marvelBusiness = marvelBusiness;
    }

    @GetMapping("/{id}")
    public PoderDTO getObjectById(@PathVariable(name = "id") final String id) throws MarvelException {
        return marvelBusiness.obtainPoderById(id);
    }

    @GetMapping("/")
    public Set<PoderDTO> getAll() throws MarvelException {
       return marvelBusiness.obtainPoderes();
    }

    @PostMapping
    public void addObject(@PathVariable(name = "id") final String id,
                          @RequestBody final PoderDTO poderDTO) throws MarvelException {

    }

    @DeleteMapping("/{id}")
    public void deleteObjectById(@PathVariable(name = "id") final String id) throws MarvelException {

    }

    @PutMapping("/{id}")
    public void updateObject(@PathVariable(name = "id") final String id,
                            @RequestBody final PoderDTO poderDTO) throws MarvelException {

    }


}
