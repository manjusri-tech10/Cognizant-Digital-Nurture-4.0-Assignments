package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
  
  // find by partial name (containing, case‑sensitive by default)
  List<Country> findByCoNameContaining(String partialName);
}
