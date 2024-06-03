package es.ies.puerto.start.model.repository;


import es.ies.puerto.start.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    // it works if it matches the book field name
    //
    List<Book> findByTitle(String title);

    // Custom Query
    // :date --> parametro de entrada
    @Query("SELECT b FROM Book b WHERE b.publishDate > :date")
    List<Book> findByPublishedDateAfter(@Param("date") LocalDate date);

}
