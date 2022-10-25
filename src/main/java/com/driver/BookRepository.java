package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public BookRepository(){
        
    }

    Book save(Book book){
        return null;
    }

    Book findBookById(int id){

        return null;
    }

    List<Book> findAll(){
        return null;
    }

    void deleteBookById(int id){
        return;
    }

    void deleteAll(){
        return;
    }

    List<Book> findBooksByAuthor(String author){
        return null;
    }

    List<Book> findBooksByGenre(String genre){
        return null;
    }
}
