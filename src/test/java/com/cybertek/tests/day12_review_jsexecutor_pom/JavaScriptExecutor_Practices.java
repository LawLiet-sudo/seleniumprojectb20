package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {


    @Test
    public void scroll_using_jsexecutor_1(){

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        Driver.getDriver().manage().window().maximize();

        BrowserUtils.wait(2);

        //create instance of JSExecutor and cast our driver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.wait(2);
        //use execute script method

        for (int i = 0; i < 10 ; i++) {
            BrowserUtils.wait(1);
            js.executeScript("window.scrollBy(0, 500)");
        }



    }

    @Test
    public void scroll_using_jsexecutor2() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        //locating cybertek school link
        BrowserUtils.wait(2);
        WebElement link = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement link2 = Driver.getDriver().findElement(By.linkText("Home"));

        //use js executor to scroll 'Cybertek School' link intoView

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //user scrollIntoView function from JavaScript to scroll to a specific web element
        BrowserUtils.wait(2);
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        BrowserUtils.highlightElement(Driver.getDriver(), link);
        BrowserUtils.wait(2);

        js.executeScript("arguments[0].scrollIntoView(true)", link2);
        BrowserUtils.highlightElement(Driver.getDriver(),link2);


    }

    @Test
    public void fill_form_javascript() throws InterruptedException {
        Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

        WebElement usernameInput = Driver.getDriver().findElement(By.name("full_name"));
        WebElement emailInput = Driver.getDriver().findElement(By.name("email"));
        WebElement signUpButton = Driver.getDriver().findElement(By.name("wooden_spoon"));
        BrowserUtils.wait(2);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.highlightElement(Driver.getDriver(),usernameInput);
        js.executeScript("arguments[0].setAttribute('value', 'John Cena')", usernameInput);

        BrowserUtils.wait(2);
        BrowserUtils.highlightElement(Driver.getDriver(),emailInput);
        js.executeScript("arguments[0].setAttribute('value', 'JohnCena@Champion.com')", emailInput);

        BrowserUtils.wait(2);
        BrowserUtils.highlightElement(Driver.getDriver(),signUpButton);
        js.executeScript("arguments[0].click()", signUpButton);


    }
}

