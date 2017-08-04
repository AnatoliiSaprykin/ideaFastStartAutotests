package net.promx.sys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sys_clickAndWait {
	
	
	public static WebElement waitForElementPresent(WebDriver driver, final By by, int timeOutInSeconds) {

        WebElement element; 

        try{
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait() 

            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
            element = wait.until(ExpectedConditions.presenceOfElementLocated(by));

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //reset implicitlyWait
            return element; //return the element
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null; 
    }

}
