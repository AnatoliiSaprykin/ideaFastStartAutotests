package net.promx.sys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClickable {
	
	public static void main (WebDriver driver, By by, int timeOutInSeconds){
			
	WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
    wait.until(ExpectedConditions.elementToBeClickable(by));
	}

}
