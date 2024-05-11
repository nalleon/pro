package es.ies.puerto.modelo.db;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.MarvelException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion extends AppConfig {
    private Connection con;

    private String url;

    public Conexion() throws MarvelException {

    }


    public Connection getConexion() throws MarvelException {
        return null;
    }
}
