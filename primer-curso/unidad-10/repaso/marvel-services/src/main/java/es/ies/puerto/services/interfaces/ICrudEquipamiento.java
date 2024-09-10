package es.ies.puerto.services.interfaces;

import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.exception.MarvelException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICrudEquipamiento {
    Response getObjectById(@PathParam("id") String id) throws MarvelException;
    public Response getAll() throws MarvelException;
    public Response addObject(EquipamientoDTO equipamientoDTO, String pjId) throws MarvelException;
    public Response deleteObjectById(@PathParam("id") String id, String pjId) throws MarvelException;

}
