package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public class KodillaStoreAbstract {
    protected WebDriver driver;

    public KodillaStoreAbstract(WebDriver driver) {
        this.driver = driver;
    }
}
