package com.cybertek.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
/*
TC#4:	Google	search
	1- open a chrome	browser
	2- Go	to:	https://google.com
	3- Write	“apple”	in	search	box
	4- Click	google	search	button
	5- Verify	title:
	Expected:	Title	should	start	with	“apple" word
 */
    public static void main(String[] args) {
//setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open chrome browser
         WebDriver driver = new ChromeDriver();

         driver.get("https://google.com");

         //I need to locate the search box and write there+hit enter

        driver.findElement(By.name("q") ).sendKeys("apple"+ Keys.ENTER);

        String expectedResult = "apple - Google Search";
        String actualResult = driver.getTitle();

        if (actualResult.equals(expectedResult)){
            System.out.println("Search title verification PASSED");
        }else{
            System.out.println("Search title verification FAILED!!!");
        }





    }
}
