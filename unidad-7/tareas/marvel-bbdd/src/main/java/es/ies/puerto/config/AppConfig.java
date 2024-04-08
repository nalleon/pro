package es.ies.puerto.config;

import es.ies.puerto.exception.MyException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlDb;
    public AppConfig() throws MyException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fis);
            urlDb = (String) properties.get("urlDb");
        } catch (IOException e) {
            throw new MyException(e.getMessage(), e);
        }

    }

    public String getUrlDb() {
        return urlDb;
    }
}
