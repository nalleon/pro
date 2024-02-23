package ies.puerto;

/**
 * Crea una clase Libro con las propiedades titulo, autor y añoPublicacion. Crea objetos de esta clase y realiza
 * operaciones como imprimir la información del libro, cambiar el autor, etc.
 * @author Nabil
 */
public class Libro {
private String titulo;
private String autor;
private int anioPublicacion;

    /**
     * Constructor por defecto de la clase.
     */
    public Libro (){}

    /**
     * Constructor de la clase con todos sus parametros
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String imprimir(){
        String resultado = "";
        resultado ="Titulo:"+titulo+", Autor:"+autor+", Anio de publicacion:"+anioPublicacion;
        return resultado;
    }
}

