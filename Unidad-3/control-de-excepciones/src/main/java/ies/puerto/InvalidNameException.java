package ies.puerto;

public class InvalidNameException extends Exception {
    private  int errorCode;

    public InvalidNameException (){}

    public InvalidNameException (int errorCode){
        this.errorCode = errorCode;
    }

    public InvalidNameException (String message){
        super(message);
    }
    public InvalidNameException (int code, String message){
        super(message);
        this.errorCode =  code;
    }
}
