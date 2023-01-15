package com.kodilla.selenium.pom.homework;

import com.google.common.base.Strings;
import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTestSuite {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Business", "Powerful"})
    public void resultShouldBeZero(String value){
        assertEquals(0, storePom.search(value).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"School", "Brand", "Gaming"})
    public void resultShouldBeOne(String value){
        assertEquals(1, storePom.search(value).size());
    }

    @Test
    public void resultShouldBeTwo(){
        assertEquals(2, storePom.search("Notebook").size());
    }

    @Test
    public void resultShouldBeTwoWithDifferentSizeOfLetters(){
        assertEquals(2, storePom.search("noTEBOok").size());
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }

}