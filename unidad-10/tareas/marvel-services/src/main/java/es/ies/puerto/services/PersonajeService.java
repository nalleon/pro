package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService implements ICrudServices {
    private DaoPersonaje daoPersonaje;

    public PersonajeService() {
    }

    public PersonajeService(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        Personaje poder = daoPersonaje.findPersonaje(new Personaje(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        Set<Personaje> list = daoPersonaje.findAllPersonaje();
        return Response.ok(list).build();
    }

    @POST
    public Response addObject(Object object) throws MarvelException {
        boolean resultado = daoPersonaje.updatePersonaje((Personaje) object);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoPersonaje.deletePersonaje(new Personaje(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    @Override
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Personaje personaje = daoPersonaje.findPersonaje(new Personaje(id));
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
