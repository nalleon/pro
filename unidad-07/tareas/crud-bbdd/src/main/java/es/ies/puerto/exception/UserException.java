package es.ies.puerto.exception;

public class UserException extends Exception{
    public UserException (String message){
        super(message);
    }

    public UserException (String message, Throwable type){
        super(message, type);
    }
}
