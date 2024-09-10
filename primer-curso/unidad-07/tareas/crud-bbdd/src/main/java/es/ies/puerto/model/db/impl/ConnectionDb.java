package es.ies.puerto.model.db.impl;
import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.UserException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb extends AppConfig {
    private Connection con;
    private String url;
    private String user;
    private String password;

    /**
     * Constructor of the class
     * @param url of the db
     */

    public ConnectionDb(String url) throws UserException {
        super();
        this.url = "jdbc:sqlite:"+url;
    }

    /**
     * Constructor of the class
     * @param url of the db
     * @param user of the db
     * @param password of the db
     */

    public ConnectionDb(String url, String user, String password) throws UserException {
        super();
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws UserException {
        try{
            Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(url);
        } catch (Exception exception){
           System.out.println(exception.getMessage());
            throw new UserException("Could not establish connection with the database", exception);
        }
        return con;
    }

}
