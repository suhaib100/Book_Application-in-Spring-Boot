package com.luv2code.demomongo.service;

import com.luv2code.demomongo.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookEntity> getAllBooks();

    BookEntity getBookById(String id);

    BookEntity createBook(BookEntity book);

    BookEntity updateBook(String id, BookEntity updatedBook);

    void deleteBook(String id);

    List<BookEntity> getBooksByAuthor(String author);

    List<BookEntity> getBooksByTitle(String title);

    public List<BookEntity> getBooksByAuthorAndTitle(String author, String title);


}
