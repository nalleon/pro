package es.ies.puerto.services;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperAlias;
import es.ies.puerto.mappers.struct.IMapperAlias;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.services.interfaces.ICrudAlias;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService implements ICrudAlias {
    private DaoAlias daoAlias;

    public AliasService() throws MarvelException {
        daoAlias = new DaoAlias();
    }

    public AliasService(DaoAlias daoAlias) {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        AliasDTO aliasDTO = MapperAlias.aliasToAliasDTO(daoAlias.findAlias(new Alias(id)));
        if (aliasDTO != null) {
            return Response.ok(aliasDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        Set<AliasDTO> list = new HashSet<>();
        for (Alias aliasDB : daoAlias.findAllAlias()){
            list.add(MapperAlias.aliasToAliasDTO(aliasDB));
        }
        return Response.ok(list).build();
    }

    @POST
    @Override
    public Response addObject(AliasDTO aliasDTO) throws MarvelException {
        Alias alias = MapperAlias.aliasDTOToAlias(aliasDTO);
        boolean resultado = daoAlias.updateAlias(alias);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException {
        Alias alias = IMapperAlias.INSTANCE.aliasDTOToAlias(new AliasDTO(id));

        boolean deleted = daoAlias.deleteAlias(alias);
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
        Alias alias = IMapperAlias.INSTANCE.aliasDTOToAlias(new AliasDTO(id));
        Alias aliasFind = daoAlias.findAlias(alias);

        if (aliasFind != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
