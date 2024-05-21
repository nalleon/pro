package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/")
@Consumes("application/json")
@Produces("application/json")
public class PoderService {
    private DaoPoder daoPoder;

    public PoderService(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    public void setDaoPoder(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/{id}")
    public Response getPoderById(@PathParam("id") String id) throws MarvelException {
        Poder poder = daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    public Response getSongs() throws MarvelException {
        Set<Poder> poderList = daoPoder.findAllPoder();
        return Response.ok(poderList).build();
    }

    @POST
    public Response addSong(Poder poder) throws MarvelException {
        boolean resultado = daoPoder.updatePoder(poder);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response deleteSongById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoPoder.deletePoder(new Poder(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/xml/{id}")
    @Produces("application/xml")
    public Response getSongXml(@PathParam("id") String id) throws MarvelException {
        Poder poder = daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
