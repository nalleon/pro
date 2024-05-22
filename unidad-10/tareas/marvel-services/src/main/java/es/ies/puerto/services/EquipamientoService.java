package es.ies.puerto.services;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService implements ICrudServices {
    private DaoEquipamiento daoEquipamiento;


    public EquipamientoService() {
    }

    public EquipamientoService(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/equipamiento/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = daoEquipamiento.findEquipamiento(new Equipamiento(id));
        if (equipamiento != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/equipamiento/")
    @Override
    public Response getAll() throws MarvelException {
        Set<Equipamiento> list = daoEquipamiento.findAllEquipamiento();
        return Response.ok(list).build();
    }

    @POST
    @Override
    public Response addObject(Object object) throws MarvelException {
        boolean resultado = daoEquipamiento.updateEquipamiento((Equipamiento) object);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/equipamiento/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        boolean deleted = daoEquipamiento.deleteEquipamiento(new Equipamiento(id));
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/equipamiento/xml/{id}")
    @Produces("application/xml")
    @Override
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException {
        Equipamiento equipamiento = daoEquipamiento.findEquipamiento(new Equipamiento(id));
        if (equipamiento != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
