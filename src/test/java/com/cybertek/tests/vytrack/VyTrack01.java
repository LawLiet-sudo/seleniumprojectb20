package com.cybertek.tests.vytrack;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack01 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/");


        WebElement userInputBox = driver.findElement(By.id("prependedInput"));
        userInputBox.sendKeys("user182");
        Thread.sleep(3000);

        WebElement passwordInputBox = driver.findElement(By.id("prependedInput2"));
        passwordInputBox.sendKeys("UserUser123");
        Thread.sleep(3000);

        driver.findElement(By.id("_submit")).click();
        Thread.sleep(3000);

//fleet
        driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        Thread.sleep(2000);
//odometer
        driver.findElement(By.xpath("(//span[@class='title title-level-2'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@data-toggle='dropdown'][1]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).click();
        Thread.sleep(3000);

        












    }
}
