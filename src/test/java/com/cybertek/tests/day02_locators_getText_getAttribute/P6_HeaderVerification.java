package com.cybertek.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {


        //  TC #6: Zero Bankheader verification
        //  1.Open Chrome browser
        //  2.Go to http://zero.webappsecurity.com/login.html

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");


        //  3.Verify header textExpected: “Log in to ZeroBank”
       String actualText = driver.findElement(By.tagName("h3")).getText();//returns String

        String expectedText = "Log in to ZeroBank";
        if (actualText.equals(expectedText)){
            System.out.println("Header verification PASSED");
        }else{
            System.out.println("Header verification Failed");
        }

    }
}