package com.cybertek.tests.bitrix;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US2AC9 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void checkTasks() throws Exception {
        WebElement userInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        BrowserUtils.highlightElement(driver, userInputBox);
        userInputBox.sendKeys("helpdesk32@cybertekschool.com");

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@type='password']"));
        BrowserUtils.highlightElement(driver, passwordInputBox);
        passwordInputBox.sendKeys("UserUser");


        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        BrowserUtils.highlightElement(driver, submitButton);

        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

        // Thread.sleep(2000);


        wait.until(ExpectedConditions.titleContains("Portal"));

        //System.out.println(driver.getTitle());


        //locating "Tasks" module

        WebElement taskModule = driver.findElement(By.xpath("(//span[@class='menu-item-link-text'])[2]"));
        BrowserUtils.highlightElement(driver, taskModule);
        taskModule.click();


        //new task
        WebElement newTask = driver.findElement(By.xpath("//a[@class='ui-btn-main']"));
        BrowserUtils.highlightElement(driver, newTask);
        newTask.click();
        Thread.sleep(2000);

        //locating and switching to frame in new task
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='/company/personal/user/522/tasks/task/edit/0/?IFRAME=Y&IFRAME_TYPE=SIDE_SLIDER']"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);

        WebElement datePicker = driver.findElement(By.xpath("(//input[@data-bx-id='datepicker-display'])[1]"));
        datePicker.click();
        Thread.sleep(2000);

        WebElement date13 = driver.findElement(By.linkText("13"));
        date13.click();
        Thread.sleep(2000);

        WebElement select = driver.findElement(By.linkText("Select"));
        select.click();




    }

    @Test
    public void TEST2() {

    }
}
