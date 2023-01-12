package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayXpathTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        inputField.sendKeys("mavic mini");

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("625");

        WebElement acceptField = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        acceptField.submit();
    }
}
