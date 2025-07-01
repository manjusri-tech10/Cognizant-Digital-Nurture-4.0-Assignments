package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {    // Setter method for dependency injection
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("BookService: Retrieving list of books...");
        List<String> books = bookRepository.getBooks();
        for (String book : books) {
            System.out.println(book);
        }
    }
}
