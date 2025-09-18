package com.sharim.BookApplication.Book_Application.Repository;

import com.sharim.BookApplication.Book_Application.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {


    public Book findBookByTitle(String title);
}
