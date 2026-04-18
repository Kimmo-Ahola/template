package com.example.unit_tests_tdd.repository;

import com.example.unit_tests_tdd.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
