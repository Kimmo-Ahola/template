package com.example.unit_tests_tdd.service;

import com.example.unit_tests_tdd.model.Author;
import com.example.unit_tests_tdd.repository.AuthorRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AuthorService {
    private final AuthorRepository authorRepository;

    public void save(Author author) {
        authorRepository.save(author);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
