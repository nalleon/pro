package es.ies.puerto.config;

import java.util.ResourceBundle;

public class ConfigProyecto {
    ResourceBundle bundle;
    public ConfigProyecto(){
        languageEs();
    }
    public void languageEs(){
        bundle = ResourceBundle.getBundle("es-config");
    }

    public void languageEn(){
        bundle = ResourceBundle.getBundle("en-config");
    }


}
