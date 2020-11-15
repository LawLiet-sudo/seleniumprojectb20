package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {
WebDriver driver;
    @Test
    public void uploading_file() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/upload");

        BrowserUtils.wait(2);

        String path = "C:\\Users\\Azamat\\Downloads\\image (2).png";
        WebElement searchFile = driver.findElement(By.id("file-upload"));
        BrowserUtils.highlightElement(driver, searchFile);
        BrowserUtils.wait(2);
        searchFile.sendKeys(path);

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        BrowserUtils.highlightElement(driver,uploadButton);
        BrowserUtils.wait(2);
        uploadButton.click();


    }
}
