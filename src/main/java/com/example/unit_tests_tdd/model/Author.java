package com.example.unit_tests_tdd.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Entity
@NoArgsConstructor
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255, name = "first_name")
    private String firstName;
    @Column(nullable = false, length = 255, name = "last_name")
    private String lastName;

    @Column(nullable = false, length = 255, name = "email", unique = true)
    private String email;

    @Column(nullable = true, length = 255, name = "nullable_field")
    private String nullableField;

    public Optional<String> getNullableField() {
        return Optional.ofNullable(nullableField);
    }

    public Author(String firstName, String lastName, String email, String nullableField) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nullableField = nullableField;
    }
}
