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
    @EmptySource //jak robie z nullem to wyskakuje błąd
    public void shouldReturnFalseIfStringIsEmpty(String username){
        assertFalse(validator.validateUsername(username));
    }

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
    @NullSource
    public void shouldReturnFalseIfEmailIsEmpty(String email){
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"!qwerty@gmail.com", "wpmail@tle(n.pl", "o2@wp.d*e"})
    public void shouldReturnFalseIfEmailHasSpecialSigns(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"qwerty@gmailcom", "jan.kowalski@gmailcom"})
    public void shouldReturnFalseIfEmailIsWithoutDomainDot(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource (strings = {"qwerty@gmailcom.com", "jan.kowalski@gmail."})
    public void shouldReturnFalseIfEmailHasMoreThanSixDomainCharsAndEmptyDirectional(String username){
        assertFalse(validator.validateUsername(username));
    }
}