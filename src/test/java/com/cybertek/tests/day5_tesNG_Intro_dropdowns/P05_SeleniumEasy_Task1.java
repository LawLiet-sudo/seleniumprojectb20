package com.cybertek.tests.day5_tesNG_Intro_dropdowns;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {
    public static void main(String[] args)throws InterruptedException {

        //TC#2:	SeleniumEasy	CheckboxVerification–Section1
        // 1.Open	Chrome	browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //Locate the success message and checkbox under 'single checkbox demo'
        WebElement successCheckBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        //locate the success message
        //create a locator to success message and share it in class-chat
        //  //div[@style='display: block;']
        //  //div[.='Success - Check box is checked']
        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        // 3.Verify	“Success–Check	box	is	checked”message	is	NOT displayed.
        if (!successMessage.isDisplayed()){
            System.out.println("Success Message is not displayed, Verification Passed!");
        }else{
            System.out.println("Success Message is displayed, Verification FAILED!!!");
        }

        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section
        successCheckBox.click();

        // 5.Verify	“Success	–Check	box	is	checked”	message	is displayed.
        if (successMessage.isDisplayed()){
            System.out.println("Success Message is  displayed, Verification Passed!");
        }else{
            System.out.println("Success Message is NOT displayed, Verification FAILED!!!");
        }
        Thread.sleep(5000);
        driver.close();
    }
}
