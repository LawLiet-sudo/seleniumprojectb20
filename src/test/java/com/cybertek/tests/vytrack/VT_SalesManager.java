package com.cybertek.tests.vytrack;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VT_SalesManager  {

        WebDriver driver;

        @BeforeMethod
        public void setUpMethod () {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/user/login");
        }

        @Test
    public void vehicleOdometerVerification() throws Exception{
            WebElement userInputBox = driver.findElement(By.id("prependedInput"));
            userInputBox.sendKeys("salesmanager282");
            Thread.sleep(3000);

            WebElement passwordInputBox = driver.findElement(By.id("prependedInput2"));
            passwordInputBox.sendKeys("UserUser123");
            Thread.sleep(3000);

            driver.findElement(By.id("_submit")).click();
            Thread.sleep(3000);

            //fleet
            driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]")).click();
            Thread.sleep(3000);

            //odometer
            driver.findElement(By.xpath("(//span[@class='title title-level-2'])[5]")).click();
            Thread.sleep(3000);


        }


    }

