package es.ies.puerto.services;

import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperPersonaje;
import es.ies.puerto.mappers.struct.IMapperPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.interfaces.ICrudPersonaje;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/personaje")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService implements ICrudPersonaje {
    private DaoPersonaje daoPersonaje;

    public PersonajeService() throws MarvelException {
        daoPersonaje = new DaoPersonaje();
    }

    public PersonajeService(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        PersonajeDTO personajeDTO =
                MapperPersonaje.personajeToPersonajeDTO(daoPersonaje.findPersonaje(new Personaje(id)));
        if (personajeDTO != null) {
            return Response.ok(personajeDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        Set<PersonajeDTO> list = new HashSet<>();

        for (Personaje personajeDb : daoPersonaje.findAllPersonaje()){
            list.add(MapperPersonaje.personajeToPersonajeDTO(personajeDb));
        }

        return Response.ok(list).build();
    }

    @POST
    public Response addObject(PersonajeDTO personajeDTO) throws MarvelException {
        Personaje personaje = MapperPersonaje.personajeDTOToPersonaje(personajeDTO);
        boolean resultado = daoPersonaje.updatePersonaje(personaje);

        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = MapperPersonaje.personajeDTOToPersonaje(new PersonajeDTO(id));
        boolean deleted = daoPersonaje.deletePersonaje(personaje);
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = MapperPersonaje.personajeDTOToPersonaje(new PersonajeDTO(id));
        Personaje personajeFind = daoPersonaje.findPersonaje(personaje);
        if (personajeFind != null) {
            return Response.ok(personajeFind).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
