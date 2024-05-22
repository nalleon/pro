package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/poder")
@Consumes("application/json")
@Produces("application/json")
public class PoderService implements ICrudServices {
    private DaoPoder daoPoder;

    public PoderService() {
    }

    public PoderService(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/poder/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        Poder poder = daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/poder/")
    @Override
    public Response getAll() throws MarvelException {
        Set<Poder> poderList = daoPoder.findAllPoder();
        return Response.ok(poderList).build();
    }

    @POST
    @Override
    public Response addObject(Object object) throws MarvelException {
        boolean resultado = daoPoder.updatePoder((Poder) object);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/poder/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoPoder.deletePoder(new Poder(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/poder/xml/{id}")
    @Produces("application/xml")
    @Override
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Poder poder = daoPoder.findPoder(new Poder(id));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
