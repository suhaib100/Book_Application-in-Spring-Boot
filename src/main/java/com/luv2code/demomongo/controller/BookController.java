package com.luv2code.demomongo.controller;

import com.luv2code.demomongo.entity.BookEntity;
import com.luv2code.demomongo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookEntity> getAllBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/{id}")
    public BookEntity getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity book) {
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable String id, @RequestBody BookEntity updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/by-author")
    public List<BookEntity> getBooksByAuthor(@RequestParam String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/by-title")
    public List<BookEntity> getBooksByTitle(@RequestParam String title) {
        return bookService.getBooksByTitle(title);
    }


    @GetMapping("/by-author-title")
    public List<BookEntity> getBooksByAuthorAndTitle(
            @RequestParam("author") String author,
            @RequestParam("title") String title) {
        return bookService.getBooksByAuthorAndTitle(author, title);
    }

}
