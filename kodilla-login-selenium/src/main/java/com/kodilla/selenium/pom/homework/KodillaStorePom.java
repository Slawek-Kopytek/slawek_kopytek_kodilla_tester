package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends KodillaStoreAbstract {

    @FindBy(id = "searchField")
    WebElement searchField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> search(String value) {
        searchField.sendKeys(value);
        List<WebElement> result = driver.findElements(By.className("element"));
        return result;
    }

    public void close() {
        driver.close();
    }
}
