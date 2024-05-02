package com.luv2code.demomongo.service;

import com.luv2code.demomongo.entity.BookEntity;
import com.luv2code.demomongo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public BookEntity createBook(BookEntity book) {
        return bookRepository.save(book);
    }

    @Override
    public BookEntity updateBook(String id, BookEntity updatedBook) {
        updatedBook.setId(id);

        return bookRepository.save(updatedBook);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(id);

    }

    @Override
    public List<BookEntity> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<BookEntity> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<BookEntity> getBooksByAuthorAndTitle(String author, String title) {
        return bookRepository.findByAuthorAndTitle(author,title);
    }
}
