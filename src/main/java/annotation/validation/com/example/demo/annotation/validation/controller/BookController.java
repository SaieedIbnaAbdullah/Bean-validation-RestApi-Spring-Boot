package annotation.validation.com.example.demo.annotation.validation.controller;

import annotation.validation.com.example.demo.annotation.validation.dto.BookDto;
import annotation.validation.com.example.demo.annotation.validation.entity.BookEntity;
import annotation.validation.com.example.demo.annotation.validation.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public BookEntity dtoToEntity(BookDto bookDto){
        BookEntity bookEntity = new BookEntity();
        bookEntity.setBook_name(bookDto.getBook_name());
        bookEntity.setPrice(bookDto.getPrice());
        bookEntity.setAhthor_name(bookDto.getAhthor_name());
        return bookEntity;
    }

    @PostMapping
    public BookEntity addBook(@Valid @RequestBody BookDto bookDto){
        return bookService.addNewBook(dtoToEntity(bookDto));
    }
}
