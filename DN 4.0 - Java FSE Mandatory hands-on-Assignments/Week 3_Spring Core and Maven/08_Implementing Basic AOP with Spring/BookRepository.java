package com.library.repository;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;
@Repository  
public class BookRepository {
    public List<String> getBooks() {
        return Arrays.asList("Spring Boot", "Effective Java", "Clean Code");
    }
}
