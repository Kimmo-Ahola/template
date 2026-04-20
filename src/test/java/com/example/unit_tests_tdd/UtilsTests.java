package com.example.unit_tests_tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {
    // Vi kan skicka in flera textsträngar till samma test med
    // ParameterizedTest
    @ParameterizedTest
    @CsvSource({
            "kimmo, Kimmo",
            "123,   123",
            "LARS,  Lars",
    })
    void capitalizesFirstLetter(String input, String expected) {
        assertEquals(expected, Utils.capitalize(input));
    }

    @Test
    void capitalizeCanHandleNull(){
        assertEquals("", Utils.capitalize(null));
    }

    @Test
    void capitalizeCanHandleEmptyString(){
        assertEquals("", Utils.capitalize(""));
    }
}