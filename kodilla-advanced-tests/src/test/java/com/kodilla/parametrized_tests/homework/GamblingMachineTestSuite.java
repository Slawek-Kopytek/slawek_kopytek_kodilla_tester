package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/randomInvalidNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenNumbersAreInvalid(String input){
        String[] arrayOfNumbers = input.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(arrayOfNumbers));
        Set<Integer> invalidNumbers = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/randomCorrectNumbers.csv", numLinesToSkip = 1)
    public void shouldPassWithCorrectNumbers (String input) throws InvalidNumbersException{
        String[] arrayOfNumbers = input.split(",");
        Set<String> setNumbers = new HashSet<>(Arrays.asList(arrayOfNumbers));
        Set<Integer> correctNumbers = setNumbers
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        int result = gamblingMachine.howManyWins(correctNumbers);
        System.out.println(result);
        assertTrue(result >= 0 && result <= 6);
    }

}