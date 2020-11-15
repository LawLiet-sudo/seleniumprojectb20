package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_CybertekForgotPassword {
    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        // a. “Home” link
        //using the text of the anchor tag to locate a
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']") );

        //using href @(attribute) value
       // WebElement homeAttribute = driver.findElement(By.xpath("//a[@href='/']"));

        // b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        // d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

        // e. “Retrieve password” button
       // WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button.radius"));

        // f. “Powered by Cybertek School” text
        WebElement poweredByDiv = driver.findElement(By.xpath("//div[.='Powered by Cybertek School']"));
        System.out.println(poweredByDiv.getText());

        // 4. Verify all WebElements are displayed.
        //.isDisplayed --> returns true if given web element is displayed
        //.isDisplayed --> returns false if given web element is not displayed
        if(homeLink.isDisplayed()&& emailLabel.isDisplayed()
            && emailInput.isDisplayed() &&retrievePasswordButton.isDisplayed()&&poweredByDiv.isDisplayed()){
            System.out.println("ALL WEB ELEMENTS ");
        }else{

        }
        // Better if you do with both XPATHand CSSselector for practice purposes
    }
}
