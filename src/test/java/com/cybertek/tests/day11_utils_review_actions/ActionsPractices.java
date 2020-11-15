package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void hover_over_test(){
        // TC	#15:	Hover	Test
        // 1.Go	to	http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        // 2.Hover	over	to	first	image
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));
        //3.Assert:
        //a.“name:	user1”	is	displayed

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));


        //4.Hover	over	to	second	image
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[2]"));

        //   5.Assert:
        //       a.“name:	user2”	is	displayed
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));



        //   6.Hover	over	to	third	image
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[3]"));


        //   7.Confirm:
        //       a.“name:	user3”	is	displayed
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));


        //#1-Create the instance of actions class, and pass the driver instance into the constructor
        Actions actions = new Actions(Driver.getDriver());

        //2
        BrowserUtils.wait(2);
        actions.moveToElement(img1).perform();

        //3
        Assert.assertTrue(user1.isDisplayed(),"user1 is NOT displayed!FAILED!");

        //moving to img2
        BrowserUtils.wait(2);
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed(),"user2 is NOT displayed!FAILED!!");

        //moving to img3
        BrowserUtils.wait(2);
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed(),"user3 is NOT displayed!FAILED!!!");


    }
}
