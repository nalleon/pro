package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService implements ICrudServices {
    private DaoAlias daoAlias;

    public AliasService() {
    }

    public AliasService(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/alias/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        Alias alias = daoAlias.findAlias(new Alias(id));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/alias/")
    @Override
    public Response getAll() throws MarvelException {
        Set<Alias> list = daoAlias.findAllAlias();
        return Response.ok(list).build();
    }

    @POST
    @Override
    public Response addObject(Object object) throws MarvelException {
        boolean resultado = daoAlias.updateAlias((Alias) object);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/alias/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoAlias.deleteAlias(new Alias(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/alias/xml/{id}")
    @Produces("application/xml")
    @Override
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Alias alias = daoAlias.findAlias(new Alias(id));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
