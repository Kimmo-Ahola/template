package com.example.unit_tests_tdd;

import lombok.Data;

@Data
public class Calculator {
    private double a;
    private double b;

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}
