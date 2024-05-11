package es.ies.puerto.config;

import es.ies.puerto.exception.MarvelException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    public AppConfig() throws MarvelException {

    }

    public String getUrlBd() {
        return urlBd;
    }
}
