package es.ies.puerto.service;

import es.ies.puerto.modelo.entity.Book;
import es.ies.puerto.modelo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/books/")
@Service
public class BookService {

    Logger logger = LoggerFactory.getLogger(BookService.class);
    private BookRepository bookRepository;
   @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping
    public List<Book> findAll() {
        logger.info("obtener todos los elementos");
        return bookRepository.findAll();
    }



    @GetMapping("{id}")
    public Optional<Book> findById(@PathVariable Long id) {
        logger.debug("obtener un elemento");
        return bookRepository.findById(id);
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("{id}")
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @GetMapping("fecha/{date}")
    public List<Book> findByPublishedDateAfter(LocalDate date) {
        return bookRepository.findByPublishedDateAfter(date);
    }
}
