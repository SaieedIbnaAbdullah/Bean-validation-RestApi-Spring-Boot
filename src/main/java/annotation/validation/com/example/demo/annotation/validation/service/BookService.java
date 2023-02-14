package annotation.validation.com.example.demo.annotation.validation.service;

import annotation.validation.com.example.demo.annotation.validation.entity.BookEntity;
import annotation.validation.com.example.demo.annotation.validation.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity addNewBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }
}
