package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryRepository countryRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryRepository = context.getBean(CountryRepository.class);

        testFindByNameContainingIgnoreCase();
        testFindByNameContainingIgnoreCaseOrderByNameAsc();
        testFindByNameStartingWith();
    }

    private static void testFindByNameContainingIgnoreCase() {
        LOGGER.info("Start: findByNameContainingIgnoreCase('ou')");
        List<Country> countries = countryRepository.findByNameContainingIgnoreCase("ou");
        for (Country c : countries) {
            LOGGER.debug("Country: {}", c);
        }
        LOGGER.info("End");
    }

    private static void testFindByNameContainingIgnoreCaseOrderByNameAsc() {
        LOGGER.info("Start: findByNameContainingIgnoreCaseOrderByNameAsc('ou')");
        List<Country> countries = countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou");
        for (Country c : countries) {
            LOGGER.debug("Country (Sorted): {}", c);
        }
        LOGGER.info("End");
    }

    private static void testFindByNameStartingWith() {
        LOGGER.info("Start: findByNameStartingWith('Z')");
        List<Country> countries = countryRepository.findByNameStartingWith("Z");
        for (Country c : countries) {
            LOGGER.debug("Country (Starts with Z): {}", c);
        }
        LOGGER.info("End");
    }
}
