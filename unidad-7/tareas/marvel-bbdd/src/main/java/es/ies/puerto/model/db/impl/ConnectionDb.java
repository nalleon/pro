package es.ies.puerto.model.db.impl;

import es.ies.puerto.exception.MyException;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {
    private Connection con;
    private String url;
    private String user;
    private String password;

    /**
     * Constructor of the class
     * @param url of the db
     */

    public ConnectionDb(String url) throws MyException {
        super();
        this.url = "jdbc:sqlite:"+url;
    }

    /**
     * Constructor of the class
     * @param url of the db
     * @param user of the db
     * @param password of the db
     */

    public ConnectionDb(String url, String user, String password) throws MyException {
        super();
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws MyException {
        try{
            Class.forName("org.sqlite.JDBC");
            this.con = DriverManager.getConnection(url);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            throw new MyException("Could not establish connection with the database", exception);
        }
        return con;
    }
}
