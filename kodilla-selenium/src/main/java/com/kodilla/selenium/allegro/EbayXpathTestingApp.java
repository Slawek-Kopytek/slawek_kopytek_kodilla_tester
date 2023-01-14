package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EbayXpathTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.id("gh-cat"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("625");

        WebElement acceptField = driver.findElement(By.cssSelector("input[type*='submit']"));
        acceptField.submit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainContent")));
        List<WebElement> element = driver.findElements(By.cssSelector("ul >li"));
        element.stream()
                .forEach(ele -> System.out.println(ele.getText()));
    }
}
