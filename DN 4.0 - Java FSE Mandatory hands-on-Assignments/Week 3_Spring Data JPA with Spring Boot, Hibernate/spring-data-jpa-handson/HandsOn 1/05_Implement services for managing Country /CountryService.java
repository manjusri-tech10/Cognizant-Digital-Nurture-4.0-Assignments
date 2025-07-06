package com.example.country.service;
import com.example.country.entity.Country;
import com.example.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Optional<Country> findByCode(String code) {
        return countryRepository.findById(code);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, String newName) {
        Country country = countryRepository.findById(code)
            .orElseThrow(() -> new RuntimeException("Country not found"));
        country.setCoName(newName);
        return countryRepository.save(country);
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchByNamePart(String namePart) {
        return countryRepository.findByCoNameContainingIgnoreCase(namePart);
    }
}
