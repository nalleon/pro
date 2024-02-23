package es.ies.puerto.modelo.entity;

import java.util.Objects;

public class LibroEntity {
    private String isbn;
    private String title;
    private String author;
    private String publicationDate;
    private int idBiblioteca;

    public LibroEntity (){}

    public LibroEntity(String isbn) {
        this.isbn = isbn;
    }

    public LibroEntity(String isbn, String title, String author, String publicationDate, int idBiblioteca) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.idBiblioteca = idBiblioteca;
    }

    /**
     * getters and setters
     */
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibroEntity that = (LibroEntity) o;
        return Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "LibroEntity{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
