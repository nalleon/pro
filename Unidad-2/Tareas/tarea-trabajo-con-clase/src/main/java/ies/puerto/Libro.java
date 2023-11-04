package ies.puerto;

public class Libro {
private String titulo;
private String autor;
private int anioPublicacion;

    /**
     * Constructor por defecto de la clase.
     */
    public Libro (){}

    /**
     * Constructor de la clase
     * @param titulo del libro
     */
    public Libro (String titulo){
        this.titulo=titulo;
    }
    /**
     * Constructor de la clase
     * @param titulo del libro
     * @param autor del libro
     */
    public Libro (String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    /**
     * Constructor de la clase
     * @param titulo del libro
     * @param autor del libro
     * @param anioPublicacion del libro
     */
    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }
    /**
     * Getters/Setters de la clase
     */

    public String imprimir(){

        return "Titulo:" + titulo + "Autor" + autor + "Anio de publicacion" + anioPublicacion;
    }
}

