package es.ies.puerto.modelo;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.ShopException;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb extends AppConfig {
    private Connection con;
    private String url;
    public ConnectionDb() throws ShopException {
        super();
        this.url="jdbc:sqlite:"+getUrlBd();
    }

    public Connection getConnectionDb() throws ShopException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new ShopException("CANNOT ESTABLISH CONNECTION",
                    exception);
        }
        return con;
    }
}
