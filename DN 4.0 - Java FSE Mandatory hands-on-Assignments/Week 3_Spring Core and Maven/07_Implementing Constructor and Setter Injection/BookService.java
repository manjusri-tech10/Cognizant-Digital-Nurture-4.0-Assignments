package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
    private String serviceName;
    private BookRepository bookRepository;
    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
    }
    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void showBooks() {
        System.out.println(serviceName + ": Showing available books...");
        for (String book : bookRepository.getBooks()) {
            System.out.println("📕 " + book);
        }
    }
}
