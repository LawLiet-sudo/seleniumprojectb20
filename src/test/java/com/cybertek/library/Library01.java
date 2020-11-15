package com.cybertek.library;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Library01 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod () {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }

    @Test
    public void AC7()throws Exception{
        WebElement userInputBox = driver.findElement(By.id("inputEmail"));
        BrowserUtils.highlightElement(driver, userInputBox);
        userInputBox.sendKeys("student32@library");


        WebElement passwordInputBox = driver.findElement(By.id("inputPassword"));
        BrowserUtils.highlightElement(driver,passwordInputBox);
        passwordInputBox.sendKeys("GYLemAba");

        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();

        BrowserUtils.wait(3);

        WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("Harry Potter");

        BrowserUtils.wait(3);

        WebElement borrowBook = driver.findElement(By.xpath("//a[@onclick='Books.borrow_book(1871)']"));
        borrowBook.click();



    }
}
