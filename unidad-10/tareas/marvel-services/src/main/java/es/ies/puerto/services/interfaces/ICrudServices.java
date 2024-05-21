package es.ies.puerto.services.interfaces;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.entidades.Alias;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICrudServices {
    Response getObjectById(@PathParam("id") String id) throws MarvelException;
    public Response getAll() throws MarvelException;
    public Response addObject(Object object) throws MarvelException;
    public Response deleteObjectById(@PathParam("id") String id) throws MarvelException;
    public Response getObjectXml(@PathParam("id") String id) throws MarvelException;


}