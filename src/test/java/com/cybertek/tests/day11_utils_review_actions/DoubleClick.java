package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utility.BrowserUtils;
import com.cybertek.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {

    @Test
    public void Double_click()throws InterruptedException{
      //  TC	#16:	Double	ClickTest
        //  1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        BrowserUtils.wait(2);
        //  2.Switch	to	iframe.
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']"));
        Driver.getDriver().switchTo().frame(iframe);


        //  3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
        WebElement text = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);

        actions.doubleClick(text).perform();


        //  4.Assert:	Text’s	“style”	attribute	value	contains "red"

        WebElement redText = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));

        System.out.println(redText.toString().contains("red"));


    }
}
