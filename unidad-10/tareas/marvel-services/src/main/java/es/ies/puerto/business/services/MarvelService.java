package es.ies.puerto.business.services;

import es.ies.puerto.business.repository.MarvelRepository;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Set;

@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class MarvelService {
    MarvelRepository marvelRepository;

    public MarvelService() throws MarvelException {
        marvelRepository = new MarvelRepository();
    }

    public MarvelRepository getMarvelRepository() {
        return marvelRepository;
    }

    public void setMarvelRepository(MarvelRepository marvelRepository) {
        this.marvelRepository = marvelRepository;
    }

    @GET
    @Path("/{id}")
    public Response getPersonajeById(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = marvelRepository.getPersonajeById(id);
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    public Response getPersonajes() throws MarvelException {
        List<Personaje> personajes = marvelRepository.getPersonajes();
        return Response.ok(personajes).build();
    }

    @POST
    public Response addPersonaje(Personaje personaje) throws MarvelException {
        boolean result = marvelRepository.savePersonaje(personaje);

        if (result){
            return Response.status(Response.Status.CREATED).build();
        }

        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePersonajeById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = marvelRepository.deletePersonajeById(id);
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getPersonajeXml(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = marvelRepository.getPersonajeById(id);
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
