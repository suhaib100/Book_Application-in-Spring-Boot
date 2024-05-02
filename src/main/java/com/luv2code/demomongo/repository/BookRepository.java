package com.luv2code.demomongo.repository;

import com.luv2code.demomongo.entity.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<BookEntity, String> {
    List<BookEntity> findByAuthor(String author);

    List<BookEntity> findByTitle(String title);

    List<BookEntity> findByAuthorAndTitle(String author, String title);

}
