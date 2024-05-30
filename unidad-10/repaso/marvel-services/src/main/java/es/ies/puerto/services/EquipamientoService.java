package es.ies.puerto.services;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.classic.MapperEquipamiento;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.services.interfaces.ICrudEquipamiento;
import es.ies.puerto.services.interfaces.ICrudServices;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService implements ICrudEquipamiento {
    private DaoEquipamiento daoEquipamiento;


    public EquipamientoService() throws MarvelException {
        daoEquipamiento = new DaoEquipamiento();
    }

    public EquipamientoService(DaoEquipamiento daoEquipamiento) {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/{id}")
    @Override
    public Response getObjectById(@PathParam("id") String id) throws MarvelException {
        EquipamientoDTO equipamientoDTO = IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(
                daoEquipamiento.findEquipamiento(new Equipamiento(id)));
        if (equipamientoDTO != null) {
            return Response.ok(equipamientoDTO).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/")
    @Override
    public Response getAll() throws MarvelException {
        Set<EquipamientoDTO> list = new HashSet<>();
        for (Equipamiento equipamientodb : daoEquipamiento.findAllEquipamiento()){
            list.add(IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDTO(equipamientodb));
        }
        return Response.ok(list).build();
    }

    @POST
    @Override
    public Response addObject(EquipamientoDTO equipamientoDTO, String pjId) throws MarvelException {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento(equipamientoDTO,
                new PersonajeDTO(pjId));
        boolean resultado = daoEquipamiento.updateEquipamiento(equipamiento);
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();

    }

    @DELETE
    @Path("/{id}")
    @Override
    public Response deleteObjectById(@PathParam("id") String id, String pjId) throws MarvelException {
        Equipamiento equipamiento = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamiento
                (new EquipamientoDTO(id), new PersonajeDTO(id));

        boolean deleted = daoEquipamiento.deleteEquipamiento(equipamiento);
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }


}
