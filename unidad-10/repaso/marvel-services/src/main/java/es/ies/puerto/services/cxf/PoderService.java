package es.ies.puerto.services.cxf;

import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperPoder;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.services.interfaces.ICrudPoder;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/poder")
@Consumes("application/json")
@Produces("application/json")
public class PoderService implements ICrudPoder {
    private DaoPoder daoPoder;

    public PoderService() throws MarvelException {
        daoPoder = new DaoPoder();
    }

    public PoderService(DaoPoder daoPoder) {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        PoderDTO poderDTO = MapperPoder.poderToPoderDTO(daoPoder.findPoder(new Poder(id)));

        if (poderDTO != null) {
            return Response.ok(poderDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        Set<PoderDTO> poderList = new HashSet<>();
        for (Poder poderDb : daoPoder.findAllPoder()){
            poderList.add(MapperPoder.poderToPoderDTO(poderDb));
        }
        return Response.ok(poderList).build();
    }

    @POST
    @Override
    public Response addObject(PoderDTO poderDTO) throws MarvelException {
        Poder poder = MapperPoder.poderDTOToPoder(poderDTO);
        boolean resultado = daoPoder.updatePoder((poder));
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        Poder poder = MapperPoder.poderDTOToPoder(new PoderDTO(id));
        boolean deleted = daoPoder.deletePoder(poder);

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
        Poder poder = MapperPoder.poderDTOToPoder(new PoderDTO(id));
        Poder poderFind = daoPoder.findPoder(poder);
        if (poderFind != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
