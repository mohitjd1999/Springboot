package com.api.book.restapibook.doa;

import org.springframework.data.repository.CrudRepository;

import com.api.book.restapibook.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
    public Book findById(int id);
}
