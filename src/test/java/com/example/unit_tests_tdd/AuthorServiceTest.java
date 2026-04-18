package com.example.unit_tests_tdd;

import com.example.unit_tests_tdd.model.Author;
import com.example.unit_tests_tdd.repository.AuthorRepository;
import com.example.unit_tests_tdd.service.AuthorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class AuthorServiceTest {
    @Autowired
    AuthorService authorService;
    @Autowired
    AuthorRepository authorRepository;
    Author author;
    @BeforeEach
    void setUp() {
        author = new Author("Kimmo", "Ahola", "test@email.se", null);
        authorService.save(author);
    }

    @AfterEach
    void tearDown() {
        authorRepository.deleteAll();
    }


    @Test
    void canFindAllAuthors() {
        List<Author> allAuthors = authorService.findAll();

        assertEquals(1, allAuthors.size());
    }
}
