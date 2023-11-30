package ies.puerto;

public class MyException extends Exception {
    private int errorCode;
    public  MyException (){}

    public MyException(int errorCode){
        this.errorCode = errorCode;
    }

    public MyException (String message){
        super(message);
    }

    public MyException(int code, String message){
        super(message);
        this.errorCode = code;
    }
}
