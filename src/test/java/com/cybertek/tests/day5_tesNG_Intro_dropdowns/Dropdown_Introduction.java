package com.cybertek.tests.day5_tesNG_Intro_dropdowns;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        // 1.Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void go(){

    }

    @Test
    public void dropdown_test1() throws InterruptedException {


        // 3.Verify “Simple dropdown” default selected value is correctExpected:
        //                                                                  “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualResult = simpleDropdown.getFirstSelectedOption().getText();//return type is Web element
        String expectedSelectedOption= "Please select an option";

        Assert.assertEquals(actualResult,expectedSelectedOption);

        simpleDropdown.selectByVisibleText("Option 2");
        Thread.sleep(3000);

        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”



    }
}
