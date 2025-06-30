package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting LibraryManagement Application...");

        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring context loaded successfully.");

        BookService bookService = context.getBean("bookService", BookService.class);
        System.out.println("BookService bean retrieved.");

        System.out.println("Calling showBooks() method...");
        bookService.showBooks();

        System.out.println("Application execution completed.");
    }
}
