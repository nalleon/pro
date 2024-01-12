package ies.puerto.Excepciones;

/**
 * Crea un paquete excepciones con una clase ValidacionException. Utiliza esta clase
 * para lanzar y gestionar excepciones personalizadas en el paquete modelo al validar
 * atributos de la clase Persona.
 */
public class ValidacionException extends Exception {
    private String message;
    public  ValidacionException (){}

    public ValidacionException(String message) {
        super(message);
    }

}
