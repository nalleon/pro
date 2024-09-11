package es.ies.puerto.exception;

public class ShopException extends Exception{

    public ShopException(String message) {
        super(message);
    }

    public ShopException(String message, Throwable type) {
        super(message,type);
    }
}
