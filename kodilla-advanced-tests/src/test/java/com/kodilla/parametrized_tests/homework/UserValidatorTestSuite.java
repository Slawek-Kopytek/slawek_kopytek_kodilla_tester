package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource (strings = {"q", "we", "rt", "y1"})
    public void shouldReturnFalseIfStringIsLessThanThreeChars(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"qwe", "rty1", "12345", "R23w"})
    public void shouldReturnTrueIfStringIsMoreThanThreeChars(String username){
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"po#", "=*j", "$%^s", "p1i&*"})
    public void shouldReturnFalseIfStringHasSpecialSigns(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"j.nowak@gmail.de", "we10@12345.pl"})
    public void shouldReturnTrueIfEmailHasMoreThanOneAndLessThanSixChars(String mail){
        assertTrue(validator.validateEmail(mail));
    }

    @ParameterizedTest
    @ValueSource (strings = {"!qwerty@gmail.com", "wpmail@tle(n.pl", "o2@wp.d*e"})
    public void shouldReturnFalseIfEmailHasSpecialSigns(String mail){
        assertFalse(validator.validateEmail(mail));
    }

    @ParameterizedTest
    @ValueSource (strings = {"qwerty@gmailcom", "jan.kowalski@gmailcom"})
    public void shouldReturnFalseIfEmailIsWithoutDomainDot(String mail){
        assertFalse(validator.validateEmail(mail));
    }

    @ParameterizedTest
    @ValueSource (strings = {"qwerty@gmail.comcomc", "jan.kowalski@gmail."})
    public void shouldReturnFalseIfEmailHasMoreThanSixDomainCharsAndEmptyDirectional(String mail){
        assertFalse(validator.validateEmail(mail));
    }
}