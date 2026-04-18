package com.example.unit_tests_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator Tests")
public class CalculatorTest {
    private static final double DELTA = 0.001;
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two numbers")
    void addTwoNumbers() {
        // Arrange
        double firstNumber = 1;
        double secondNumber = 2;

        // Act
        double result = calculator.add(firstNumber,secondNumber);

        // Assert
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Adding two decimal numbers")
    void addTwoDecimalNumbers() {
        double firstNumber = 0.1;
        double secondNumber = 0.2;
        double result = calculator.add(firstNumber,secondNumber);

        assertEquals(0.3, result, DELTA);
    }
}
