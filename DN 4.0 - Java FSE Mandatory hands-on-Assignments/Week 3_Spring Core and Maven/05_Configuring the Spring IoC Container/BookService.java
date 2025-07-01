package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private BookRepository bookRepository;
    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void showBooks() {
        System.out.println("BookService: Retrieving list of books...");
        for (String book : bookRepository.getBooks()) {
            System.out.println("📘 " + book);
        }
    }
}
