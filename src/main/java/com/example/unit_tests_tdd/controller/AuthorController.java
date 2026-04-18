package com.example.unit_tests_tdd.controller;

import com.example.unit_tests_tdd.model.Author;
import com.example.unit_tests_tdd.repository.AuthorRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Data
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        if (authorRepository.findAll().isEmpty()) {
            authorRepository.save(new Author("Kimmo", "Ahola", "kimmo@test.se", null));
        }
        List<Author> authors = authorRepository.findAll();
        model.addAttribute("authors", authors);
        return "index";
    }
}
