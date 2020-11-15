package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {

    public static void main(String[] args) throws InterruptedException {

        //1-setup the driver

        WebDriverManager.chromedriver().setup();

        //2-create instance of the driver

        WebDriver driver = new ChromeDriver();//this line opens browser
        driver.manage().window().maximize();

        //3- user the driver instance to test selenium


        driver.get("https://www.google.com");

        System.out.println("The title of the page is: " + driver.getTitle() );

        String actualTitle = driver.getTitle();
        System.out.println("Actual title String: " + actualTitle);


        String actualUrl = driver.getCurrentUrl();
        System.out.println("actual url = " +actualUrl);

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();


        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.instagram.com");

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        Thread.sleep(3000);
        driver.close();

    }
}
