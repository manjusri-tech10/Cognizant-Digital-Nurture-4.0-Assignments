package com.cognizant.springlearn.repository;

import com.cognizant.springlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Find countries containing a substring (case-insensitive)
    List<Country> findByNameContainingIgnoreCase(String keyword);

    // 2. Find and sort countries containing a substring (ascending order by name)
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String keyword);

    // 3. Find countries starting with a specific letter
    List<Country> findByNameStartingWith(String prefix);
}
