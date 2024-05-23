package es.ies.puerto.services.interfaces;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.exception.MarvelException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICrudAlias {
    Response getObjectById(@PathParam("id") String id) throws MarvelException;
    public Response getAll() throws MarvelException;
    public Response addObject(AliasDTO aliasDTO) throws MarvelException;
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException;

}
