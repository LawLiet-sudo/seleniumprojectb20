package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    WebDriver driver;

    /*
     TC#7: Cybertek “month”dropdown default value
    1.Open browser
    2.Go to website: http://practice.cybertekschool.com/dropdowns
    3.Verify default value is always showing the current month
    Expected: If currently in June, should show June selected.
     */
    @BeforeMethod
    public void setupMethod() {
        //open a new browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void p7_month_dropdown_default_value_test() {
        //locating the month dropdown
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        //expected
        String expectedValue = LocalDateTime.now().getMonth().name();
        //Actual
        String actualValue = monthDropdown.getFirstSelectedOption().getText();
        //Assert
        Assert.assertEquals(actualValue.toLowerCase(), expectedValue.toLowerCase());


        //  TC#8: Cybertek “month”dropdown list of default values verification
        // 1.Do both verifications in the same test
        // 2.Verify list of months are correct as expected.
        // Expected: Options should contain all 12 months of the year

        //this line gets all of the options from the dropdown and store the value in a list
        List<WebElement> actualMonthOptions = monthDropdown.getOptions();

        ///Creating a list of strings to store months
        List<String> expectedMonthOption = Arrays.asList("January","February","March","April","May","June",
                "Juy","August","September", "October","November", "December");

        //create new list of string called: actualMonthsTexts, to store the texts of web element.
        List<String> actualMonthsTexts = new ArrayList<>();

        for (WebElement each : actualMonthOptions){
            actualMonthsTexts.add(each.getText());
        }

        //Passing List into assertions
        //First it will check the size, then it will check the content
        Assert.assertEquals(actualMonthOptions, expectedMonthOption);


    }
    }

