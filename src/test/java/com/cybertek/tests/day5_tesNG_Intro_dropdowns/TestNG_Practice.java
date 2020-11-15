package com.cybertek.tests.day5_tesNG_Intro_dropdowns;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @Test
    public void google_title_verification(){
        //1- go to google
        driver.get("https://www.google.com/");

        //2- verify title is google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle, "Title are NOT matching!");



    }

    @Test
    public void google_search_title_verification(){
        //go to google

        // search apple
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        // make sure title contains apple
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title does not contain search value");

    }

    @AfterMethod
    public void teardownMethod()throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
