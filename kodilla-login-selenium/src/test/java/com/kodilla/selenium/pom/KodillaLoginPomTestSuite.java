package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KodillaLoginPomTestSuite {

    KodillaLoginPom loginPom;

    @BeforeEach
    public void setup() {
        loginPom = new KodillaLoginPom();
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {

    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {

    }

    @AfterEach
    public void testDown() {
        loginPom.close();
    }
}