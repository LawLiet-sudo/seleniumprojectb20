package com.cybertek.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

//this class stores utility methods that can be applied to any browser content.
public class BrowserUtils {
    /**
    Accepts a list of Web Element
    @param list <WebElement>
    @return List <String>
     */
    public static List<String> getElementsText(List<WebElement> list){

        List<String> WebElementsAsString = new ArrayList<>();
        for (WebElement each : list){
            WebElementsAsString.add(each.getText());
        }
        return WebElementsAsString;
    }
     /*
    Create a utility method named: wait
    static method
    @param sec
    @return void
    The integer number that I pass as parameter should be accepted as SECONDS
    Handle checked exception with try/catch
     */

    public static void wait(int sec){
        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception caught");
        }
    }

    public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 6px solid green;')",element);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.getMessage();
        }
        js.executeScript("arguments[0].setAttribute('style', 'border: solid 2px white')",element);
        Thread.sleep(1000);
    }



}
