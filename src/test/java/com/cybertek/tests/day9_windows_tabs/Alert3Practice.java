package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert3Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
        /*
    TC #3: Information alert practice
    1. Open browser
    2. Go to website: http://practice.cybertekschool.com/javascript_alerts
    3. Click to “Click for JS Prompt” button
    4. Send “hello” text to alert
    5. Click to OK button from the alert
    6. Verify “You entered: hello” text is displayed.
     */


    @Test
    public void p3_prompt_alert_practice(){
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlertButton.click();

        //Using Alert class to handle alert
        Alert alert = driver.switchTo().alert();

        String input = "smth is going on";

        //sending keys to "prompt" alert
        alert.sendKeys(input);
        BrowserUtils.wait(2);

        //accepting th alert
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));

        Assert.assertTrue(resultText.isDisplayed(),"The result text is not displayed, Verification Failed!");

        //verify that the result text contains the input

        String actual = resultText.getText();
        Assert.assertTrue(actual.contains(input),"The result does not contain the input, ver failed");
    }
}
