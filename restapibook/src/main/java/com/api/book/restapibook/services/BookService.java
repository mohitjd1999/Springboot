package com.api.book.restapibook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.restapibook.doa.BookRepository;
import com.api.book.restapibook.entities.Book;

@Service
public class BookService {
    
    //Fake Services
    // private static List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(10, "The Wings of Fire", "ABC"));
    //     list.add(new Book(50, "Rich and Poor", "XYZ"));
    //     list.add(new Book(1234, "EsioTrot", "LMN"));
    // }   

    // //get all books
    // public List<Book> getAllBooks(){
    //     return list;
    // }

    // //get single book by Id
    // public Book getBookById(int id){
    //     Book book = null;
    //     try{
    //         book = list.stream().filter(e-> e.getId() == id).findFirst().get();
    //     } catch(Exception e){
    //         e.printStackTrace();
    //     }
        
    //     return book;
    // }

    // // add book using post
    // public Book addBook(Book book){
    //      list.add(book);
    //      System.out.println(book);
    //      return book;
    // }
   
    // // delete book by id
    // public void deleteBook(int id){
    //     list = list.stream().filter(e-> e.getId() != id).collect(Collectors.toList());
    // }

    // // update book by id
    // public void updateBook(Book book, int id){
    //     list = list.stream().map(books -> {
    //         if(books.getId() == id){   
    //            books.setTitle(books.getTitle());
    //            books.setAuthor(books.getAuthor());
    //         }
    //         return books;
    //     }).collect(Collectors.toList());
    // }

    @Autowired
    public BookRepository bookRepository;

    // get all books
    public List<Book> getAllBooks(){
        List<Book> list =(List<Book>)this.bookRepository.findAll();
        return list;
    }

    // get single book By Id
    public Book getBookById(int id){
       Book book = null;
       try{
         book = this.bookRepository.findById(id);
       }catch(Exception e){
        e.printStackTrace();
       }

       return book;
    }

    // add a book 
    public Book addBook(Book b){
       return this.bookRepository.save(b);
    }

    // delete a book
    public void deleteBook(int id){
        this.bookRepository.deleteById(id);
    }

    // update a book
    public void updateBook(Book book, int id){
        book.setId(id);
        this.bookRepository.save(book);
    }
}
