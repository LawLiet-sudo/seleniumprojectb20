package com.cybertek.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {


    public static void main(String[] args) throws InterruptedException {
        String URL = "https://qa2.vytrack.com/user/login";
        String userName = "user182";
        String password = "UserUser123";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();

    }
}

