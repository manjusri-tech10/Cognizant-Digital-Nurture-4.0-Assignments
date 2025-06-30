package com.library.repository;
import java.util.Arrays;
import java.util.List;
public class BookRepository {
    public List<String> getBooks() {
        return Arrays.asList(
            " The Alchemist by Paulo Coelho",
            " Clean Code by Robert C. Martin",
            " Effective Java by Joshua Bloch",
            " Introduction to Algorithms by Cormen et al."
        );
    }
}
