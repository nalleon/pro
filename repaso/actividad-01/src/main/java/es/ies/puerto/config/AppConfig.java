package es.ies.puerto.config;

import es.ies.puerto.exception.ShopException;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author nalleon
 */
public class AppConfig {
    private String nameBd;
    String urlBd;
    public AppConfig() throws ShopException {
        Properties properties = new Properties();

        URL urlApp = AppConfig.class.getClassLoader().getResource("app.properties");
        try (FileInputStream fis = new FileInputStream(urlApp.getPath())) {
            properties.load(fis);
            nameBd = (String) properties.get("nameBd");
        } catch(Exception e){
            throw new ShopException("Error while reading the file path of the database: "+e.getMessage());
        }
    }

    public String getUrlBd() {
        if (urlBd == null) {
            URL resource = AppConfig.class.getClassLoader().getResource(nameBd);
            urlBd = resource.getPath();
        }
        return urlBd;
    }
}
