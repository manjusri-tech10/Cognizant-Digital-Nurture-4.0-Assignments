package com.library.service;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    private BookRepository bookRepository;
    @Autowired  
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void showBooks() {
        System.out.println("BookService: Retrieving list of books...");
        for (String book : bookRepository.getBooks()) {
            System.out.println("📗 " + book);
        }
    }
}
