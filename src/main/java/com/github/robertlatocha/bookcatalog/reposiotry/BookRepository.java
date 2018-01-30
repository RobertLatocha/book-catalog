package com.github.robertlatocha.bookcatalog.reposiotry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.robertlatocha.bookcatalog.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
