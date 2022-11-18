package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnTrueIfStringHasOnlySpaces(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}